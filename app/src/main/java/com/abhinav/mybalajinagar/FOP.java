package com.abhinav.mybalajinagar;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import java.util.Calendar;

public class FOP extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fop);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);
        actionBar.setElevation(0);


        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        mFab = findViewById(R.id.custom_fab);

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9444301200");
            }
        });


        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Fragment_Sunday(),"Sun");
        adapter.AddFragment(new Fragment_Monday(),"Mon");
        adapter.AddFragment(new Fragment_Tuesday(),"Tue");
        adapter.AddFragment(new Fragment_Wednesday(),"Wed");
        adapter.AddFragment(new Fragment_Thursday(),"Thu");
        adapter.AddFragment(new Fragment_Friday(),"Fri");
        adapter.AddFragment(new Fragment_Saturday(),"Sat");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek){
            case 1:{
                TabLayout.Tab tab = tabLayout.getTabAt(0);
                tab.select();
            }
            break;
            case 2:{
                TabLayout.Tab tab = tabLayout.getTabAt(1);
                tab.select();
            }
            break;
            case 3:{
                TabLayout.Tab tab = tabLayout.getTabAt(2);
                tab.select();
            }
            break;
            case 4:{
                TabLayout.Tab tab = tabLayout.getTabAt(3);
                tab.select();
            }
            break;
            case 5:{
                TabLayout.Tab tab = tabLayout.getTabAt(4);
                tab.select();
            }
            break;
            case 6:{
                TabLayout.Tab tab = tabLayout.getTabAt(5);
                tab.select();
            }
            break;
            case 7:{
                TabLayout.Tab tab = tabLayout.getTabAt(6);
                tab.select();
            }
            break;
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    public void onBackPressed(){
        Intent a = new Intent(this,Home.class);
        startActivity(a);

    }

    private void call(String number) {
        try {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+number));
            ActivityCompat.requestPermissions(FOP.this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    1);
            checkCallPermission();
            if (ActivityCompat.checkSelfPermission(FOP.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling

                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            startActivity(callIntent);
        } catch (ActivityNotFoundException activityException) {
            Log.e("Calling a Phone Number", "Call failed", activityException);
        }
    }
    private boolean checkCallPermission()
    {
        String permission = Manifest.permission.CALL_PHONE;
        int res = this.checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }
}
