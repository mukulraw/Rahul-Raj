package com.owaisinews.rahulraj.Loader;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.owaisinews.rahulraj.Transporter.Indi_Company;


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
            return new Industry_company();
        }
        else if (position == 2)
        {
            return new Industry_contact();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
