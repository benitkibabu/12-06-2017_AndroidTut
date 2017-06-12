package com.example.room304.converterexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText numberField, nameField;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button) findViewById(R.id.sendButton);
        numberField = (EditText) findViewById(R.id.ageField);
        nameField = (EditText) findViewById(R.id.nameField);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = numberField.getText().toString();
                String name = nameField.getText().toString();
                Person p = new Person();
                p.setName(name);
                p.setAge(Integer.parseInt(age));

                Intent i  = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Person", p);
//                i.putExtra("name", name);
//                i.putExtra("age", age);
                startActivity(i);
            }
        });
    }
}
