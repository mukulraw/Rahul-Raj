package com.owaisinews.rahulraj.Transporter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.owaisinews.rahulraj.Agent.AgentPager;
import com.owaisinews.rahulraj.Loader.IndustryPager;
import com.owaisinews.rahulraj.R;


public class Agent_Transport extends Fragment {

    TabLayout layout;
    ViewPager pager;
    AgentPager adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.agent_transport , container , false);

        layout =  (TabLayout)view.findViewById(R.id.tab);
        pager =  (ViewPager)view.findViewById(R.id.pager);

        layout.addTab(layout.newTab().setText("AGENT"));
        layout.addTab(layout.newTab().setText("TRANSPORT"));
        layout.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new AgentPager(getChildFragmentManager(), layout.getTabCount());
        pager.setAdapter(adapter);
        layout.setupWithViewPager(pager);

        layout.getTabAt(0).setText("AGENT");
        layout.getTabAt(1).setText("TRANSPORT");
        return view;
    }
}
