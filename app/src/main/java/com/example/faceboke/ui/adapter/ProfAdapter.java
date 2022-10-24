package com.example.faceboke.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.faceboke.R;
import com.example.faceboke.data.model.ProfModel;

import java.util.List;

public class ProfAdapter extends RecyclerView.Adapter<ProfAdapter.ProfHolder>{
    private List<ProfModel>requests;

    public ProfAdapter(List<ProfModel> requests) {
        this.requests = requests;
    }

    @NonNull
    @Override
    public ProfHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_prof_layout,parent,false);
        return new ProfHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfHolder holder, int position) {
        ProfModel profModel=requests.get(position);
       holder.userName.setText(profModel.getUserName());
       holder.userImage.setImageResource(profModel.getUserImage());

    }

    @Override
    public int getItemCount() {
        if (requests != null)
            return requests.size();
        return 0;
    }

    static class ProfHolder extends RecyclerView.ViewHolder {
        ImageView userImage;
        EditText userName;

        public ProfHolder(@NonNull View itemView) {
            super(itemView);

            userImage=itemView.findViewById(R.id.prof_img);
            userName=itemView.findViewById(R.id.prof_name);

        }
    }


}
