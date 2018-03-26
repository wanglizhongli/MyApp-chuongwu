package com.example.pc.myapp_chuongwu.presenter;

/**
 * Created by pc on 2018/3/23.
 */

public  abstract class BasePerenter <M,V>{

    public M Model;
    public V baseView;
    public void setVM(M m,V v){
        Model=m;
        baseView=v;
        this.onStart();
    }

    public abstract void onStart();

}
