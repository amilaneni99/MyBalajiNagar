package com.example.abhinav.mybalajinagar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Complaints extends AppCompatActivity {
    EditText name,message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaints);

        name = findViewById(R.id.name);
        message = findViewById(R.id.msg);
        send = findViewById(R.id.send);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);

        GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#004BBB9C"));
        gd.setCornerRadius(30);
        gd.setStroke(4, Color.BLACK);

        GradientDrawable gd2 = new GradientDrawable();
        gd2.setColor(Color.parseColor("#004BBB9C"));
        gd2.setCornerRadius(30);
        gd2.setStroke(4,Color.BLACK);

        message.setBackground(gd);
        name.setBackground(gd2);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "as.abhi99@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Mail from " + name.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Complaints.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
