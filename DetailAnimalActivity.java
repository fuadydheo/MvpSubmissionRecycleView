package com.example.dheo.SubmissionRecyclerView.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.dheo.SubmissionRecyclerView.R;
import com.example.dheo.SubmissionRecyclerView.model.Animal;

public class DetailAnimalActivity extends AppCompatActivity {

    public static final String EXTRA_ANIMAL = "EXTRA_ANIMAL";

    TextView tvDetailTitle;
    TextView tvDetailDescription;
    ImageView ivDetailPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_animal);


        getSupportActionBar().setTitle(getString(R.string.DetailPage));

        tvDetailTitle = findViewById(R.id.tv_detail_title);
        tvDetailDescription = findViewById(R.id.tv_detail_description);
        ivDetailPhoto = findViewById(R.id.img_detail_photo);



        Animal animal = getIntent().getParcelableExtra(EXTRA_ANIMAL);


        Glide.with(getApplicationContext())
                .load(animal.getPhoto())
                .into(ivDetailPhoto);

        tvDetailTitle.setText(animal.getName());
        tvDetailDescription.setText(animal.getDetail());



     }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent myIntent = new Intent();
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                finish();

                return true;
            default:
                return super.onOptionsItemSelected(item);
             }
        }

     }
