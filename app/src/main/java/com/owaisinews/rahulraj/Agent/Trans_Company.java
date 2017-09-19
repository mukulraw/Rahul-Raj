package com.owaisinews.rahulraj.Agent;

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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.owaisinews.rahulraj.Bank;
import com.owaisinews.rahulraj.BankInformation;
import com.owaisinews.rahulraj.Login;
import com.owaisinews.rahulraj.R;


public class Trans_Company extends Fragment {
    EditText editText1 , editText2 , editText3 , editText4 ,editText5;
    LinearLayout layout1 , layout2 ;
    Button btn3;
    TextView file1 , file2 ;
    Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.trans_company , container , false);

        editText1 = (EditText)view.findViewById(R.id.cn);
        editText2 = (EditText)view.findViewById(R.id.ct);
        editText3 = (EditText)view.findViewById(R.id.st);
        editText4 = (EditText)view.findViewById(R.id.pc);
        editText5 = (EditText)view.findViewById(R.id.website);
        file1 = (TextView)view.findViewById(R.id.fil1);
        file2 = (TextView)view.findViewById(R.id.fil2);
        layout1 = (LinearLayout)view.findViewById(R.id.ui);
        layout2 = (LinearLayout)view.findViewById(R.id.ui2);
        btn3 = (Button)view.findViewById(R.id.button2);


        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(getActivity());
//                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.indi_contact_dialog);
                dialog.setCancelable(true);
                dialog.show();

                Button btn = (Button)dialog.findViewById(R.id.conti);
                ImageButton imageButton  = (ImageButton)dialog.findViewById(R.id.close);
                TextView skip = (TextView)dialog.findViewById(R.id.skip);

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
                skip.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), Login.class);
                        startActivity(i);
                    }
                });

            }
        });


        return  view;
    }
}
