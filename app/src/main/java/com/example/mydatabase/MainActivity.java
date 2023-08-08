package com.example.mydatabase;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etPass;
    Button btnSave;
    database DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);
        btnSave = findViewById(R.id.btnSave);

        DB = new database(MainActivity.this);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username= etName.getText().toString();
                String Password = etPass.getText().toString();
                DB.saveData(DB,Username,Password);


            }
        });


    }



}

