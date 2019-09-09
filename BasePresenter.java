package com.example.dheo.SubmissionRecyclerView.base;

//TODO 2.0 Membuat interface Baseprenster yang extends ke BaseView
public interface BasePresenter<V extends BaseView> {

    void onAttach(V view);
    void onDettach();
}
