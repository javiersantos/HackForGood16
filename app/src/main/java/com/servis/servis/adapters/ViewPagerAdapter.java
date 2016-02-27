package com.servis.servis.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alejandrohall on 26/02/16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragmentList;
    private List<String> mTitleList;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

        this.mFragmentList = new ArrayList<>();
        this.mTitleList = new ArrayList<>();
    }

    public void add(Fragment fragment, String title){
        this.mTitleList.add(title);
        this.mFragmentList.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}
