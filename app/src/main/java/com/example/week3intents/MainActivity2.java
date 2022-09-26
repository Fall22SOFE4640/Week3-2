package com.example.week3intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnGoogle;

    TextView nameTxtView,userNameTxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name = getIntent().getStringExtra("keyName");
        String userName = getIntent().getStringExtra("keyUserName");

        nameTxtView = findViewById(R.id.nameActivity2);
        userNameTxtView = findViewById(R.id.userNameActivity2);
        nameTxtView.setText(name);
        userNameTxtView.setText(userName);
        btnGoogle = findViewById(R.id.btnGoogle);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.ca"));
                //intent.putExtra(Intent.EXTRA_TEXT,"Hi from the other side")
                startActivity(intent);
            }
        });
    }
}