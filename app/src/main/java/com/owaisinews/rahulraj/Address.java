package com.owaisinews.rahulraj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Address extends Fragment {

    RecyclerView recyclerView;
    GridLayoutManager manager;
    AddressAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.address , container , false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler);
        manager = new GridLayoutManager(getContext(),1);
        adapter = new AddressAdapter(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        return view;
    }
}
