package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.adapter.TruyentranhAdapter;
import com.example.myapplication.object.Truyen;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
   GridView gdvDSTruyen;
   TruyentranhAdapter adapter;
   ArrayList<Truyen> truyenArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private  void init(){
        truyenArrayList = new ArrayList<>();
        truyenArrayList.add(new Truyen("Quyền Bá ","Chapter 266","https://3.bp.blogspot.com/-9kjy7s_4QQo/WwNTKb8W2WI/AAAAAAAAUFM/XIs0vELD6TQwzTdHoRoe7otLsU7UafoxQCHMYCw/quyen-ba-thien-ha"));
        truyenArrayList.add(new Truyen("Tam Quốc Chí Dị","Chapter 45.2","https://3.bp.blogspot.com/-rTnL6boGVIA/XC4mj29eOqI/AAAAAAAAbwA/pE4ebQpcAeYeqM4AXh7Ffw9NuhFIusZvQCHMYCw/tam-quoc-chi-di"));
        truyenArrayList.add(new Truyen("Mục Thần Ký","Chapter 31","http://st.nettruyen.com/data/comics/217/muc-than-ky.jpg"));
        truyenArrayList.add(new Truyen("Mỹ Vị Giai Thê","Chapter 31","http://st.nettruyen.com/data/comics/105/my-vi-giai-the.jpg"));

            adapter= new TruyentranhAdapter(this,0,truyenArrayList);
    }
    private  void anhXa(){
        gdvDSTruyen = findViewById(R.id.gdsDSTruyen);

    }
    private  void setUp(){
        gdvDSTruyen.setAdapter(adapter);
    }
    private  void setClick(){}
}
