package com.scs.bookbank;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1n1HYq4cwzxfP60WC_xYuTEZjf5SeASO84wdQPjLojVM/edit#gid=29376569"));
        startActivity(browserIntent);
    }

    public void open2(View view) {
        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSci6ivnUwC5XDhXveFN0UpL_H1xSW-ms_KOoD4KYAw8ARBkWQ/viewform"));
        startActivity(browserIntent1);
    }

    public void open3(View view) {
        Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdk6cIjM4w2VBLvjDIznCbHfOrKzP_i8MfiwtF2bvCldiAMkg/viewform"));
        startActivity(browserIntent2);
    }

    public void open4(View view) {
        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdhycd2EIHudqdMruaxPswWuTrNJVP0Nx4xa2ZUMxluktSCxw/viewform"));
        startActivity(browserIntent3);
    }

    public void open5(View view) {
        Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeUlAIkzlaGpxs1_LKNO85YlgFWzN2FSqAdeK5xqpyN0uj0vw/viewform"));
        startActivity(browserIntent4);
    }

    public void open6(View view) {
        Intent intent = new Intent(MainActivity.this, abtus.class);
        startActivity(intent);
    }

    public void open7(View view) {
        Intent intent2 = new Intent(MainActivity.this, cts.class);
        startActivity(intent2);
    }

}
