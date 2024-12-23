package com.example.tbmunsar;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView absenmasuk = findViewById(R.id.sipil);
        absenmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailbukusipilActivity.class);
                startActivity(intent);
            }
        });
        ImageView filsafat= findViewById(R.id.filsafat);
        filsafat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailfilsafatpendidikanActivity.class);
                startActivity(intent);
            }
        });
        ImageView kebijakan= findViewById(R.id.kebijakan);
        kebijakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetaildasardasarkebijakanActivity.class);
                startActivity(intent);
            }
        });
        ImageView islam= findViewById(R.id.islamilmu);
        islam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailislamdanilmuActivity.class);
                startActivity(intent);
            }
        });
        ImageView perpustakaan= findViewById(R.id.perpustakaan);
        perpustakaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PerpustakaanActivity.class);
                startActivity(intent);
            }
        });
        ImageView profile= findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}