package com.example.kostya.whatamilookingfor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(MainActivity.this, getResources().getText(R.string.text), Toast.LENGTH_LONG);

        Button btnCall, btnReview;

        btnReview = (Button) findViewById(R.id.btnReview);
        btnReview.setOnClickListener(this);

        btnCall = (Button) findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnReview:
                intent = new Intent(MainActivity.this, Review.class);
                startActivity(intent);
                break;
            case R.id.btnCall:
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+79657901365"));
                startActivity(intent);
                break;
        }
    }
}
