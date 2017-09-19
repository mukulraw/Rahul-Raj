package com.owaisinews.rahulraj.Logistics;

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


public class Logi_Company extends Fragment {

    EditText editText1 , editText2 , editText3 , editText4 ;
    LinearLayout layout1 , layout2 , layout3;
    Button btn3;
    TextView file1 , file2 , file3;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.logi_company , container , false);
        editText1 = (EditText)view.findViewById(R.id.cn);
        editText2 = (EditText)view.findViewById(R.id.ct);
        editText3 = (EditText)view.findViewById(R.id.st);
        editText4 = (EditText)view.findViewById(R.id.pc);
        file1 = (TextView)view.findViewById(R.id.fil1);
        file2 = (TextView)view.findViewById(R.id.fil2);
        file3 = (TextView)view.findViewById(R.id.fil3);
        layout1 = (LinearLayout)view.findViewById(R.id.ui);
        layout2 = (LinearLayout)view.findViewById(R.id.ui2);
        layout3 = (LinearLayout)view.findViewById(R.id.ui3);
        btn3 = (Button)view.findViewById(R.id.button2);

        return  view;
    }
}
