package com.owaisinews.rahulraj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class ContactUs extends Fragment {
    EditText name , phone , comments , email;
    Button submit;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.contactus , container , false);

        name = (EditText)view.findViewById(R.id.name);
        phone = (EditText)view.findViewById(R.id.phone);
        comments = (EditText)view.findViewById(R.id.email);
        email = (EditText)view.findViewById(R.id.comment);
        submit = (Button)view.findViewById(R.id.submit);
        return view;
    }
}
