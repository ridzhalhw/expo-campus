package com.re.threelevelexpandlist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ridzhal on 4/24/2018.
 */

public class ListViewAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] content;
    private final String[] subcontent;
    private final Integer[] imgid;

    public ListViewAdapter(Activity context, String[] content, String[] subcontent, Integer[] imgid){
        super(context, R.layout.custom_listview, content);

        this.context = context;
        this.content = content;
        this.subcontent = subcontent;
        this.imgid = imgid;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r==null){
            LayoutInflater inflater = context.getLayoutInflater();
            r = inflater.inflate(R.layout.custom_listview, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.txt1.setText(content[position]);
        viewHolder.txt2.setText(subcontent[position]);

        return r;
    }

    class ViewHolder{
        TextView txt1;
        TextView txt2;
        ImageView ivw;
        ViewHolder (View v){
            txt1 = (TextView) v.findViewById(R.id.tvContent);
            txt2 = (TextView) v.findViewById(R.id.tvsubcontent);
            ivw = (ImageView) v.findViewById(R.id.ivImage);
        }
    }
}
