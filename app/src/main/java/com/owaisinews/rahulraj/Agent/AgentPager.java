package com.owaisinews.rahulraj.Agent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.owaisinews.rahulraj.Loader.Industry_company;
import com.owaisinews.rahulraj.Loader.Industry_contact;
import com.owaisinews.rahulraj.Loader.Industry_personal;


public class AgentPager extends FragmentStatePagerAdapter {

    int tab;

    public AgentPager(FragmentManager fm , int List) {
        super(fm);
        this.tab = List;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
        {
            return new Agent_Personal();
        }
        else if (position == 1)
        {
            return new Agent_Contact();
        }
        else if (position == 2)
        {
            return new Agent_Company();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
