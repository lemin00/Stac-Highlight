package com.smc.android.highlight;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView mTitle;
    public TextView mName;
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mTitle = (TextView) itemView.findViewById(R.id.tv_title);
        mName = (TextView) itemView.findViewById(R.id.tv_name);
    }
}

