package com.qoobico.remindme.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qoobico.remindme.R;

/**
 * Created by Warlock on 09.06.2016.
 */
public class ExamplFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_example;
    private View view;

    public static ExamplFragment getInstance(){
        Bundle args = new Bundle();
        ExamplFragment fragment = new ExamplFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }
}
