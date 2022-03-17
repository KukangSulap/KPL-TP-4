package com.barney.kpltp4;

import android.widget.TextView;

class DataGeneric <T> {
    T data;
    TextView y;

    DataGeneric(T data, TextView y) {
        this.data = data;
        this.y = y;
    }

    public void PrintData() {
        y.setText("Data yang tersimpan adalah: "+ data);
    }
}
