package com.tje.jickbanglistviewproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tje.jickbanglistviewproject.datas.App;

public class AppDetailActivity extends AppCompatActivity {

    ActivityAppDetailBin act;
    App mAppData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_app_detail);

        mAppData = (App)getIntent().getSerializableExtra("앱정보");

    }
}
