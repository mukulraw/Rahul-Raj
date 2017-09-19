package com.owaisinews.rahulraj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BankInformation extends AppCompatActivity {


    EditText editText1 , editText2 , editText3 , editText4 , editText5;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_information);

        editText1 = (EditText)findViewById(R.id.name);
        editText2 = (EditText)findViewById(R.id.an);
        editText3 = (EditText)findViewById(R.id.bn);
        editText4 = (EditText)findViewById(R.id.ifsc);
        editText5 = (EditText)findViewById(R.id.address);
         btn = (Button)findViewById(R.id.button1);
    }
}
