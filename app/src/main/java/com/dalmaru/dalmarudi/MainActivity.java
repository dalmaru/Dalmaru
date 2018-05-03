package com.dalmaru.dalmarudi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.dalmaru.dalmaruknife.DalmaruDI;

public class MainActivity extends AppCompatActivity {

    TextView text_testview;
    Button btn_testbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DalmaruDI.bind(this);

        text_testview.setText("aaaa");
        btn_testbtn.setText("bbb");
    }
}
