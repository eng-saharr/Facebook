package com.example.faceboke.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.faceboke.R;
import com.example.faceboke.data.model.UserModel;

import java.util.List;

public class Home1Adapter extends RecyclerView.Adapter<Home1Adapter.Home1Holder> {
    private List<UserModel>posts;

    public Home1Adapter(List<UserModel> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public Home1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home1_layout,parent,false);
        return new Home1Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Home1Holder holder, int position) {
        UserModel userModel=posts.get(position);
        holder.postContent.setText(userModel.getPostContent());
        holder.postTime.setText(userModel.getPostTime());
        holder.userName.setText(userModel.getUserName());
        holder.postImage.setImageResource(userModel.getPostImage());
        holder.userImage.setImageResource(userModel.getUserImage());

    }

    @Override
    public int getItemCount() {
        if(posts!=null)
            return posts.size();
        return 0;
    }

    static class  Home1Holder extends RecyclerView.ViewHolder {
        ImageView userImage,postImage;
        TextView userName,postTime,postContent;

        public Home1Holder(@NonNull View itemView) {
            super(itemView);
            userImage=itemView.findViewById(R.id.user_img);
            postImage=itemView.findViewById(R.id.post_img);
            userName=itemView.findViewById(R.id.user_name);
            postTime=itemView.findViewById(R.id.post_time);
            postContent=itemView.findViewById(R.id.post_content);

        }
    }
}
