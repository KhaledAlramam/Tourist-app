package com.example.chucky.touristapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//FINISHED
//Custom ViewPagerAdapter

public class PlacesPageAdapter extends FragmentPagerAdapter {
    private Context mContext;

    PlacesPageAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext=context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new Historical();
        }else if (position==1){
            return new Restaurents();
        }else if (position==2){
            return new Beaches();
        }else {
            return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return mContext.getString(R.string.places);
        }else if (position==1){
            return mContext.getString(R.string.restaurents);
        }else if (position==2){
            return mContext.getString(R.string.beaches);
        }else {
            return mContext.getString(R.string.events);
        }
    }
}
