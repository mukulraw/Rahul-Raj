package com.owaisinews.rahulraj.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.owaisinews.rahulraj.R;



public class Profile_Company extends Fragment {

    EditText editText1 , editText2 , editText3 , editText4 ,editText5;
    LinearLayout layout1 , layout2 ;
    Button btn3;
    TextView file1 , file2 ;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.profile_company , container , false);

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

        return view;
    }
}
