package com.abhinav.mybalajinagar;

import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Messages extends AppCompatActivity {
    private FirebaseDatabase mFirebaseDatabase;
    private  DatabaseReference mMessagesDatabaseReference;
    private ChildEventListener mChildEventListener;
    private MessageAdapter mMessageAdapter;
    private ListView mMessageListView;
    private ProgressBar progressBar;
    List<Message> messages = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);
        actionBar.setTitle("Messages");

        mMessageListView = findViewById(R.id.messageListView);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mMessagesDatabaseReference = mFirebaseDatabase.getReference().child("messages");
        progressBar = findViewById(R.id.progress);









    }

    @Override
    protected void onStart() {

        super.onStart();
        progressBar.setVisibility(View.VISIBLE);

        mMessagesDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                messages.clear();

                mMessageAdapter = new MessageAdapter(Messages.this, R.layout.item_message, messages);
                mMessageAdapter.notifyDataSetChanged();

                for (DataSnapshot messagesSnapshot : dataSnapshot.getChildren()){
                    Message message = messagesSnapshot.getValue(Message.class);
                    messages.add(message);
                }
                progressBar.setVisibility(View.GONE);
                mMessageAdapter.notifyDataSetChanged();
                mMessageAdapter = new MessageAdapter(Messages.this, R.layout.item_message, messages);
                mMessageListView.setAdapter(mMessageAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
