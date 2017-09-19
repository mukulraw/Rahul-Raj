package com.owaisinews.rahulraj;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.owaisinews.rahulraj.Logistics.Logi_Company;
import com.owaisinews.rahulraj.Transporter.Transporter;

public class Login extends AppCompatActivity {

    EditText user , pass ;
    Button signin ;
    TextView create , forgot;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.user);
        pass = (EditText)findViewById(R.id.pass);
        forgot = (TextView)findViewById(R.id.forgot);
        signin = (Button) findViewById(R.id.sign);
        create = (TextView) findViewById(R.id.create);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(Login.this);
//                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog);
                dialog.setCancelable(true);
                dialog.show();

                Button loader = (Button) dialog.findViewById(R.id.loader);
                Button vehicle = (Button) dialog.findViewById(R.id.vehicle);
                ImageButton image = (ImageButton) dialog.findViewById(R.id.close);

                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                loader.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Login.this , com.owaisinews.rahulraj.Loader.Loader.class);
                        startActivity(i);
                    }
                });

                vehicle.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Login.this , Transporter.class);
                        startActivity(i);
                    }
                });
            }
        });

    }
}
