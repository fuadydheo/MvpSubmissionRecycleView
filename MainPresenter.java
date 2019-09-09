package com.example.dheo.SubmissionRecyclerView.main;

import com.example.dheo.SubmissionRecyclerView.base.BasePresenter;
import com.example.dheo.SubmissionRecyclerView.utils.AnimalsData;

//TODO Membuat 4.0 kelas MainPresenter yang Implements BasePresenter
public class MainPresenter implements BasePresenter<MainContract.View>, MainContract.Presenter {

    //TODO 4.1 Deklarasi Maincontract
    MainContract.View view;

    //TODO 4.2 Membuat Konstraktor
    public MainPresenter(MainContract.View view) {

        this.view = view;
    }

    //TODO 4.3 ini hasil implement Basepresnter
    @Override
    public void onAttach(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void onDettach() {
        this.view = null;
    }

    @Override
    public void getData() {
        view.onshowResult(AnimalsData.getListData());
        view.onError("Gagal Mengirim Data");
    }
}