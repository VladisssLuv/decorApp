package com.hackathon.decor.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.hackathon.decor.R;
import com.hackathon.decor.adapter.ToolsAdapter;
import com.hackathon.decor.db.Tools;
import com.hackathon.decor.view.ToolsView;

import java.util.List;

public class ToolsDialog extends BottomSheetDialogFragment implements ToolsView {

    private ToolsAdapter adapter;
    TextView name;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.tools_dialog, container, false);


        name = v.findViewById(R.id.name_tools);
        recyclerView = v.findViewById(R.id.rv);


        return v;
    }


    @Override
    public void getTools(List<Tools> data) {
        if(!data.isEmpty()){
            adapter = new ToolsAdapter(getContext(), data, (click, id)->{

            });

        }
    }
}
