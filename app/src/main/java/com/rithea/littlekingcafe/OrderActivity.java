package com.rithea.littlekingcafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.rithea.littlekingcafe.Adapters.OrdersAdapter;
import com.rithea.littlekingcafe.Models.OrdersModel;
import com.rithea.littlekingcafe.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.bellyporksalad,"Belly Pork Salad","20","2322391"));
        list.add(new OrdersModel(R.drawable.creamymushroom,"Creamy Mushroom","15","2322392"));
        list.add(new OrdersModel(R.drawable.eggontoast,"Egg on Toast","10","2322393"));
        list.add(new OrdersModel(R.drawable.frenchtoast,"French Toast","17","2322394"));
        list.add(new OrdersModel(R.drawable.omelet,"Omelet","12","2322395"));
        list.add(new OrdersModel(R.drawable.waffle,"Waffle","16","2322396"));
        list.add(new OrdersModel(R.drawable.carrotcake,"Carrot Cake","3","2322397"));
        list.add(new OrdersModel(R.drawable.monkeylatte,"Latte","4","2322398"));
        ///////////////////////////////////////////////////////////////////////

        OrdersAdapter adapter = new OrdersAdapter(list,this);
        binding.ordersRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.ordersRecyclerView.setLayoutManager(layoutManager);



    }
}