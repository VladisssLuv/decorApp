package com.hackathon.decor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hackathon.decor.R;
import com.hackathon.decor.db.Tools;

import java.util.List;

public class ToolsAdapter extends RecyclerView.Adapter<ToolsAdapter.LabdelHolder> {
    private Context context;
    private List<Tools> data;

    public OnItemClickListener mItemClickListener;

    public ToolsAdapter(Context context, List<Tools> data, OnItemClickListener mItemClickListener) {
        this.context = context;
        this.data = data;
        this.mItemClickListener = mItemClickListener;
    }

    @NonNull
    @Override
    public ToolsAdapter.LabdelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.tools_item, parent, false);
        return new LabdelHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ToolsAdapter.LabdelHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class LabdelHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public LabdelHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if (mItemClickListener != null) {
                mItemClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public interface OnItemClickListener {
        public void onItemClick(View view , int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }
}

