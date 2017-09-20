package com.owaisinews.rahulraj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tvs on 9/19/2017.
 */

public class Booking extends Fragment {

    TextView textView1 , textView2 , textView3 , textView4 , textView5 , textView6 , textView7;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.booking , container , false);

        textView1 = (TextView)view.findViewById(R.id.enter);
        textView2 = (TextView)view.findViewById(R.id.choose);
        textView3 = (TextView)view.findViewById(R.id.vehicle);
        textView4 = (TextView)view.findViewById(R.id.material);
        textView5 = (TextView)view.findViewById(R.id.weight);
        textView6 = (TextView)view.findViewById(R.id.novehicle);
        textView7 = (TextView)view.findViewById(R.id.schdule);
        btn = (Button)view.findViewById(R.id.checkfare);
        return view;
    }
}
