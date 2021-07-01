package com.rithea.littlekingcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.rithea.littlekingcafe.databinding.ActivityDetailBinding;
import com.rithea.littlekingcafe.databinding.ActivityMainBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int image = getIntent().getIntExtra("image",0);
        int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("desc");

        binding.detailImage.setImageResource(image);
        binding.priceLabel.setText(String.format("%d",price));
        binding.foodName.setText(name);
        binding.detailDescription.setText(description);

        DBHelper helper = new DBHelper(this);

        binding.insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = helper.insertOrder(
                        binding.nameBox.getText().toString(),
                        binding.phoneBox.getText().toString(),
                        price,
                        image,
                        Integer.parseInt(binding.quantity.getText().toString()),
                        description,
                        name
                );

                if (isInserted){
                    Toast.makeText(DetailActivity.this,"inserted success",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(DetailActivity.this,"inserted Error",Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}