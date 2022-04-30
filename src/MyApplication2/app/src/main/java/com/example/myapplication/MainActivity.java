package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    EditText mEdit;
    TextView mText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button1);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit = (EditText)findViewById(R.id.editText1);
                mText = (TextView)findViewById(R.id.textView1);
                mText.setText("Welcome " + mEdit.getText().toString()+"!");
            }
        });
    }

    public void launchLearnMore(View v) {
        // launch a new activity
        Intent i = new Intent(this, LearnActivity.class);
        startActivity(i);
    }

    public void disable(View v) {
        findViewById(R.id.button1).setEnabled(false);
        ((Button) findViewById(R.id.button1)).setText("new disabled");

        /*
        v.setEnabled(false);
        Button button = (Button) v;
        button.setText("Disabled");
        // Log.d("success", "Button Disabled");
        */
    }
}