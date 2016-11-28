package com.cornez.actionbarexperiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AppetizerFragment tab1 = new AppetizerFragment();
                return tab1;
            case 1:
                EntreeFragment tab2 = new EntreeFragment();
                return tab2;
            case 2:
                DessertFragment tab3 = new DessertFragment();
                return tab3;
            case 3:
                DinnerFragment tab4 = new DinnerFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
