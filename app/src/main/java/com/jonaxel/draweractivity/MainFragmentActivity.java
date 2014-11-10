package com.jonaxel.draweractivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;
import java.util.Vector;

/**
 * Created by jonathan on 9/11/14.
 */
public class MainFragmentActivity extends FragmentActivity {

    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);


        initPagin();

    }


    private void initPagin() {
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, Fragment1.class.getName()));
        fragments.add(Fragment.instantiate(this, Fragment2.class.getName()));
        fragments.add(Fragment.instantiate(this, Fragment3.class.getName()));
        mPagerAdapter = new PageAdapter(this.getSupportFragmentManager(), fragments);

        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setPageTransformer(true, new ZoomOutPageTransformer());
        pager.setAdapter(mPagerAdapter);

    }
}
