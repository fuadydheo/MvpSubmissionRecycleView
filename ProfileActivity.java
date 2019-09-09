package com.example.dheo.SubmissionRecyclerView.profile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.dheo.SubmissionRecyclerView.R;

public class ProfileActivity extends AppCompatActivity {

        TextView tvProfileName;
        TextView tvProfileEmail;
        ImageView ivProfilePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle(getString(R.string.ProfileUser));

        tvProfileName = findViewById(R.id.tv_profile_name);
        tvProfileEmail = findViewById(R.id.tv_profile_email);
        ivProfilePhoto = findViewById(R.id.profile_photo);

        Glide.with(getApplicationContext())
                .load(R.drawable.poto_1)
                .into(ivProfilePhoto);

        }
    }
