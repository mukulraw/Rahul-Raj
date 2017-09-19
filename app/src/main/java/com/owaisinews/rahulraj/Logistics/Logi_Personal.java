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


public class Logi_Personal extends Fragment {

    EditText name , pass , mobile , email , retype;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.logi_personal , container , false);

        name = (EditText)v.findViewById(R.id.name);
        pass = (EditText)v.findViewById(R.id.password);
        mobile = (EditText)v.findViewById(R.id.mobile);
        email = (EditText)v.findViewById(R.id.email);
        retype = (EditText)v.findViewById(R.id.retype);
        btn = (Button)v.findViewById(R.id.button);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        Logi_Contact fragment = new Logi_Contact();
        ft.replace(R.id.replace, fragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        ft.commit();
        return v;
    }
}
