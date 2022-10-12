package com.example.tugasbiodatabintangnuswantoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/6%C2%B033'01.6%22S+111%C2%B003'05.5%22E/@-6.5505604,111.0516721,19.42z/data=!4m6!3m5!1s0x2e712b797b0b47c1:0xcdc5b8e02942adf5!7e2!8m2!3d-6.550437!4d111.051533?shorturl=1"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:nuswantorobintang1@gmail.com"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6281393995328"));
        startActivity(intent);
    }

}


