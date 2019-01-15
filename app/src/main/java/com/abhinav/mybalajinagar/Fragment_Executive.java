package com.abhinav.mybalajinagar;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhinav.mybalajinagar.R;

public class Fragment_Executive extends Fragment {
    View view;
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;

    public Fragment_Executive(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.executive_fragment,container,false);
        c1 = view.findViewById(R.id.m_1);
        c2 = view.findViewById(R.id.m_2);
        c3 = view.findViewById(R.id.m_3);
        c4 = view.findViewById(R.id.m_4);
        c5 = view.findViewById(R.id.m_5);
        c6 = view.findViewById(R.id.m_6);
        c7 = view.findViewById(R.id.m_7);
        c8 = view.findViewById(R.id.m_8);
        c9 = view.findViewById(R.id.m_9);
        c10 = view.findViewById(R.id.m_10);
        c11 = view.findViewById(R.id.m_11);
        c12 = view.findViewById(R.id.m_12);
        c13 = view.findViewById(R.id.m_13);
        c14 = view.findViewById(R.id.m_14);
        c15 = view.findViewById(R.id.m_15);
        c16 = view.findViewById(R.id.m_16);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9443417650");
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9788704461");
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9994270241");
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9444465111");
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9842518968");
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9003989899");
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("8610606692");
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9524790780");
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9600891026");
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9042192350");
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9524790780");
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9600860123");
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9894149808");
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("7667431298");
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9443689610");
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call("9791299005");
            }
        });
        return view;
    }

    private void call(String number) {
        try {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+number));
            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{Manifest.permission.CALL_PHONE},
                    1);
            checkCallPermission();
            if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

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
        int res = getContext().checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }
}
