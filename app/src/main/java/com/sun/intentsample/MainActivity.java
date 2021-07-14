package com.sun.intentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toAct;
    EditText editText1, editText2, editText3, editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toAct = findViewById(R.id.btn_save);
        editText1 = findViewById(R.id.nama);
        editText2 = findViewById(R.id.nim);
        editText3 = findViewById(R.id.add);
        editText4 = findViewById(R.id.ttl);

        toAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editText1.getText().toString())||TextUtils.isEmpty(editText2.getText().toString())||TextUtils.isEmpty(editText3.getText().toString())||TextUtils.isEmpty(editText4.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Data Belum Lengkap", Toast.LENGTH_SHORT).show();
                }else {
                    String nama = editText1.getText().toString();
                    String nim = editText2.getText().toString();
                    String alamat = editText3.getText().toString();
                    String ttl = editText4.getText().toString();
                    Intent intent = new Intent(getApplicationContext(), Activity2.class);
                    intent.putExtra("nama", nama);
                    intent.putExtra("nim", nim);
                    intent.putExtra("alamat", alamat);
                    intent.putExtra("ttl", ttl);
                    startActivity(intent);
                }
            }
        });

    }



}