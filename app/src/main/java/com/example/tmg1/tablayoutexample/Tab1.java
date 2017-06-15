package com.example.tmg1.tablayoutexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Tmg1 on 6/14/2017.
 */

public class Tab1 extends Fragment {
    Button btn ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.tab1,container,false);

        btn = (Button) view.findViewById(R.id.tab1_next);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager viewPager = (ViewPager) getActivity().findViewById(R.id.container);
                viewPager.setCurrentItem(1);
                /*android.support.v4.app.FragmentManager fragmentManager =getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Tab2 tab2 = new Tab2();
                fragmentTransaction.add(R.id.id_tab1,tab2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/



            }
        });

        return view;

        //false means do not attch to root view
    }
}
