package com.lty.androidstudio36;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lty.androidstudio36.databinding.ItemTestBinding;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author litaoyuanli
 * @date 2020/3/16
 * 描述信息
 */
public class TestAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;

    public TestAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemTestViewHold(ItemTestBinding.inflate(LayoutInflater.from(context)));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemTestViewHold extends RecyclerView.ViewHolder {
        public ItemTestBinding itemTestBinding;

        ItemTestViewHold(@NonNull ItemTestBinding itemTestBinding) {
            super(itemTestBinding.getRoot());
        }
    }
}
