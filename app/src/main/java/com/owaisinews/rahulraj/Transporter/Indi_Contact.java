package com.owaisinews.rahulraj.Transporter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.owaisinews.rahulraj.Bank;
import com.owaisinews.rahulraj.BankInformation;
import com.owaisinews.rahulraj.Loader.Industry_company;
import com.owaisinews.rahulraj.Login;
import com.owaisinews.rahulraj.MainActivity;
import com.owaisinews.rahulraj.R;



public class Indi_Contact extends Fragment{

    EditText editText1 , editText2 , editText3 , editText4 , editText5,editText6;
    Button btn;
    Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.indi_contact , container , false);
        editText1 = (EditText)v.findViewById(R.id.add);
        editText2 = (EditText)v.findViewById(R.id.city);
        editText3 = (EditText)v.findViewById(R.id.pin);
        editText4 = (EditText)v.findViewById(R.id.desti);
        editText5 = (EditText)v.findViewById(R.id.acp);
        editText6 = (EditText)v.findViewById(R.id.amn);
        btn = (Button)v.findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(getActivity());
//                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.indi_contact_dialog);
                dialog.setCancelable(true);
                dialog.show();

                Button btn = (Button)dialog.findViewById(R.id.conti);
                ImageButton imageButton  = (ImageButton)dialog.findViewById(R.id.close);
                TextView textView = (TextView)dialog.findViewById(R.id.skip);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), BankInformation.class);
                        startActivity(i);
                    }
                });
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.dismiss();
                    }
                });
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), Login.class);
                        startActivity(i);
                    }
                });

            }
        });

        return  v;
    }
}
