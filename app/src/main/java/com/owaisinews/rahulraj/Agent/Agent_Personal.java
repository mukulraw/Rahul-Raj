package com.owaisinews.rahulraj.Agent;

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

import com.owaisinews.rahulraj.R;


public class Agent_Personal extends Fragment {

    EditText name , pass , mobile , email , retype;
    Button btn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.agent_personal , container , false);
        name = (EditText)v.findViewById(R.id.name);
        pass = (EditText)v.findViewById(R.id.password);
        mobile = (EditText)v.findViewById(R.id.mobile);
        email = (EditText)v.findViewById(R.id.email);
        retype = (EditText)v.findViewById(R.id.retype);
        btn = (Button)v.findViewById(R.id.button);
        return  v;
    }
}
