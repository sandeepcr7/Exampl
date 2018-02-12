package com.example.nex4jmw.example;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by NEX4JMW on 1/29/2018.
 */
public class Android extends Fragment {
    ListView listView;
    String[] players={"Ander Herera","Wayne Rooney","David DeGea","Robin Van Persie",
            "Juan Mata","Michael Carrick","Chris Smalling","Phil Jones"};


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View android1 = inflater.inflate(R.layout.android_frag, container, false);
        ListView listView= (ListView) android1.findViewById(R.id.list);
       ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,players);
        listView.setAdapter(adapter);

        return android1;
    }}