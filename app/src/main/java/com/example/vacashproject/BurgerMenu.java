//package com.example.vacashproject;
//
//import static com.example.vacashproject.R.id.drawer_layout;
//import static com.example.vacashproject.R.id.home;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//
//import com.google.android.material.navigation.NavigationView;
//
//public class BurgerMenu extends AppCompatActivity {
//    DrawerLayout drawerLayout;
//    NavigationView navigationView;
//    ActionBarDrawerToggle drawerToggle;
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item){
//        if(drawerToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.burger_menu);
//
//        drawerLayout = findViewById(R.id.drawer_layout);
//        navigationView = findViewById(R.id.nav_view);
//        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
//        drawerLayout.addDrawerListener(drawerToggle);
//        drawerToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
////            @SuppressLint("NonConstantResourceId")
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////                int itemId = item.getItemId();
////                if (itemId == R.id.home) {
////                    Toast.makeText(BurgerMenu.this, "Home Selected", Toast.LENGTH_SHORT).show();
////                } else if (itemId == R.id.profile) {
////                    Toast.makeText(BurgerMenu.this, "Profile Selected", Toast.LENGTH_SHORT).show();
////                } else if (itemId == R.id.logout) {
////                    Toast.makeText(BurgerMenu.this, "Logout Selected", Toast.LENGTH_SHORT).show();
////                }
////                return false;
//
////                switch (item.getItemId()){
////                    case R.id.home:{
////                        Toast.makeText(BurgerMenu.this, "Home Selected", Toast.LENGTH_SHORT).show();
////                        break;
////                    }
////
////                    case R.id.profile:{
////
////                    }
////                    case R.id.logout:{
////
////                    }
////
////
////                }
////                return false;
//                int itemId = item.getItemId();
//
//                if (itemId == R.id.home) {
//                    Toast.makeText(BurgerMenu.this, "Home Selected", Toast.LENGTH_SHORT).show();
//                } else if (itemId == R.id.profile) {
//                    Toast.makeText(BurgerMenu.this, "Profile Selected", Toast.LENGTH_SHORT).show();
//                } else if (itemId == R.id.logout) {
//                    Toast.makeText(BurgerMenu.this, "Logout Selected", Toast.LENGTH_SHORT).show();
//                }
//                return false;
//            }
//        });
//    }
//
//    @Override
//    public void onBackPressed(){
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//            drawerLayout.closeDrawer(GravityCompat.START);
//        }
//        else{
//            super.onBackPressed();
//        }
//    }
//}
