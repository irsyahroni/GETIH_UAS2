package com.arbaini.getih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JadiDonorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadi_donor);
        getSupportActionBar().setTitle("Jadi Pendonor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
