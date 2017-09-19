package com.owaisinews.rahulraj.Logistics;

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

import com.owaisinews.rahulraj.Agent.Agent_Company;
import com.owaisinews.rahulraj.Loader.IndustryPager;
import com.owaisinews.rahulraj.Loader.PagerAdapter;
import com.owaisinews.rahulraj.R;



public class Logistics extends Fragment {

    TabLayout layout;
    ViewPager pager;
    LogisticsPager adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.logistics , container , false);
        layout =  (TabLayout)view.findViewById(R.id.tab);
        pager =  (ViewPager)view.findViewById(R.id.pager);

        layout.addTab(layout.newTab().setText("PERSONAL"));
        layout.addTab(layout.newTab().setText("COMPANY"));
        layout.addTab(layout.newTab().setText("CONTACT"));
        layout.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new LogisticsPager(getChildFragmentManager(), layout.getTabCount());
        pager.setAdapter(adapter);
        layout.setupWithViewPager(pager);

        layout.getTabAt(0).setText("PERSONAL");
        layout.getTabAt(1).setText("COMPANY");
        layout.getTabAt(2).setText("CONTACT");
        return  view;
    }

    public class LogisticsPager extends FragmentStatePagerAdapter {

        int tab;

        public LogisticsPager(FragmentManager fm , int List) {
            super(fm);
            this.tab = List;
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0)
            {
                return new Logi_Personal();
            }
            else if (position == 1)
            {
                return new Logi_Company();
            }
            else if (position == 2)
            {
                return new Logi_Contact();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
