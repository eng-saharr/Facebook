package com.example.faceboke.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.faceboke.R;
import com.example.faceboke.data.model.UserModel;
import com.example.faceboke.ui.adapter.Home1Adapter;

import java.util.ArrayList;


public class Home1Fragment extends Fragment {
    RecyclerView Home1Recycler;
    ArrayList<UserModel>posts =new ArrayList<>();
    Home1Adapter home1Adapter;


    public Home1Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecycler(view);
    }
    private void setupRecycler(View view){
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.aya,R.drawable.face,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.facebok,R.drawable.ic_launcher_background,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.proff,R.drawable.py,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.img,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.proff,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.img,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.ic_launcher_background,R.drawable.rr,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"saharnayle","now","ttfffffffffffff"));
        Home1Recycler=view.findViewById(R.id.face_recycler);
        home1Adapter=new Home1Adapter(posts);
        Home1Recycler.setAdapter(home1Adapter);
        Home1Recycler.setLayoutManager(new LinearLayoutManager(requireContext()));

    }
}