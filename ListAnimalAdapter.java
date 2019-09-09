package com.example.dheo.SubmissionRecyclerView.main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.dheo.SubmissionRecyclerView.detail.DetailAnimalActivity;
import com.example.dheo.SubmissionRecyclerView.R;
import com.example.dheo.SubmissionRecyclerView.model.Animal;

import java.util.ArrayList;

public class ListAnimalAdapter extends RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder> {

    public ArrayList<Animal> listAnimal;

    Context context ;


    public ListAnimalAdapter(ArrayList<Animal> listAnimal,Context context) {
        this.listAnimal = listAnimal;
        this.context = context;

     }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_animal, viewGroup, false);
        return new ListViewHolder(view);
     }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {

        final Animal animal = listAnimal.get(position);

        final String photo = animal.getPhoto();
        final String name = animal.getName();
        final String detail = animal.getDetail();

        Glide.with(holder.itemView.getContext())
                .load(photo)
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(name);
        holder.tvDetail.setText(detail);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailAnimalActivity.class);
                intent.putExtra(DetailAnimalActivity.EXTRA_ANIMAL,animal);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

     }

    @Override
    public int getItemCount() {
        return listAnimal.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
          }
        }
     }