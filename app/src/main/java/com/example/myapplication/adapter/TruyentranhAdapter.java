package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.object.Truyen;

import java.util.ArrayList;
import java.util.List;

public class TruyentranhAdapter extends ArrayAdapter<Truyen> {
    private Context ct;
    private ArrayList<Truyen> arr;


    public TruyentranhAdapter(Context context, int resource, List<Truyen> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_truyen, null);
        }
        if (arr.size() > 0) {
            Truyen truyentranh = this.arr.get(position);
            TextView tentruyen = convertView.findViewById(R.id.txvtentruyen);
            TextView tenchap = convertView.findViewById(R.id.txvtenchap);
            ImageView imganhtruyen = convertView.findViewById(R.id.imganhtruyen);

            tentruyen.setText(truyentranh.getTentruyen());
            tenchap.setText(truyentranh.getTenchap());

            Glide.with(this.ct).load(truyentranh.getLinkanh()).into(imganhtruyen);


        }
        return convertView;
    }



}
