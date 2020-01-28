package com.example.music.UI.main;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.music.fragment.ExploreFragment;
import com.example.music.fragment.LibraryFragment;
import com.example.music.fragment.SearchFragment;
import com.example.music.fragment.SettingsFragment;
import com.example.music.fragment.TrendingFragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    private  int totalTabs;

    public FragmentAdapter(Context context , FragmentManager fm, int totalTabs) {
        super(  fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.totalTabs=totalTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                ExploreFragment exploreFragment = new ExploreFragment();
                return exploreFragment;
            case 1:

                TrendingFragment trendingFragment = new TrendingFragment();
                return trendingFragment;

            case 2:

                SearchFragment searchFragment = new SearchFragment();
                return searchFragment;

            case 3:

                LibraryFragment libraryFragment = new LibraryFragment();
                return libraryFragment;


            case 4:

                SettingsFragment settingsFragment = new SettingsFragment();
                return settingsFragment;


            default:
                return null;
        }
    }

    @Override
    public int getCount() { return totalTabs; }

}
