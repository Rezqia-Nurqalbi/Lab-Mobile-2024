package com.example.praktikum5;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.praktikum5.Fragment.HomeFragment;
import com.example.praktikum5.Fragment.PostinganFragment;
import com.example.praktikum5.Fragment.ProfileFragment;
import com.example.praktikum5.Fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageView iv_posting = findViewById(R.id.IV_Post);
        ImageView iv_profile = findViewById(R.id.IV_Profile);
        ImageView iv_home = findViewById(R.id.IV_Home);
        ImageView iv_search = findViewById(R.id.IV_Search);
        FragmentManager fragmentManager = getSupportFragmentManager();

        HomeFragment homeFragment = new HomeFragment();

        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        if (!(fragment instanceof HomeFragment)){
            fragmentManager
                    .beginTransaction()
                    .add(R.id.frame_container, homeFragment)
                    .commit();
        }

        iv_posting.setOnClickListener(v -> {
            PostinganFragment postinganFragment = new PostinganFragment();
            Fragment f = fragmentManager.findFragmentByTag(PostinganFragment.class.getSimpleName());
            if (!(f instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, postinganFragment)
                        .addToBackStack(null)
                        .commit();
            }

        });

        iv_profile.setOnClickListener(v -> {
            ProfileFragment profileFragment = new ProfileFragment();
            Fragment p = fragmentManager.findFragmentByTag(ProfileFragment.class.getSimpleName());
            if (!(p instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, profileFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        iv_home.setOnClickListener(v -> {
            HomeFragment homeFragment1 = new HomeFragment();
            Fragment h = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());
            if (!(h instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, homeFragment1)
                        .addToBackStack(null)
                        .commit();
            }
        });

        iv_search.setOnClickListener(v -> {
            SearchFragment searchFragment = new SearchFragment();
            Fragment s = fragmentManager.findFragmentByTag(SearchFragment.class.getSimpleName());
            if (!(s instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, searchFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });



    }
}