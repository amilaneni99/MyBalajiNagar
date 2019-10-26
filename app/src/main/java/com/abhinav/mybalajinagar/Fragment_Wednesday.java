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

import libs.mjn.prettydialog.PrettyDialog;
import libs.mjn.prettydialog.PrettyDialogCallback;

public class Fragment_Wednesday extends Fragment {
    View view;
    CardView c1,c2,c3,c4,c5,c6,c7,c8;

    public Fragment_Wednesday() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.wednesday_fragment,container,false);
        c1 = view.findViewById(R.id.one);
        c2 = view.findViewById(R.id.two);
        c3 = view.findViewById(R.id.three);
        c4 = view.findViewById(R.id.four);
        c5 = view.findViewById(R.id.five);
        c6 = view.findViewById(R.id.six);
        c7 = view.findViewById(R.id.seven);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PrettyDialog pDialog = new PrettyDialog(getContext());
                pDialog
                        .setTitle("My Balaji Nagar")
                        .setMessage("Are you sure you want to call?")
                        .addButton(
                                "Confirm",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_green,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        call("9600388851");
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .addButton(
                                "Cancel",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_red,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .show();

            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PrettyDialog pDialog = new PrettyDialog(getContext());
                pDialog
                        .setTitle("My Balaji Nagar")
                        .setMessage("Are you sure you want to call?")
                        .addButton(
                                "Confirm",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_green,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        call("9003989899");
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .addButton(
                                "Cancel",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_red,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .show();

            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PrettyDialog pDialog = new PrettyDialog(getContext());
                pDialog
                        .setTitle("My Balaji Nagar")
                        .setMessage("Are you sure you want to call?")
                        .addButton(
                                "Confirm",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_green,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        call("9789533527");
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .addButton(
                                "Cancel",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_red,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .show();

            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(getContext());
                pDialog
                        .setTitle("My Balaji Nagar")
                        .setMessage("Are you sure you want to call?")
                        .addButton(
                                "Confirm",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_green,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        call("7871057550");
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .addButton(
                                "Cancel",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_red,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .show();


            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(getContext());
                pDialog
                        .setTitle("My Balaji Nagar")
                        .setMessage("Are you sure you want to call?")
                        .addButton(
                                "Confirm",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_green,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        call("9698117902");
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .addButton(
                                "Cancel",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_red,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .show();

            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PrettyDialog pDialog = new PrettyDialog(getContext());
                pDialog
                        .setTitle("My Balaji Nagar")
                        .setMessage("Are you sure you want to call?")
                        .addButton(
                                "Confirm",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_green,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        call("9942193500");
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .addButton(
                                "Cancel",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_red,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .show();

            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(getContext());
                pDialog
                        .setTitle("My Balaji Nagar")
                        .setMessage("Are you sure you want to call?")
                        .addButton(
                                "Confirm",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_green,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        call("9444053033");
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .addButton(
                                "Cancel",
                                R.color.pdlg_color_white,
                                R.color.pdlg_color_red,
                                new PrettyDialogCallback() {
                                    @Override
                                    public void onClick() {
                                        pDialog.dismiss();
                                    }
                                }
                        )
                        .show();

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
        int res = getContext().checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }
}
