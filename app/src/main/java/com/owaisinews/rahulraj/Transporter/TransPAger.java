package com.owaisinews.rahulraj.Transporter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.owaisinews.rahulraj.Loader.Industry_company;
import com.owaisinews.rahulraj.Loader.Industry_contact;
import com.owaisinews.rahulraj.Loader.Industry_personal;


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
            return new Agent_Transport();
        }

        return null;
    }
    @Override
    public int getCount() {
        return 2;
    }
}
