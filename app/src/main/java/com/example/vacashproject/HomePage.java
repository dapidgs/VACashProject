package com.example.vacashproject;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.vacashproject.Adapters.TabAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class HomePage extends AppCompatActivity {

    // burger2
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    // end burger2

    TabLayout tabLayout;
    ViewPager2 viewPager;

    TabAdapter adapter;

    ViewPager carouselContainer;

    CarouselAdapter carouselAdapter;
    // Posisi image sekarang dimana
    int currImage = 0;
    int image1 = R.drawable.image1;
    int image2 = R.drawable.image2;
    int image3 = R.drawable.image3;
    int image4 = R.drawable.image4;
    int[] carouselImages = {image1, image2, image3, image4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // burger2
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.baseline_menu_24);



        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();

        // end burger2

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        adapter = new TabAdapter(getSupportFragmentManager(), getLifecycle());

        viewPager.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Mobile"));
        tabLayout.addTab(tabLayout.newTab().setText("PC"));
        tabLayout.addTab(tabLayout.newTab().setText("Console"));

        // klik tab -> untuk menyinkronkan ke viewpager
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        // swipe fragment -> tabnya bakal disinkronkan juga

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

        carouselContainer = findViewById(R.id.carouselContainer);

        // create adapter
        carouselAdapter = new CarouselAdapter(this, carouselImages);
        carouselContainer.setAdapter(carouselAdapter);

        imageChange();
    }

    void imageChange(){
        carouselContainer.postDelayed(new Runnable() {
            @Override
            public void run() {
                currImage = (carouselContainer.getCurrentItem() +1) % carouselImages.length;
                carouselContainer.setCurrentItem(currImage);
                // kalau sudah jalan lanjut jalanin lagi
                imageChange();
            }
            // dalam milliseconds
        }, 3000);
    }
}
