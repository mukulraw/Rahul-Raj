package com.owaisinews.rahulraj.Loader;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.owaisinews.rahulraj.Logistics.Logistics;


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
