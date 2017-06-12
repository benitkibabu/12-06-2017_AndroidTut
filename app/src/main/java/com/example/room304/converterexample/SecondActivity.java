package com.example.room304.converterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView ageField, nameField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ageField = (TextView) findViewById(R.id.age);
        nameField = (TextView) findViewById(R.id.nameField);

        Person p = null;
//      int value;

        if(this.getIntent().hasExtra("Person")){
            p = (Person) this.getIntent().getSerializableExtra("Person");
            ageField.setText("Your age is " + p.getAge());
            nameField.setText("Your name is " + p.getName());
        }else{
            Toast.makeText(this, "There are no extras in this activity", Toast.LENGTH_LONG).show();
        }
    }
}
