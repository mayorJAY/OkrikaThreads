package com.example.josycom.okrikathreads.ui.bags;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BagsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BagsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is bags fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}