package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button approved, exam, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        approved = findViewById(R.id.aprovedbtn);
        exam = findViewById(R.id.examebtn);
        register = findViewById(R.id.registerbtn);

    }

    public void onClickbtn(Button button){
        if (button.callOnClick() == approved){
            Intent intent = new Intent(this, ApprovedActivity.class);
            startActivity(intent);
        } else if (button.callOnClick() == exam) {
            Intent intent = new Intent(this, ExameActivity.class);
            startActivity(intent);
        } else if (button.callOnClick() == register) {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }
}