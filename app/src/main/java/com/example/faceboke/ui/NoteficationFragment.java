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
import com.example.faceboke.data.model.NotificationModel;
import com.example.faceboke.ui.adapter.NotificationAdapter;

import java.util.ArrayList;


public class NoteficationFragment extends Fragment {
    RecyclerView notRecycler;
    ArrayList<NotificationModel>Nots = new ArrayList<>();
    NotificationAdapter notificationAdapter;



    public NoteficationFragment() {
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
        return inflater.inflate(R.layout.fragment_notefication, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addFackdata(view);
    }

    private void addFackdata( View view) {
        Nots.add(new NotificationModel("maha mohamed reacted to your post",R.drawable.ev));
        Nots.add(new NotificationModel("Doaa sayed and 6 others love your story.see it view more",R.drawable.aa));
        Nots.add(new NotificationModel("maha mohamed reacted to your post",R.drawable.img));
        Nots.add(new NotificationModel("aya mohamed mentioned you in her comment",R.drawable.kk));
        Nots.add(new NotificationModel("samah Bahr changed her cover photo",R.drawable.ko));
        Nots.add(new NotificationModel("Walaa nayle added a post",R.drawable.fb));
        Nots.add(new NotificationModel("mai saad shared mohamed Zanaty post",R.drawable.ic_launcher_background));
        Nots.add(new NotificationModel("Aml hassan commented on walaa nayle post",R.drawable.rr));
        Nots.add(new NotificationModel("maha mohamed reacted to your post",R.drawable.aya));
        Nots.add(new NotificationModel("Taqwa saad and 3 others friends had birthday on november 1",R.drawable.py));
        Nots.add(new NotificationModel("maha mohamed reacted to your story",R.drawable.proff));
        Nots.add(new NotificationModel("Blue night.is live now",R.drawable.rr));
        Nots.add(new NotificationModel("maha mohamed added story now",R.drawable.rr));

        notRecycler=view.findViewById(R.id.recycl_NOT);
        notificationAdapter=new NotificationAdapter(Nots);
        notRecycler.setAdapter(notificationAdapter);
        notRecycler.setLayoutManager(new LinearLayoutManager(requireContext()));

    }
}