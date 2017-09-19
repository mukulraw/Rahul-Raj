package com.owaisinews.rahulraj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Bank extends Fragment {

    EditText editText1 , editText2 , editText3 , editText4 , editText5;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bank_information , container , false);
        editText1 = (EditText)view.findViewById(R.id.name);
        editText2 = (EditText)view.findViewById(R.id.an);
        editText3 = (EditText)view.findViewById(R.id.bn);
        editText4 = (EditText)view.findViewById(R.id.ifsc);
        editText5 = (EditText)view.findViewById(R.id.address);
        btn = (Button)view.findViewById(R.id.button1);
        return view;
    }
}
