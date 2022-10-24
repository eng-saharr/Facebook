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
        posts.add(new UserModel(R.drawable.rr,R.drawable.kk,"saharnayle","now","hallo"));
        posts.add(new UserModel(R.drawable.aya,R.drawable.ko,"Aya nayle","59 minutes ago","hi"));
        posts.add(new UserModel(R.drawable.facebok,R.drawable.ev,"walaaa","today,4:19   in the afternoon","merci"));
        posts.add(new UserModel(R.drawable.proff,R.drawable.fb,"Roaa taha ","now "," ok"));
        posts.add(new UserModel(R.drawable.img,R.drawable.aya,"Dina","1 day","nice"));
        posts.add(new UserModel(R.drawable.proff,R.drawable.img,"maha hussien","15 minutes ago",""));
        posts.add(new UserModel(R.drawable.rr,R.drawable.py,"hager ","now","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.ic_launcher_background,R.drawable.rr,"mai","20 minutes ago","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aa,"malak Ahmed","30 minutes ago","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.ko,"Doaa","55 minutes ago","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.ip,"Randa","22 october","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.ev,"Eman","21 october","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.ic_launcher_background,"yesmin","3 day","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.facebok,"Aya ahmed","1 day","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.rr,"Arstoqrato","2 days","ttfffffffffffff"));
        posts.add(new UserModel(R.drawable.rr,R.drawable.aya,"Naglaa","3 days","ttfffffffffffff"));
        Home1Recycler=view.findViewById(R.id.face_recycler);
        home1Adapter=new Home1Adapter(posts);
        Home1Recycler.setAdapter(home1Adapter);
        Home1Recycler.setLayoutManager(new LinearLayoutManager(requireContext()));

    }
}