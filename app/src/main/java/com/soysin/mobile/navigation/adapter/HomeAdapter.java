package com.soysin.mobile.navigation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soysin.mobile.navigation.R;
import com.soysin.mobile.navigation.holder.HomeHolder;
import com.soysin.mobile.navigation.model.HomeModel;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeHolder> {
    Context context;
    ArrayList<HomeModel> homeModels;

    public HomeAdapter(Context context, ArrayList<HomeModel> homeModels) {
        this.context = context;
        this.homeModels = homeModels;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,null);
        return new HomeHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        holder.textView.setText(homeModels.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return homeModels.size();
    }
}
