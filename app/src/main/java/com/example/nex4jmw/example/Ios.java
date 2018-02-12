package com.example.nex4jmw.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by NEX4JMW on 1/29/2018.
 */
public class Ios extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View ios = inflater.inflate(R.layout.ios_frag, container, false);

        return ios;
    }}