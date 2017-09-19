package com.owaisinews.rahulraj.Logistics;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.owaisinews.rahulraj.Loader.Industry_company;
import com.owaisinews.rahulraj.Loader.Industry_contact;
import com.owaisinews.rahulraj.Loader.Industry_personal;


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
            return new Logi_Contact();
        }
        else if (position == 2)
        {
            return new Logi_Company();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
