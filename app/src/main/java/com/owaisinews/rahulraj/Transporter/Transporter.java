package com.owaisinews.rahulraj.Transporter;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.owaisinews.rahulraj.Agent.Agent;
import com.owaisinews.rahulraj.Agent.Tranport;
import com.owaisinews.rahulraj.Loader.PagerAdapter;
import com.owaisinews.rahulraj.R;

public class Transporter extends AppCompatActivity {

    TabLayout layout;
    ViewPager pager;
    TransPAger adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporter);

        layout =  (TabLayout)findViewById(R.id.tab);
        pager =  (ViewPager)findViewById(R.id.pager);

        layout.addTab(layout.newTab().setText("INDIVIDUAL"));
        layout.addTab(layout.newTab().setText("AGENT"));
        layout.addTab(layout.newTab().setText("TRANPORT"));
        layout.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new TransPAger(getSupportFragmentManager(), layout.getTabCount());
        pager.setAdapter(adapter);
        layout.setupWithViewPager(pager);

        layout.getTabAt(0).setText("INDIVIDUAL");
        layout.getTabAt(1).setText("AGENT");
        layout.getTabAt(2).setText("TRANPORT");

    }

    public class TransPAger extends FragmentStatePagerAdapter {

        int tab;

        public TransPAger(FragmentManager fm , int List) {
            super(fm);
            this.tab = List;
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0)
            {
                return new Individual();
            }
            else if (position == 1)
            {
                return new Agent();
            }
            else if (position == 2)
            {
                return new Tranport();
            }


            return null;
        }
        @Override
        public int getCount() {
            return 3;
        }
    }

}
