package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Finalizar extends AppCompatActivity {


    private Button okBtn;
    private ImageView ganadorImg;
    private ImageView perdedorImg;

    private TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar);

        okBtn = findViewById(R.id.okBtn);

        tcp= TCPSingleton.getInstance();

    }


}