package com.jonaxel.draweractivity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jonathan on 19/11/14.
 */
public class FragmentMap extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.map_layout, container,
                false);
        
        initPagin();
        
        return view;
    }

    private void initPagin() {

    }
}
