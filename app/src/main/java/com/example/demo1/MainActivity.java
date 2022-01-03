package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private EditText num1;
     private EditText num2;
     private Button add;
     private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.etnum1);
        num2=(EditText) findViewById(R.id.etnum2);
        add=(Button) findViewById(R.id.btnadd);
        result=(TextView) findViewById(R.id.tvans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int sum=number1 + number2;
                result.setText("Answer:"+String.valueOf(sum));
            }
        });
    }
}