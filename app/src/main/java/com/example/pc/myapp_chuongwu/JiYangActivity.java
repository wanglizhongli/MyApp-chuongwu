package com.example.pc.myapp_chuongwu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class JiYangActivity extends AppCompatActivity   implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_yang);
        initData();
    }

    private void initData() {



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.cengshi:
                Intent intent= new Intent(JiYangActivity.this,ShuaiXuanActivity.class);
                   startActivity(intent);
                break;

        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }




}
