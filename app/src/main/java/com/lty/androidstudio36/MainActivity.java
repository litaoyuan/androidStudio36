package com.lty.androidstudio36;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.lty.androidstudio36.databinding.ActivityMainBinding;
import com.lty.androidstudio36.databinding.AddViewBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private AddViewBinding addViewBinding;
    private TestAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        init();
    }

    private void init() {
        addViewBinding = AddViewBinding.inflate(LayoutInflater.from(this));
        addViewBinding.tvsss.setText("测试数据");
        binding.ll.addView(addViewBinding.getRoot());
    }
}
