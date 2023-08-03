package com.example.vacashproject;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.vacashproject.Adapters.TabAdapter;
import com.example.vacashproject.Models.Item;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class HomePage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    // burger2
    DrawerLayout drawerLayout;
    NavigationView navigationView;

   androidx.appcompat.widget.Toolbar toolbar;
    // end burger2

    TabLayout tabLayout;
    ViewPager2 viewPager;

    TabAdapter adapter;

    ViewPager carouselContainer;

    Toolbar burger_button;

    CarouselAdapter carouselAdapter;
    // Posisi image sekarang dimana
    int currImage = 0;
    int image1 = R.drawable.image1;
    int image2 = R.drawable.image2;
    int image3 = R.drawable.image3;
    int image4 = R.drawable.image4;
    int[] carouselImages = {image1, image2, image3, image4};


    //burger

//    public void onHomeClick(MenuItem item) {
////        Log.d("MyTag", "test masuk");
//        Intent homeIntent = new Intent(HomePage.this, HomePage.class);
//        startActivity(homeIntent);
//    }
//
//    public void onProfileClick(MenuItem item) {
//        Intent profileIntent = new Intent(HomePage.this, ProfilePage.class);
//        startActivity(profileIntent);
//    }
//
//
//    public void onLogoutClick(MenuItem item) {
//        Intent logoutIntent = new Intent(HomePage.this, Login.class);
//        startActivity(logoutIntent);
//    }
    //endburger
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // burger2
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        // toolbar.setNavigationIcon(R.drawable.baseline_menu_24);
        toolbar.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );

        // Mengakses ikon burger
        ImageView burgerIcon = findViewById(R.id.burgerIcon);
        burgerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START); // Ganti dengan GRAVITY yang sesuai
            }
        });

        // Mengakses ikon panah
        ImageView arrowIcon = findViewById(R.id.arrowIcon);
        arrowIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Aksi saat tombol panah kembali ditekan
            }
        });

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


//    @Override
//    public void onBackPressed(){
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//            drawerLayout.closeDrawer(GravityCompat.START);
//        }else{
//            super.onBackPressed();
//        }
//    }

    //doamikel
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        Integer id = item.getItemId();
//
//        if(id == R.id.home){
//            Intent HomeActivity = new Intent(HomePage.this, HomePage.class);
//            startActivity(HomeActivity);
//        } else if (id == R.id.profile) {
//            Intent ProfileActivity = new Intent(HomePage.this, ProfilePage.class);
//            startActivity(ProfileActivity);
//        } else if (id == R.id.logout) {
//            Intent LogoutActivity = new Intent(HomePage.this, Login.class);
//            startActivity(LogoutActivity);
//        }
//
//        return true;
//    }
    // end doa mikel

    private static final int NAV_HOME = R.id.nav_home;
    private static final int NAV_PROFILE = R.id.nav_profile;
    private static final int NAV_LOGOUT = R.id.nav_logout;

    public enum NavigationItem {
        HOME(R.id.nav_home),
        PROFILE(R.id.nav_profile),
        LOGOUT(R.id.nav_logout);

        private final int itemId;

        NavigationItem(int itemId) {
            this.itemId = itemId;
        }

        public int getItemId() {
            return itemId;
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        try {
            Log.d(TAG, "onNavigationItemSelected: " + item.getItemId());
//            switch (item.getItemId()) {
//                case NAV_HOME:
//                    Intent toHome = new Intent(HomePage.this, HomePage.class);
//                    startActivity(toHome);
//                    break;
//                case NAV_PROFILE:
//                    Intent toProfile = new Intent(HomePage.this, ProfilePage.class);
//                    startActivity(toProfile);
//                    break;
//                case NAV_LOGOUT:
//                    Intent logout = new Intent(HomePage.this, Login.class);
//                    logout.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                    startActivity(logout);
//                    break;
//            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}


