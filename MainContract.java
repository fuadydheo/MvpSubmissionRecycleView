package com.example.dheo.SubmissionRecyclerView.main;

import com.example.dheo.SubmissionRecyclerView.base.BaseView;
import com.example.dheo.SubmissionRecyclerView.model.Animal;

import java.util.ArrayList;

// TODO 3.0 membuat interface MainContract
public interface MainContract {
    //TODO 3.1 Membuat Interface presenter
    interface Presenter{
        void getData();
    }
    //TODO 3.2 Membuat Interface View yang extends ke BaseView
    interface View extends BaseView {
        void onshowResult(ArrayList<Animal> data);
        void onError(String message);

    }


}