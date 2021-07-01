package com.rithea.littlekingcafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.rithea.littlekingcafe.Adapters.MainAdapter;
import com.rithea.littlekingcafe.Models.MainModel;
import com.rithea.littlekingcafe.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        //item1
        list.add(new MainModel(R.drawable.bellyporksalad,
                "Belly Pork Salad",
                "20",
                "5 spice slow cook pork belly, kale slaw with pomegranate dressing."));
        //item2
        list.add(new MainModel(R.drawable.creamymushroom,
                "Creamy Mushroom",
                "15",
                "White Mushroom with cream served with toasted ciabatta."));
        //item3
        list.add(new MainModel(R.drawable.eggontoast,
                "Egg on Toast",
                "10",
                "poached, fried, or scramble egg on toasted ciabatta."));

        //item4
        list.add(new MainModel(R.drawable.frenchtoast,
                "French Toast",
                "17",
                "crispy becon, banana, with maple served with maple syrup."));
        //item5
        list.add(new MainModel(R.drawable.omelet,
                "Omelet",
                "12",
                "omelet with vegetable slaw and salami."));
        //item6
        list.add(new MainModel(R.drawable.waffle,
                "Waffle",
                "16",
                "With cream fraiche, cream, rhubarb jam, maple syrup, chocolate syrp, ice cream."));
        //item7
        list.add(new MainModel(R.drawable.carrotcake,
                "Carrot Cake",
                "3",
                "Delicious, fluppy carrot cake with raisin on top."));
        //item8
        list.add(new MainModel(R.drawable.monkeylatte,
                "Latte",
                "4",
                "latte with customized picture on top of it."));
        //////////////////////////////////////////////////////////////////
        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);



    }
}