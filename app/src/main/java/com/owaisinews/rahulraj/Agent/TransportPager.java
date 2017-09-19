package com.owaisinews.rahulraj.Agent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class TransportPager extends FragmentStatePagerAdapter {

    int tab;
    public TransportPager(FragmentManager fm , int List) {
        super(fm);
        this.tab = List;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
        {
            return new Trans_Personal();
        }
        else if (position == 1)
        {
            return new Trans_Company();
        }
        else if (position == 2)
        {
            return new Trans_Contact();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
