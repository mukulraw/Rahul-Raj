package com.owaisinews.rahulraj.Transporter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;



public class IndiPager extends FragmentStatePagerAdapter {

    int tab;
    public IndiPager(FragmentManager fm , int List) {
        super(fm);
        this .tab = List;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
        {
            return new Indi_Personal();
        }
        else if (position == 1)
        {
            return new Indi_Company();
        }
        else if (position == 2)
        {
            return new Indi_Contact();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
