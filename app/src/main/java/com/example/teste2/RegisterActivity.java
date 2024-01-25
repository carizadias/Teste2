package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText name, test1, test2;
    Button add, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name);
        test1 = findViewById(R.id.firsttest);
        test2 = findViewById(R.id.secondtest);
        add = findViewById(R.id.addbtn);
        cancel = findViewById(R.id.cancelbtn);

        name.getText().toString();
        test1.getText().toString();
        test2.getText().toString();
    }

    public void onClickbtn(Button button){
        if (button.callOnClick() == add){
            Intent intent = new Intent(this, ApprovedActivity.class);
            startActivity(intent);
        } else if (button.callOnClick() == cancel) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }
}