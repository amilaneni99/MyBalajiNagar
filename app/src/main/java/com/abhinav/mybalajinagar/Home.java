package com.abhinav.mybalajinagar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.FirebaseInstanceId;


public class Home extends AppCompatActivity {

    CardView gallery,messages,fop,helplines;
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        System.out.println("Home.onCreate: "+FirebaseInstanceId.getInstance().getInstanceId());


        nv = findViewById(R.id.menu);

        nv.setItemIconTintList(null);


        fop = findViewById(R.id.fop);
        messages = findViewById(R.id.notifications);
        helplines = findViewById(R.id.helplines);
        gallery = findViewById(R.id.gallery);
        dl = (DrawerLayout)findViewById(R.id.drawer);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,Gallery.class));
            }
        });

        fop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,FOP.class));
            }
        });

        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,Messages.class));
            }
        });

        helplines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,Helplines.class));
            }
        });

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.messages1)
                {
                    Intent intent = new Intent(Home.this,Messages.class);
                    startActivity(intent);
                    return true;
                }
                else if(id == R.id.helplines1)
                {
                    Intent intent = new Intent(Home.this,Helplines.class);
                    startActivity(intent);
                    return true;
                }
                else if(id == R.id.fop1)
                {
                    Intent intent = new Intent(Home.this,FOP.class);
                    startActivity(intent);
                    return true;
                }
                else if(id == R.id.complaints1)
                {
                    Intent intent = new Intent(Home.this,Complaints.class);
                    startActivity(intent);
                    return true;
                }
                else if(id == R.id.events)
                {
                    Intent intent = new Intent(Home.this,Members.class);
                    startActivity(intent);
                    return true;
                }
                else if(id == R.id.gallery)
                {
                    Intent intent = new Intent(Home.this,Gallery.class);
                    startActivity(intent);
                    return true;
                }
                else if(id == R.id.signout)
                {
                    FirebaseAuth.getInstance().signOut();
                    Intent intent = new Intent(Home.this,SignIn.class);
                    startActivity(intent);
                    return true;
                }
                else {
                    return true;
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }


}
