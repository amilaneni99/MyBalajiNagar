package com.example.abhinav.mybalajinagar;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.HardwarePropertiesManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    CardView complaints,messages,fop,helplines;
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
        complaints = findViewById(R.id.contact);
        dl = (DrawerLayout)findViewById(R.id.drawer);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






        complaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,Complaints.class));
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
                    Intent intent = new Intent(Home.this,Events.class);
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

}
