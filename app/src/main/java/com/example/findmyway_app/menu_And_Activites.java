package com.example.findmyway_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class menu_And_Activites extends AppCompatActivity {

    //Declaring variables
    LinearLayout location,explore,favourites,settings;
    ImageView img_location,img_explore,img_favourites,img_settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_and_activites);

        menuItemsSwitch();
    }

    /**Switching between fragments**/
    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragFrame,fragment);
        fragmentTransaction.commit();
    }

    /**activities associated with switching between fragments**/
    public void menuItemsSwitch()
    {
        //Initializing variables
        location=(LinearLayout) findViewById(R.id.menuItem_Location);
        explore=(LinearLayout) findViewById(R.id.menuItem_Explore);
        favourites=(LinearLayout) findViewById(R.id.menuItem_Favourites);
        settings=(LinearLayout) findViewById(R.id.menuItem_settings);

        img_location=(ImageView) findViewById(R.id.img_Location);
        img_explore=(ImageView) findViewById(R.id.img_explore);
        img_favourites=(ImageView)findViewById(R.id.img_favourites);
        img_settings=(ImageView)findViewById(R.id.img_settings);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Locations_frag());

                img_location.setImageResource(R.drawable.location_selected);
                img_explore.setImageResource(R.drawable.explore_not_selected);
                img_favourites.setImageResource(R.drawable.favourites_not_selected);
                img_settings.setImageResource(R.drawable.settings_not_selected);
            }
        });

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Explore_frag());

                img_location.setImageResource(R.drawable.location_not_selected);
                img_explore.setImageResource(R.drawable.explore_selected);
                img_favourites.setImageResource(R.drawable.favourites_not_selected);
                img_settings.setImageResource(R.drawable.settings_not_selected);
            }
        });

        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new favourites_frag());

                img_location.setImageResource(R.drawable.location_not_selected);
                img_explore.setImageResource(R.drawable.explore_not_selected);
                img_favourites.setImageResource(R.drawable.favorite_selected);
                img_settings.setImageResource(R.drawable.settings_not_selected);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new settings_frag());

                img_location.setImageResource(R.drawable.location_not_selected);
                img_explore.setImageResource(R.drawable.explore_not_selected);
                img_favourites.setImageResource(R.drawable.favourites_not_selected);
                img_settings.setImageResource(R.drawable.settings_selected);
            }
        });
    }
}
