package com.owaisinews.rahulraj.Loader;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.owaisinews.rahulraj.Agent.Agent_Company;
import com.owaisinews.rahulraj.Logistics.Logistics;
import com.owaisinews.rahulraj.R;
import com.owaisinews.rahulraj.Transporter.Individual;

public class Loader extends AppCompatActivity {

    TabLayout layout;
    ViewPager pager;
    PagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);

        layout =  (TabLayout)findViewById(R.id.tab);
        pager =  (ViewPager)findViewById(R.id.pager);

        layout.addTab(layout.newTab().setText("LOADER"));
        layout.addTab(layout.newTab().setText("LOGISTICS"));
        layout.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new PagerAdapter(getSupportFragmentManager(), layout.getTabCount());
        pager.setAdapter(adapter);
        layout.setupWithViewPager(pager);

        layout.getTabAt(0).setText("LOADER");
        layout.getTabAt(1).setText("LOGISTICS");



    }

    public class PagerAdapter extends FragmentStatePagerAdapter {

        int tab;

        public PagerAdapter(FragmentManager fm , int List) {
            super(fm);
            this.tab = List;
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0)
            {
                return new Industry();
            }
            else if (position == 1)
            {
                return new Logistics();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

}
