package com.arbaini.getih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    private EditText etNama,etEmail,etPass,etGolDar,etBB;
    private String stNama,stEmail,stPass,stUmur,stGolDar,stBB;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().setTitle("Register");


        etNama = findViewById(R.id.et_register_nama);
        etEmail = findViewById(R.id.et_register_email);
        etPass = findViewById(R.id.et_register_password);
        etBB = findViewById(R.id.et_register_bb);
        etGolDar = findViewById(R.id.et_register_goldarah);

        btnRegister = findViewById(R.id.btn_register);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stNama = etNama.getText().toString();
                if(TextUtils.isEmpty(stNama)) {
                    etNama.setError("Tidak boleh kosong");
                    return;
                }


                stEmail = etEmail.getText().toString();
                if(TextUtils.isEmpty(stEmail)) {
                    etEmail.setError("Tidak boleh Kosong");
                    return;
                }

                stPass = etPass.getText().toString();
                if(TextUtils.isEmpty(stPass)) {
                    etPass.setError("Tidak boleh Kosong");
                    return;
                }

                stBB = etBB.getText().toString();
                if(TextUtils.isEmpty(stBB)) {
                    etBB.setError("Tidak boleh Kosong");
                    return;
                }

                stGolDar = etGolDar.getText().toString();
                if(TextUtils.isEmpty(stGolDar)) {
                    etGolDar.setError("Tidak boleh Kosong");
                    return;
                }



                Intent intent = new Intent(SignupActivity.this,MainActivity.class);
                Bundle extras = new Bundle();
                extras.putString("NAMA",stNama);
                extras.putString("EMAIL",stEmail);
                extras.putString("PASS",stPass);
                extras.putString("GOLDAR",stGolDar);
                extras.putString("BB",stBB);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }



}
