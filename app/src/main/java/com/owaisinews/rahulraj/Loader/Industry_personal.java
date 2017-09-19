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
import com.owaisinews.rahulraj.BankInformation;
import com.owaisinews.rahulraj.Login;
import com.owaisinews.rahulraj.R;
import com.owaisinews.rahulraj.Transporter.Transporter;


public class Industry_personal extends Fragment {

    EditText name , pass , mobile , email , retype;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout .industry_personal , container , false);

        name = (EditText)v.findViewById(R.id.name);
        pass = (EditText)v.findViewById(R.id.password);
        mobile = (EditText)v.findViewById(R.id.mobile);
        email = (EditText)v.findViewById(R.id.email);
        retype = (EditText)v.findViewById(R.id.retype);
        btn = (Button)v.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(getActivity());
//                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.l_p_dialog);
                dialog.setCancelable(true);
                dialog.show();

                Button btn = (Button)dialog.findViewById(R.id.conti);
                ImageButton imageButton  = (ImageButton)dialog.findViewById(R.id.close);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {





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
