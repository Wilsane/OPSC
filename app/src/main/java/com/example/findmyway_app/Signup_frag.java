package com.example.findmyway_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Signup_frag extends Fragment {


    View view;
    Button btn_ToMainContent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_signup_frag,container,false);

        btn_ToMainContent=(Button) view.findViewById(R.id.button4);

        btn_ToMainContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toContents();
            }
        });
        return  view;

    }

    //
    public void toContents()
    {
        Intent to_menuAndactivities=new Intent(getActivity(),menu_And_Activites.class);
        startActivity(to_menuAndactivities);
    }

}