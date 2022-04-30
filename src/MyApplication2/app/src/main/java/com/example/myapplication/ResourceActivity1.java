package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ResourceActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource1);
        setupHyperlink();
    }

    public void launchResource2(View v){
        Intent i = new Intent(this, ResourceActivity2.class);
        startActivity(i);
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.hyperlink1);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLUE);
    }
}