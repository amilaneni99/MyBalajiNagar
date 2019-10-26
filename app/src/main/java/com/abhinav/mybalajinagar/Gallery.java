package com.abhinav.mybalajinagar;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class Gallery extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator indicator;
    private GalleryAdapter galleryAdapter;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ChildEventListener childEventListener;
    private ArrayList<Image> images = new ArrayList<>();
    private ImageButton next,back;
    private ProgressBar progressBar;

    @Override
    protected void onStart() {
        super.onStart();
        progressBar.setVisibility(View.VISIBLE);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                images.clear();

                galleryAdapter.notifyDataSetChanged();

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    Image image = snapshot.getValue(Image.class);
                    images.add(image);
                }
                progressBar.setVisibility(View.GONE);
                galleryAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        progressBar = findViewById(R.id.progress2);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);
        actionBar.setTitle("Gallery");

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("gallery");

        viewPager = findViewById(R.id.viewPager_gallery);
        indicator = findViewById(R.id.indicator);
        galleryAdapter = new GalleryAdapter(images,this);
        viewPager.setAdapter(galleryAdapter);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        indicator.setViewPager(viewPager);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (viewPager.getCurrentItem() == images.size()-1) {
                    viewPager.setCurrentItem(0);
                }
                viewPager.setCurrentItem(getItem(+1), true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 10000, 10000);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(getItem(1),true);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(getItem(-1),true);
            }
        });


    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
