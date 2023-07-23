package com.example.vacashproject.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.vacashproject.Console;
import com.example.vacashproject.Mobile;
import com.example.vacashproject.PC;

public class TabAdapter extends FragmentStateAdapter {

    public TabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Mobile();
            case 1: return new PC();
            case 2: return new Console();

        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
