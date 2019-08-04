package com.example.databindingtutorial;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databindingtutorial.databinding.ActivityMainBinding;
import com.example.databindingtutorial.model.Product;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    
    ActivityMainBinding mBinding;
    Product mProduct;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mProduct = new Product(
                "Xiaomi Mi A2",
                "12MP+20MP dual rear camera and 20MP front facing camera",
                R.drawable.mobile_1,
                new BigDecimal(17499),
                new BigDecimal(11999),
                284,
                new BigDecimal(4)
        );
        mBinding.setProduct(mProduct);
    }
}
