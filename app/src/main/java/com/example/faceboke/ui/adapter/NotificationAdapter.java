package com.example.faceboke.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.faceboke.R;
import com.example.faceboke.data.model.NotificationModel;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotHolder> {
    private List<NotificationModel>Nots;

    public NotificationAdapter(List<NotificationModel> nots) {
        Nots = nots;
    }

    @NonNull
    @Override
    public NotHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notefication_layout,parent,false);
        return new NotHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotHolder holder, int position) {
        NotificationModel notificationModel=Nots.get(position);
        holder.userImage.setImageResource(notificationModel.getUserImage());
        holder.userName.setText(notificationModel.getUserName());


    }

    @Override
    public int getItemCount() {
        if (Nots != null)
            return Nots.size();
        return 0;
    }

    static  class  NotHolder extends RecyclerView.ViewHolder {

        ImageView userImage;
        TextView userName;
        public NotHolder(@NonNull View itemView) {
            super(itemView);
            userImage=itemView.findViewById(R.id.not_img);
            userName=itemView.findViewById(R.id.not_name);

        }
    }


}
