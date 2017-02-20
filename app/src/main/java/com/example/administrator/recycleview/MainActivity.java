package com.example.administrator.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Dog>mList=new ArrayList<Dog>();
    private MyAdapter myAdapter;
    private RecyclerView rv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initData();

    }

    private void initData() {



        mList.add(new Dog(R.drawable.dog1,"旺财1"));
        mList.add(new Dog(R.drawable.dog2,"旺财2"));
        mList.add(new Dog(R.drawable.dog3,"旺财3"));
        mList.add(new Dog(R.drawable.dog4,"旺财4"));
        mList.add(new Dog(R.drawable.dog5,"旺财5"));
        mList.add(new Dog(R.drawable.dog6,"旺财6"));
        mList.add(new Dog(R.drawable.dog7,"旺财7"));
        mList.add(new Dog(R.drawable.dog8,"旺财8"));
        mList.add(new Dog(R.drawable.dog9,"旺财9"));
        mList.add(new Dog(R.drawable.dog10,"旺财10"));



    }

    private void initView() {

        rv= (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        //设置为垂直布局，这也是默认的
        layoutManager.setOrientation(OrientationHelper.HORIZONTAL);


        rv.setLayoutManager(layoutManager);
        //设置Adapter
        rv.setAdapter(new MyAdapter(mList));








    }
}
