package com.example.registro_app;

import android.graphics.ColorSpace;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mainscreen);

        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);


        //RecyclerView Implementation
        //RecyclerView

        RecyclerView mRecyclerView = findViewById(R.id.myRecycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        mRecyclerView.setItemAnimator( new DefaultItemAnimator());

        //Adapter

        mAdapter = new MyAdapter(this,getModels());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<Genero> getGeneros(){
        ArrayList<Genero> generos = new ArrayList<>();
        Model p;


    }
}
