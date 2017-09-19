package com.owaisinews.rahulraj.Loader;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.owaisinews.rahulraj.Agent.Agent_Company;
import com.owaisinews.rahulraj.R;


public class Industry extends Fragment {

    TabLayout layout;
    public static ViewPager pager;
    IndustryPager adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.industry , container , false);

        layout =  (TabLayout)view.findViewById(R.id.tab);
        pager =  (ViewPager)view.findViewById(R.id.pager);

        layout.addTab(layout.newTab().setText("PERSONAL"));
        layout.addTab(layout.newTab().setText("CONTACT"));
        layout.addTab(layout.newTab().setText("COMPANY"));
        layout.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new IndustryPager(getChildFragmentManager(), layout.getTabCount());
        pager.setAdapter(adapter);
        layout.setupWithViewPager(pager);

        layout.getTabAt(0).setText("PERSONAL");
        layout.getTabAt(1).setText("CONTACT");
        layout.getTabAt(2).setText("COMPANY");
        return  view;

    }

    public class IndustryPager extends FragmentStatePagerAdapter {

        int tab;

        public IndustryPager(FragmentManager fm , int List) {
            super(fm);

            this.tab = List;
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0)
            {
                return new Industry_personal();
            }
            else if (position == 1)
            {
                return new Industry_contact();
            }
            else if (position == 2)
            {
                return new Industry_company();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }






    public static class Industry_personal extends Fragment {

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


pager.setCurrentItem(1);

dialog.dismiss();

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








}
