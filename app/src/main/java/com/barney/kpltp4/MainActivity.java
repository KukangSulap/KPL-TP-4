package com.barney.kpltp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView miomio = findViewById(R.id.miomio);
        HaloGeneric hutao = new HaloGeneric(miomio);

        //set inputan yg di soal nama nya X
        hutao.SapaUser("yeriko makici");

        TextView miomio = findViewById(R.id.miomio);
        DataGeneric y = new DataGeneric("1302204094", miomio);

        y.PrintData();
    }
}