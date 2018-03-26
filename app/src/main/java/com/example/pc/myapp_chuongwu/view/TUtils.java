package com.example.pc.myapp_chuongwu.view;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/**
 * Created by 丁军明 on 2017/11/27.
 */

public class TUtils {
    private static Class<?> oClass;
    private static Type superclass;
    private static Type[] arguments;

    public static  <T>T  getT(Object o, int i){


        try {
            oClass = o.getClass();
            superclass = oClass.getGenericSuperclass();
            arguments = ((ParameterizedType) superclass).getActualTypeArguments();
            Type t=arguments[i];
            return ((Class<T>)t).newInstance();


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}


