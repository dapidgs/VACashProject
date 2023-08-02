package com.example.vacashproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Console#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Console extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Console() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Console.
     */
    // TODO: Rename and change types and number of parameters
    public static Console newInstance(String param1, String param2) {
        Console fragment = new Console();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_console, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        List<HomePageItem> items = new ArrayList<HomePageItem>();

        items.add(new HomePageItem("Minecraft", R.drawable.minecraft_logo, "Console"));
        items.add(new HomePageItem("Mario Bros", R.drawable.mario_logo, "Console"));
        items.add(new HomePageItem("Overwatch", R.drawable.overwatch_logo, "Console"));
        items.add(new HomePageItem("Apex Legends", R.drawable.apex_logo, "Console"));
        items.add(new HomePageItem("Fortnite", R.drawable.fortnite_logo, "Console"));

        recyclerView.setAdapter(new MyAdapter(view.getContext(), items));
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));

        return view;
    }
}