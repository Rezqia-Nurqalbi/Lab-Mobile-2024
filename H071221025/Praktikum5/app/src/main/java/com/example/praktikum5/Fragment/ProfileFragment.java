package com.example.praktikum5.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.praktikum5.Instagram;
import com.example.praktikum5.R;

public class ProfileFragment extends Fragment {
    private ImageView ivProfile;
    private TextView tvName;
    private TextView tvUsername;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivProfile = view.findViewById(R.id.iv_profile);
        tvName = view.findViewById(R.id.tv_name);
        tvUsername = view.findViewById(R.id.tv_username);

        // Mengambil data Instagram dari bundle
        Bundle bundle = getArguments();
        if (bundle != null) {
            Instagram instagram = bundle.getParcelable("instagram");
            if (instagram != null) {
                // Mengatur foto profil, nama, dan username
                ivProfile.setImageResource(instagram.getFotoProfile());
                tvName.setText(instagram.getName());
                tvUsername.setText(instagram.getUsername());
            }
        }
    }
}