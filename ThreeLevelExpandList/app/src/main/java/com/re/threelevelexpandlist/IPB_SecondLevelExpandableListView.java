package com.re.threelevelexpandlist;

/**
 * Created by Ridzhal on 4/25/2018.
 */

import android.content.Context;
import android.widget.ExpandableListView;

public class IPB_SecondLevelExpandableListView extends ExpandableListView
{

    public IPB_SecondLevelExpandableListView(Context context) {
        super(context);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //999999 is a size in pixels. ExpandableListView requires a maximum height in order to do measurement calculations.
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
