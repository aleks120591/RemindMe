package com.qoobico.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qoobico.remindme.fragment.ExamplFragment;

/**
 * Created by Warlock on 09.06.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab 1",
                "Tab 2",
                "Tab 3"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return ExamplFragment.getInstance();
            }
            case 1:{
                return ExamplFragment.getInstance();
            }
            case 2:{
                return ExamplFragment.getInstance();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
