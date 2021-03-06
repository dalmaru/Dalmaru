package com.dalmaru.dalmaruknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class DalmaruDI {
    public static void bind(Activity activity) {
        Class cls = activity.getClass();
        Object obj = activity;

        Field[] fields = cls.getDeclaredFields();

        for(Field field : fields) {
            Annotation ano = field.getAnnotation(GetView.class);

            if (ano != null) {
                int resId = activity.getResources().getIdentifier(field.getName(), "id", activity.getPackageName());
                View view = activity.findViewById(resId);
                try {
                    field.set(obj, view);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
