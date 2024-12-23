package com.example.tbmunsar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PerpustakaanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perpustakaan);

        ImageView beranda= findViewById(R.id.beranda);
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerpustakaanActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView sipil = findViewById(R.id.sipil);
        sipil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerpustakaanActivity.this, DetailbukusipilActivity.class);
                startActivity(intent);
            }
        });
        ImageView filsafat = findViewById(R.id.filsafat);
        filsafat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerpustakaanActivity.this, DetailfilsafatpendidikanActivity.class);
                startActivity(intent);
            }
        });
        ImageView dasar = findViewById(R.id.dasar);
        dasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerpustakaanActivity.this, DetaildasardasarkebijakanActivity.class);
                startActivity(intent);
            }
        });
        ImageView islam = findViewById(R.id.islam);
        islam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerpustakaanActivity.this, DetailislamdanilmuActivity.class);
                startActivity(intent);
            }
        });
        ImageView profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerpustakaanActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}