package com.muddapeople.thetwo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by antoine on 14/06/2016.
 */
public class section2 extends Fragment{
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.section2_layout,container, false);
        return rootview;
    }
}
