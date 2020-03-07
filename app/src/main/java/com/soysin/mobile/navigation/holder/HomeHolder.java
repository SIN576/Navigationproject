package com.soysin.mobile.navigation.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soysin.mobile.navigation.R;

public class HomeHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public HomeHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.tv_home_name);
    }
}
