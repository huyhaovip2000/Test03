package com.example.test;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter{
    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).inflate(layoutItem, parent, false);

        // TextView
        TextView tvName1 = convertView.findViewById(R.id.textView1);
        TextView tvName11 = convertView.findViewById(R.id.textView11);

        // Image
        ImageView img1 = convertView.findViewById(R.id.img1);

        //
        tvName1.setText(arrayList.get(position).getName());
        tvName11.setText(arrayList.get(position).getName());

        img1.setImageResource(arrayList.get(position).getImageGoods());




        return convertView;
    }

}
