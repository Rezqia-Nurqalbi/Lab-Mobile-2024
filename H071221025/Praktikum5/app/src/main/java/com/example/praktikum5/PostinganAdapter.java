package com.example.praktikum5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.praktikum5.Fragment.ProfileFragment;

import java.util.ArrayList;

public class PostinganAdapter extends RecyclerView.Adapter<PostinganAdapter.ViewHolder> {

    private ArrayList<Instagram> instagrams;

    public PostinganAdapter(ArrayList<Instagram> instagrams) {
        this.instagrams = instagrams;
    }

    @NonNull
    @Override
    public PostinganAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postingan, parent, false);
        return new PostinganAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostinganAdapter.ViewHolder holder, int position) {

        Instagram instagram1 = instagrams.get(position);

        holder.TV_Username.setText(instagram1.getUsername());
        holder.TV_Name.setText(instagram1.getName());
        holder.TV_Desc.setText(instagram1.getDesc());
        holder.IV_FotoProfile.setImageResource(instagram1.getFotoProfile());
        holder.IV_FotoPostingan.setImageResource(instagram1.getFotoPostingan());
        holder.IV_Feed.setImageURI(instagram1.getSelectedImageUri());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(holder.context, ProfileActivity.class);
//                intent.putExtra("instagram", instagram1);
//                holder.context.startActivity(intent);
//            }
//        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileFragment profileFragment = new ProfileFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("instagram", instagram1);
                profileFragment.setArguments(bundle);

                try {
                    FragmentTransaction transaction = ((FragmentActivity) holder.itemView.getContext()).getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_container, profileFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return instagrams.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView TV_Username, TV_Name, TV_Desc;
        ImageView IV_FotoProfile, IV_FotoPostingan, IV_Feed;
        Context context;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TV_Username = itemView.findViewById(R.id.TV_Username);
            TV_Name = itemView.findViewById(R.id.TV_Name);
            TV_Desc = itemView.findViewById(R.id.TV_Desc);
            IV_FotoProfile = itemView.findViewById(R.id.IV_Profile);
            IV_FotoPostingan = itemView.findViewById(R.id.IV_Postingan);
            IV_Feed = itemView.findViewById(R.id.IV_Postingan);
            context = itemView.getContext();
        }
    }
}