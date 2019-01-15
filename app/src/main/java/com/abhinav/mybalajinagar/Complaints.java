package com.abhinav.mybalajinagar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Complaints extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText name,message,number;
    Button send;
    private String item;

    private Spinner spinner;
    private static final String[] paths = {"Select Street","Periyar Street", "Kamarajar Street", "Kambar Street","Vu Ve Sa Street","Muvendar Street","Avvai Street","Gandhi Street","Bharathi Salai","Velavan Nagar","Muthamizh Street","Singaravelar Street","Elango Street","Vivekanandar Street","Dr. Ambedkar Street","Annai Therasa Sreet","Bhagat Singh Street","Kalpana Chawla Street","Dr. M.S. Swaminathan Street","Thiruvalluvar Street","Kumaran Street","Dr. Abdul Kalam Street","Jansi Rani Street","Vallalar Street","Bharadhidhasan Street","Mullai Street","Thendral Street","Nethaji Street","Kavimani Street","Anbu Street","Nehru Street","Anna Street"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaints);

        name = findViewById(R.id.name);
        message = findViewById(R.id.msg);
        send = findViewById(R.id.send);
        number = findViewById(R.id.houseno);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Complaints.this,
                android.R.layout.simple_spinner_item,paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);
        actionBar.setTitle("Complaints");

        GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#004BBB9C"));
        gd.setCornerRadius(30);
        gd.setStroke(4, Color.BLACK);

        GradientDrawable gd3 = new GradientDrawable();
        gd3.setColor(Color.parseColor("#004BBB9C"));
        gd3.setCornerRadius(30);
        gd3.setStroke(4, Color.BLACK);

        GradientDrawable gd4 = new GradientDrawable();
        gd4.setColor(Color.parseColor("#004BBB9C"));
        gd4.setCornerRadius(30);
        gd4.setStroke(4, Color.BLACK);

        GradientDrawable gd2 = new GradientDrawable();
        gd2.setColor(Color.parseColor("#004BBB9C"));
        gd2.setCornerRadius(30);
        gd2.setStroke(4,Color.BLACK);

        message.setBackground(gd);
        name.setBackground(gd2);
        spinner.setBackground(gd3);
        number.setBackground(gd4);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "balajinagar.ponneri@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Mail from " + name.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, message.getText().toString()+"\n\n\n\n"+"Regards\n"+name.getText().toString()+"\n"+number.getText().toString()+","+item);

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
    public void onBackPressed(){
        Intent a = new Intent(this,Home.class);
        startActivity(a);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        item = adapterView.getItemAtPosition(i).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
