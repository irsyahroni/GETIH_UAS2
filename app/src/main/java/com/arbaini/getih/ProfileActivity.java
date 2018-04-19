package com.arbaini.getih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private TextView tvNama,tvEmail,tvGolDar,tvBB;
    private String stNama,stEmail,stPass,stGolDar,stBB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvNama = findViewById(R.id.tv_nama_detail);
        tvEmail = findViewById(R.id.tv_email_detail);
        tvGolDar = findViewById(R.id.tv_goldarah_detail);
        tvBB = findViewById(R.id.tv_bb_detail);

        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        stNama = extras.getString("NAMA");
        stEmail = extras.getString("EMAIL");
        stPass = extras.getString("PASS");
        stGolDar = extras.getString("GOLDAR");
        stBB = extras.getString("BB");


        tvNama.setText(stNama);
        tvEmail.setText(stEmail);
        tvBB.setText(stBB);
        tvGolDar.setText(stGolDar);

    }
}
