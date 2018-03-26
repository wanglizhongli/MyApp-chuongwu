package com.example.pc.myapp_chuongwu.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pc.myapp_chuongwu.R;
import com.example.pc.myapp_chuongwu.ui.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager Image;
    private Button but;
    private int[] image={R.drawable.aa,R.drawable.ee,R.drawable.ss};
    private List<ImageView> mList;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAdapter();


    }

    private void initAdapter() {
        MyAdapter adapter=new MyAdapter(mList);
        Image.setAdapter(adapter);


        Image.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position==mList.size()-1){
                    but.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initData() {
        mList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(image[i]);
            mList.add(imageView);
        }


    }

    private void initView() {
        Image = (ViewPager) findViewById(R.id.Image);
        but = (Button) findViewById(R.id.Button);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button:
                Intent intent = new Intent(MainActivity.this,ShouActivity.class);
                startActivity(intent);
                break;
        }
    }
}

