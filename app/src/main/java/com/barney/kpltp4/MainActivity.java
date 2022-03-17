package com.barney.kpltp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView miomio = findViewById(R.id.miomio);
        TextView miomio2 = findViewById(R.id.miomio2);

        HaloGeneric hutao = new HaloGeneric(miomio);

        //set inputan yg di soal nama nya X
        hutao.SapaUser("yeriko makici");

        DataGeneric y = new DataGeneric("1302204094", miomio2);

        y.PrintData();
    }
}