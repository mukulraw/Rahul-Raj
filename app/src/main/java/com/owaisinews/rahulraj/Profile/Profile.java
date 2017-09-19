package com.owaisinews.rahulraj.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.owaisinews.rahulraj.Agent.Agent;
import com.owaisinews.rahulraj.Agent.AgentPager;
import com.owaisinews.rahulraj.Agent.Agent_Company;
import com.owaisinews.rahulraj.Agent.Agent_Contact;
import com.owaisinews.rahulraj.Agent.Agent_Personal;
import com.owaisinews.rahulraj.R;

public class Profile extends Fragment {

    TabLayout layout;
    ViewPager pager;
    ProfilePager adapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.profile , container , false);
        layout =  (TabLayout)view.findViewById(R.id.tab);
        pager =  (ViewPager)view.findViewById(R.id.pager);

        layout.addTab(layout.newTab().setText("PERSONAL"));
        layout.addTab(layout.newTab().setText("CONTACT"));
        layout.addTab(layout.newTab().setText("COMPANY"));
        layout.setTabGravity(TabLayout.GRAVITY_FILL);

        adapter = new ProfilePager(getChildFragmentManager(), layout.getTabCount());
        pager.setAdapter(adapter);
        layout.setupWithViewPager(pager);

        layout.getTabAt(0).setText("PERSONAL");
        layout.getTabAt(1).setText("CONTACT");
        layout.getTabAt(2).setText("COMPANY");


        return  view;
    }

    public class ProfilePager extends FragmentStatePagerAdapter {

        int tab;

        public ProfilePager(FragmentManager fm , int List) {
            super(fm);
            this.tab = List;
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0)
            {
                return new Profile_Personal();
            }
            else if (position == 1)
            {
                return new Profile_Contact();
            }
            else if (position == 2)
            {
                return new Profile_Company();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}
