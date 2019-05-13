package com.example.heydi.tabs_simple.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import com.example.heydi.tabs_simple.R;
import com.example.heydi.tabs_simple.fragments.EightFragment;
import com.example.heydi.tabs_simple.fragments.FiveFragment;
import com.example.heydi.tabs_simple.fragments.FourFragment;
import com.example.heydi.tabs_simple.fragments.NineFragment;
import com.example.heydi.tabs_simple.fragments.OneFragment;
import com.example.heydi.tabs_simple.fragments.SevenFragment;
import com.example.heydi.tabs_simple.fragments.SixFragment;
import com.example.heydi.tabs_simple.fragments.TenFragment;
import com.example.heydi.tabs_simple.fragments.TwoFragment;
import com.example.heydi.tabs_simple.fragments.ThreeFragment;


public class Main2Activity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager=(ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout=(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter= new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");
        adapter.addFragment(new FourFragment(), "FOUR");
        adapter.addFragment(new FiveFragment(), "FIVE");
        adapter.addFragment(new SixFragment(), "SIX");
        adapter.addFragment(new SevenFragment(), "SEVEN");
        adapter.addFragment(new EightFragment(), "EIGHT");
        adapter.addFragment(new NineFragment(), "NINE");
        adapter.addFragment(new TenFragment(), "TEN");
        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> mFragmentList= new ArrayList<>();
        private final List <String> mFragmentTitleList= new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager){
            super(manager);
        }
        @Override
        public Fragment getItem(int position){
            return mFragmentList.get(position);
        }
        @Override
        public int getCount(){
            return mFragmentTitleList.size();
        }
        public void addFragment(Fragment fragment, String title){
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
        @Override
        public CharSequence getPageTitle(int position){
            return mFragmentTitleList.get(position);
        }
    }
}

