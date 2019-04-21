package com.tje.jickbanglistviewproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tje.jickbanglistviewproject.R;
import com.tje.jickbanglistviewproject.datas.App;

import java.util.List;

public class AppAdapter extends ArrayAdapter<App> {

    Context mContext;
    List<App> mList;
    LayoutInflater inf;

    public AppAdapter(Context context, List<App> list){
        super(context, R.layout.app_list_item,list);

        mContext =context;
        mList = list;
        inf= LayoutInflater.from(mContext);
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View row = convertView;
        if(row == null){
            row = inf.inflate(R.layout.app_list_item,null);
        }

        App appData = mList.get(position);

        TextView priceTxt = row.findViewById(R.id.priceTxt);
        TextView floorTxt = row.findViewById(R.id.floorTxt);
        TextView homeAddressTxt = row.findViewById(R.id.addressTxt);
        TextView homeContentTxt = row.findViewById(R.id.homeContentTxt);
        TextView homeExplanation =row.findViewById(R.id.homeExplantionTxt);



        return  row;
    }
}
