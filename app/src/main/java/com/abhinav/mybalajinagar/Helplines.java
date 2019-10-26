package com.abhinav.mybalajinagar;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

import libs.mjn.prettydialog.PrettyDialog;
import libs.mjn.prettydialog.PrettyDialogCallback;

public class Helplines extends AppCompatActivity {

    CardView police,women_police,fop,fire,rpf,gh,eb,to,rly,water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helplines);

        police = findViewById(R.id.police);
        women_police = findViewById(R.id.women_police);
        fop = findViewById(R.id.fop);
        fire = findViewById(R.id.fire);
        rpf = findViewById(R.id.rpf);
        gh = findViewById(R.id.gh);
        eb = findViewById(R.id.eb);
        to = findViewById(R.id.taluk_office);
        rly = findViewById(R.id.rly);
        water = findViewById(R.id.water);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);


        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("04427972253");
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

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("9500492662");
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

        women_police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("1091");
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
        fop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("9444301200");
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
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("04427974064");
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
        rpf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("9003161710");
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
        gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("04427972256");
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
        eb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("04427972268");
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
        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("04427972252");
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
        rly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PrettyDialog pDialog = new PrettyDialog(Helplines.this);
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
                                        call("04427972350");
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
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    private void call(String number) {
        try {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+number));
            ActivityCompat.requestPermissions(Helplines.this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    1);
            checkCallPermission();
            if (ActivityCompat.checkSelfPermission(Helplines.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
    public void onBackPressed(){
        Intent a = new Intent(this,Home.class);
        startActivity(a);

    }
}
