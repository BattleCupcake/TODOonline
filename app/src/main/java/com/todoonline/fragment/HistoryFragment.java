package com.todoonline.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.todoonline.R;
import com.todoonline.adapter.TODOListAdapter;
import com.todoonline.data.TODOdata;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AbstractTabFragment {

    public static final int LAYOUT = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        RecyclerView rv = view.findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new TODOListAdapter(createMockData()));
        return view;
    }
    private List<TODOdata> createMockData(){
        List<TODOdata> data = new ArrayList<>();
        data.add(new TODOdata("Item 1"));
        data.add(new TODOdata("Item 2"));
        data.add(new TODOdata("Item 3"));
        data.add(new TODOdata("Item 4"));
        data.add(new TODOdata("Item 5"));
        data.add(new TODOdata("Item 6"));
        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
