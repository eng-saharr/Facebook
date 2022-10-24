package com.example.faceboke.ui;

import static com.example.faceboke.R.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.faceboke.R;
import com.example.faceboke.ui.adapter.MainViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity2 extends AppCompatActivity {
    private ViewPager2 mainViewPager;
    private MainViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_home2);
        initViewpager();
    }

    private void initViewpager() {
        viewPagerAdapter=new MainViewPagerAdapter(getSupportFragmentManager(),
           this.getLifecycle(),3);
        mainViewPager=findViewById(id.view_pager);
        mainViewPager.setAdapter(viewPagerAdapter);
        tabLayout=findViewById(id.tab_layout);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mainViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mainViewPager.registerOnPageChangeCallback(onPageChangeCallback);


    }
    private ViewPager2.OnPageChangeCallback onPageChangeCallback=new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            tabLayout.selectTab(tabLayout.getTabAt(position));
        }
    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainViewPager.unregisterOnPageChangeCallback(onPageChangeCallback);
    }


}