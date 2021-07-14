package com.sun.intentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView tnama, tnim, tadd, ttl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tnama = findViewById(R.id.nama_received);
        tnim = findViewById(R.id.nim_received);
        tadd = findViewById(R.id.add_received);
        ttl = findViewById(R.id.ttl_received);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String nama = bundle.getString("nama");
            String nim = bundle.getString("nim");
            String alamat = bundle.getString("alamat");
            String tl = bundle.getString("ttl");


            tnama.setText(nama);
            tnim.setText(nim);
            tadd.setText(alamat);
            ttl.setText(tl);
        }else {
            Toast.makeText(this, "Data Masih Kosong", Toast.LENGTH_SHORT).show();
        }


    }
}