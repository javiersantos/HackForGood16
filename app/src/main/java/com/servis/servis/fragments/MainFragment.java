package com.servis.servis.fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.servis.servis.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    @Bind(R.id.tabLayout)
    TabLayout mTablayout;
    @Bind(R.id.viewPager)
    ViewPager mViewPager;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,rootView);

        configureViewPager();

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    public void configureViewPager(){
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getChildFragmentManager());

        pagerAdapter.add(new NearestFragment(), "Cercanos");
        pagerAdapter.add(new CheapestFragment(), "Baratos");
        pagerAdapter.add(new BestRankedFragment(), "Puntuados");

        mViewPager.setAdapter(pagerAdapter);

        mTablayout.setTabMode(TabLayout.MODE_FIXED);
        mTablayout.setupWithViewPager(mViewPager);
    }
}
