package com.ademarfamiftahulhidayah202102314.login;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
    public ImageView _jkimageview;
    public TextView _jktextview;
    public TextView _jptextview;
    public TextView _namatextview;
    public TextView _nimtextview;
    public MahasiswaViewHolder(@NonNull View itemView) {
        super(itemView);

        _jkimageview = itemView.findViewById(R.id.jkimageview);
        _jktextview = itemView.findViewById(R.id.jktextview);
        _jptextview = itemView.findViewById(R.id.jptextview);
        _namatextview = itemView.findViewById(R.id.namatextview);
        _nimtextview = itemView.findViewById(R.id.nimtextview);
    }
}
