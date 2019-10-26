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

public class Fragment_Executive extends Fragment {
    View view;
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17;

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
        c17 = view.findViewById(R.id.m_17);
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
                                        call("9443417650");
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
                                        call("9788704461");
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
                                        call("9994270241");
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
                                        call("9444465111");
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
                                        call("9842518968");
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
                                        call("8610606692");
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
        c8.setOnClickListener(new View.OnClickListener() {
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
                                        call("9444465111");
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
        c9.setOnClickListener(new View.OnClickListener() {
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
                                        call("9600891026");
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
        c10.setOnClickListener(new View.OnClickListener() {
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
                                        call("9042192350");
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
        c11.setOnClickListener(new View.OnClickListener() {
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
                                        call("9444465111");
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
        c12.setOnClickListener(new View.OnClickListener() {
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
                                        call("9600860123");
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
        c13.setOnClickListener(new View.OnClickListener() {
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
                                        call("9894149808");
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
        c14.setOnClickListener(new View.OnClickListener() {
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
                                        call("9499056107");
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
        c15.setOnClickListener(new View.OnClickListener() {
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
                                        call("9443689610");
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
        c16.setOnClickListener(new View.OnClickListener() {
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
                                        call("9791299005");
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
        c17.setOnClickListener(new View.OnClickListener() {
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
                                        call("9492335854");
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
