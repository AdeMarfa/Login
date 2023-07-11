package com.ademarfamiftahulhidayah202102314.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends AppCompatActivity {

    private Button _addButtonMahasiswa, _addButtonForex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initBtnMahasiswa();
        initBtnForex();
    }

    private void initBtnMahasiswa() {
        _addButtonMahasiswa = findViewById(R.id.btnMahasiswa);
        _addButtonMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TampilMahasiswa.class);
                startActivity(intent);
            }
        });
    }

    private void initBtnForex() {
        _addButtonForex = findViewById(R.id.ForexBtn);
        _addButtonForex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(intent);
            }
        });
    }
}