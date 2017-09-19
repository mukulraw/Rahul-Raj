package com.owaisinews.rahulraj.Logistics;

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

import com.owaisinews.rahulraj.Loader.Industry_company;
import com.owaisinews.rahulraj.R;


public class Logi_Contact extends Fragment {

    EditText editText1 , editText2 , editText3 , editText4 , editText5,editText6, editText7 , editText8;
    Button btn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.logi_contact , container , false);

        editText1 = (EditText)v.findViewById(R.id.add);
        editText2 = (EditText)v.findViewById(R.id.city);
        editText3 = (EditText)v.findViewById(R.id.pin);
        editText4 = (EditText)v.findViewById(R.id.desti);
        editText5 = (EditText)v.findViewById(R.id.acp);
        editText6 = (EditText)v.findViewById(R.id.amn);
        editText7 = (EditText)v.findViewById(R.id.landline);
        editText8 = (EditText)v.findViewById(R.id.freq);
        btn = (Button)v.findViewById(R.id.button3);
       return v;
    }
}
