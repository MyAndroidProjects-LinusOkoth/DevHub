package com.example.devhub.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.example.devhub.Adapters.FollowersActivityAdapter;
import com.example.devhub.R;
import com.example.devhub.databinding.ActivityDetailsBinding;
import com.example.devhub.databinding.ActivityFollowersBinding;

public class FollowersActivity extends AppCompatActivity {

    ActivityFollowersBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFollowersBinding.inflate(getLayoutInflater());

        final View view = binding.getRoot();
        setContentView(view);

        binding.viewpager.setAdapter(new FollowersActivityAdapter(getSupportFragmentManager(),
                FollowersActivity.this));
        binding.slidingTabs.setupWithViewPager(binding.viewpager);





    }
}