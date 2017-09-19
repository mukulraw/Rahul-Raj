package com.owaisinews.rahulraj.Loader;

import android.app.Dialog;
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

import com.owaisinews.rahulraj.Agent.Agent_Company;
import com.owaisinews.rahulraj.R;


public class Industry_contact extends Fragment {

    EditText editText1 , editText2 , editText3 , editText4 , editText5 ,editText6, editText7 , editText8;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.industry_contact , container , false);

        editText1 = (EditText)v.findViewById(R.id.add);
        editText2 = (EditText)v.findViewById(R.id.city);
        editText3 = (EditText)v.findViewById(R.id.pin);
        editText4 = (EditText)v.findViewById(R.id.desti);
        editText5 = (EditText)v.findViewById(R.id.acp);
        editText6 = (EditText)v.findViewById(R.id.amn);
        editText7 = (EditText)v.findViewById(R.id.landline);
        editText8 = (EditText)v.findViewById(R.id.freq);
        btn = (Button)v.findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(getActivity());
//              dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.l_contact_dialog);
                dialog.setCancelable(true);
                dialog.show();

                Button btn = (Button)dialog.findViewById(R.id.conti);
                ImageButton imageButton  = (ImageButton)dialog.findViewById(R.id.close);


                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), Industry_company.class);
                        startActivity(i);
                    }
                });
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.dismiss();
                    }
                });

            }
        });

        return v;

    }
}
