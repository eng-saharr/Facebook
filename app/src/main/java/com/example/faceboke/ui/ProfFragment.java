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
import com.example.faceboke.data.model.ProfModel;
import com.example.faceboke.ui.adapter.ProfAdapter;

import java.util.ArrayList;


public class ProfFragment extends Fragment {
    RecyclerView  ProfRecycler;
    ArrayList<ProfModel> requests =new ArrayList<ProfModel>();
    ProfAdapter profAdapter;



    public ProfFragment() {
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
        return inflater.inflate(R.layout.fragment_prof, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addFakedata(view);

    }

    private void addFakedata(View view) {
      requests.add(new ProfModel("sahar",R.drawable.ev));
      requests.add(new ProfModel("roaa",R.drawable.ko));
        requests.add(new ProfModel("Dina",R.drawable.rr));
        requests.add(new ProfModel("Walaa",R.drawable.kk));
        requests.add(new ProfModel("Doaa",R.drawable.aa));
        requests.add(new ProfModel("maha",R.drawable.fb));
        requests.add(new ProfModel("Hagar",R.drawable.img));
        requests.add(new ProfModel("aya",R.drawable.ip));
        ProfRecycler=view.findViewById(R.id.recycl_proff);
        profAdapter=new ProfAdapter(requests);
        ProfRecycler.setAdapter(profAdapter);
        ProfRecycler.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}