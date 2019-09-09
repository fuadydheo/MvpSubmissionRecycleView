package com.example.dheo.SubmissionRecyclerView.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dheo.SubmissionRecyclerView.model.Animal;
import com.example.dheo.SubmissionRecyclerView.utils.AnimalsData;
import com.example.dheo.SubmissionRecyclerView.profile.ProfileActivity;
import com.example.dheo.SubmissionRecyclerView.R;

import java.util.ArrayList;
//TODO 5.0 Implements MainContract.view
public class MainActivity extends AppCompatActivity implements MainContract.View {


    private RecyclerView rvAnimals;
    private ArrayList<Animal> list = new ArrayList<>();

    //TODO 5.1 deklarasi Mainpresenter di MainActivity
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 5.2 membuat objek presenter untuk membuat object agar tidak null
        presenter = new MainPresenter(this);

        rvAnimals = findViewById(R.id.rv_animal);
        rvAnimals.setHasFixedSize(true);

        //TODO 5.5 memanggil data
        presenter.getData();
       // list.addAll(AnimalsData.getListData());
        showRecyclerList();
     }

    private void showRecyclerList(){

     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
        }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
        }

    public void setMode(int selectedMode) {
        if (selectedMode == R.id.action_favorite) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);

            }
        }

    //TODO 5.3 hasil implements MainContract.view
    @Override
    public void onshowResult(ArrayList<Animal> data) {
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        list.addAll(data);
        ListAnimalAdapter listAnimalAdapter = new ListAnimalAdapter(list, getApplicationContext());
        rvAnimals.setAdapter(listAnimalAdapter);
    }

    @Override
    public void onError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
    }

    @Override
    public void onDettachView() {
        presenter.onDettach();
    }

    //TODO 5.4 Membuat manual onstart dan on destroy karena di lifecycle ada onstrat dan ondestroy
    @Override
    protected void onStart() {
        onAttachView();
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        onDettachView();
        super.onDestroy();
    }


}
