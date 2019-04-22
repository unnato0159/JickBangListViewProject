package com.tje.jickbanglistviewproject;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.databinding.DataBindingUtil;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.tje.jickbanglistviewproject.adapters.AppAdapter;
import com.tje.jickbanglistviewproject.databinding.ActivityMainBinding;
import com.tje.jickbanglistviewproject.datas.App;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AppAdapter mAppAdapter;

    List<App> appList = new ArrayList<>();

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act= DataBindingUtil.setContentView(this,R.layout.activity_main);

        fillApp();

        mAppAdapter = new AppAdapter(MainActivity.this,appList);
        act.jickBangListView.setAdapter(mAppAdapter);

        act.jickBangListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                App clickAppData = appList.get(position);

                Intent intent = new Intent(MainActivity.this,AppDetailActivity.class);
                intent.putExtra("앱정보",clickAppData);
                startActivity(intent);
            }
        });

    }



    void fillApp(){

        appList.add(new App(R.drawable.house1,"100/13","2층","경상북도 구미시 송정동","분리형 원룸","[풀옵션강력추천]번개시장근.."));
        appList.add(new App(R.drawable.house2,"100/15","3층","경상북도 구미시 신평동","분리형 원룸","[풀옵션강력추천]ㅋㅋㅋㅋ.."));
        appList.add(new App(R.drawable.house3,"100/13","3층","경상북도 구미시 원평동","분리형 원룸","[풀옵션강력추천]ㅎㅎㅎㅎ.."));
        appList.add(new App(R.drawable.house4,"100/13","2층","경상북도 구미시 형곡동","분리형 원룸","[풀옵션강력추천]ㅋㅋㅋㅋㅋ.."));
        appList.add(new App(R.drawable.house5,"100/15","1층","경상북도 구미시 신평동","분리형 원룸","[풀옵션강력추천]ㅎㅎㅎㅎ.."));

    }
}
