package com.example.faceboke.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.faceboke.ui.Fragment4;
import com.example.faceboke.ui.Home1Fragment;
import com.example.faceboke.ui.MenuFragment;
import com.example.faceboke.ui.NoteficationFragment;
import com.example.faceboke.ui.ProfFragment;
import com.example.faceboke.ui.VedioFragment;

public class MainViewPagerAdapter extends FragmentStateAdapter {
    private  int count;

    public MainViewPagerAdapter(@NonNull FragmentManager fragmentManager,
                                @NonNull Lifecycle lifecycle, int count) {
        super(fragmentManager, lifecycle);
        this.count=count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Home1Fragment();
            case 1:
                return new VedioFragment();
            case 2:
                return new ProfFragment();
            case 3:
                return new Fragment4();
            case 4:
                return new NoteficationFragment();
            case 5:
                return new MenuFragment();
        }
        return new  Fragment();
    }

    @Override
    public int getItemCount() {
        return count;
    }
}
