package com.example.experiment3;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class weixin extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter myadapter;
    private List<String> list = new ArrayList<>();
    private Context context;




    public weixin() {

    }

    private void initData(){
        for(int i=0;i<10;i++) {
            list.add("联系人" + i );
        }
    }

    private void initView3(){
        context=this.getActivity();
        myadapter=new MyAdapter(list,context);

        LinearLayoutManager manager3=new LinearLayoutManager(context);
        manager3.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(manager3);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_weixin, container, false);
        recyclerView=view.findViewById(R.id.recycleview);
        initData();
        initView3();
        return view;
    }

}
