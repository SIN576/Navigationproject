package com.soysin.mobile.navigation.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.soysin.mobile.navigation.R;
import com.soysin.mobile.navigation.adapter.HomeAdapter;
import com.soysin.mobile.navigation.model.HomeModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    TextView textView;
    RecyclerView recyclerView;
    HomeAdapter adapter;
    ArrayList<HomeModel> listModels;

    View root;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_home, container, false);
        textView = root.findViewById(R.id.tv_home_name);
        recyclerView = root.findViewById(R.id.recycler_view);
        listModels = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            HomeModel model = new HomeModel();
            model.setName("Soy Sin"+i);
            listModels.add(model);
        }
        recyclerView.setLayoutManager(new GridLayoutManager(root.getContext(),3));
        adapter = new HomeAdapter(root.getContext(),listModels);
        recyclerView.setAdapter(adapter);

        return root;
    }
}
