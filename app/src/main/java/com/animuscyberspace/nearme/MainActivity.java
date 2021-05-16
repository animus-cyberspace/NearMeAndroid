package com.animuscyberspace.nearme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pincodeEt;
    Button searchBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        searchBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pincode = pincodeEt.getText().toString();
                Log.d("MainActivity", "onClick: "+pincode);
//                Intent intent = new Intent(this, CategoryActivity.class);
//                startActivity(intent);
            }
        });
    }

    private void init() {
        pincodeEt = findViewById(R.id.et_pincode);
        searchBt = findViewById(R.id.bt_search);
    }
}