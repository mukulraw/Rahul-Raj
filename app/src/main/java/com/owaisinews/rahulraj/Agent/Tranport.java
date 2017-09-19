package com.owaisinews.rahulraj.Agent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.owaisinews.rahulraj.R;


public class Tranport extends Fragment {

    TabLayout layout;
    ViewPager pager;
    TransportPager adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.transport , container , false);

        layout =  (TabLayout)view.findViewById(R.id.tab);
        pager =  (ViewPager)view.findViewById(R.id.pager);

        layout.addTab(layout.newTab().setText("PERSONAL"));
        layout.addTab(layout.newTab().setText("CONTACT"));
        layout.addTab(layout.newTab().setText("COMPANY"));
        layout.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new TransportPager(getChildFragmentManager(), layout.getTabCount());
        pager.setAdapter(adapter);
        layout.setupWithViewPager(pager);

        layout.getTabAt(0).setText("PERSONAL");
        layout.getTabAt(1).setText("CONTACT");
        layout.getTabAt(2).setText("COMPANY");

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        Trans_Personal fragment = new Trans_Personal();
        ft.replace(R.id.replace, fragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        ft.commit();

        return view;
    }
}
