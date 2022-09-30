package com.example.findmyway_app;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class settings_frag extends Fragment {

    View view;
    //Unit system buttons variables
    Button btn_kilometers,btn_miles;

    //Transport mode buttons variables
    Button btn_walk,btn_cycle,btn_drive;

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_settings_frag, container, false);
        UnitSystemOptions();
        TransModeOptions();
        return  view;
    }

    public void UnitSystemOptions()
    {
        btn_kilometers=(Button) view.findViewById(R.id.btn_kilometers);
        btn_miles=(Button) view.findViewById(R.id.btn_miles);

        btn_kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_kilometers.setBackgroundColor(Color.rgb(107, 197, 93));
                btn_miles.setBackgroundColor(Color.rgb(243, 241, 241));

                btn_kilometers.setTextColor(Color.WHITE);
                btn_miles.setTextColor(Color.BLACK);
            }
        });

        btn_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_miles.setBackgroundColor(Color.rgb(107, 197, 93));
                btn_kilometers.setBackgroundColor(Color.rgb(243, 241, 241));

                btn_miles.setTextColor(Color.WHITE);
                btn_kilometers.setTextColor(Color.BLACK);
            }
        });
    }

    public void  TransModeOptions()
    {
        //declaring transport mode buttons
        btn_walk=(Button) view.findViewById(R.id.btn_walk);
        btn_cycle=(Button) view.findViewById(R.id.btn_cycle);
        btn_drive=(Button) view.findViewById(R.id.btn_drive);

        //declaring transport mode images
        Drawable img_walk_NotSelected=btn_walk.getContext().getResources().getDrawable(R.drawable.trans_walk_not_selected);
        Drawable img_cycle_NotSelected=btn_walk.getContext().getResources().getDrawable(R.drawable.trans_cycle_not_selected);
        Drawable img_drive_NotSelected=btn_walk.getContext().getResources().getDrawable(R.drawable.trans_car_not_selected);

        Drawable img_walk_Selected=btn_walk.getContext().getResources().getDrawable(R.drawable.trans_walk_selected);
        Drawable img_cycle_Selected=btn_walk.getContext().getResources().getDrawable(R.drawable.trans_cycle_selected);
        Drawable img_drive_Selected=btn_walk.getContext().getResources().getDrawable(R.drawable.trans_car_selected);


        btn_walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_walk.setBackgroundColor(Color.rgb(107,197,93));
                btn_cycle.setBackgroundColor(Color.rgb(243, 241, 241));
                btn_drive.setBackgroundColor(Color.rgb(243, 241, 241));

                btn_walk.setTextColor(Color.WHITE);
                btn_cycle.setTextColor(Color.BLACK);
                btn_drive.setTextColor(Color.BLACK);

                btn_walk.setCompoundDrawablesWithIntrinsicBounds(img_walk_Selected,null,null,null);
                btn_cycle.setCompoundDrawablesWithIntrinsicBounds(img_cycle_NotSelected,null,null,null);
                btn_drive.setCompoundDrawablesWithIntrinsicBounds(img_drive_NotSelected,null,null,null);
            }
        });

        btn_cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_walk.setBackgroundColor(Color.rgb(243, 241, 241));
                btn_cycle.setBackgroundColor(Color.rgb(107,197,93));
                btn_drive.setBackgroundColor(Color.rgb(243, 241, 241));

                btn_walk.setTextColor(Color.BLACK);
                btn_cycle.setTextColor(Color.WHITE);
                btn_drive.setTextColor(Color.BLACK);

                btn_walk.setCompoundDrawablesWithIntrinsicBounds(img_walk_NotSelected,null,null,null);
                btn_cycle.setCompoundDrawablesWithIntrinsicBounds(img_cycle_Selected,null,null,null);
                btn_drive.setCompoundDrawablesWithIntrinsicBounds(img_drive_NotSelected,null,null,null);
            }
        });

        btn_drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_walk.setBackgroundColor(Color.rgb(243, 241, 241));
                btn_cycle.setBackgroundColor(Color.rgb(243, 241, 241));
                btn_drive.setBackgroundColor(Color.rgb(107,197,93));

                btn_walk.setTextColor(Color.BLACK);
                btn_cycle.setTextColor(Color.BLACK);
                btn_drive.setTextColor(Color.WHITE);

                btn_walk.setCompoundDrawablesWithIntrinsicBounds(img_walk_NotSelected,null,null,null);
                btn_cycle.setCompoundDrawablesWithIntrinsicBounds(img_cycle_NotSelected,null,null,null);
                btn_drive.setCompoundDrawablesWithIntrinsicBounds(img_drive_Selected,null,null,null);
            }
        });
    }
}