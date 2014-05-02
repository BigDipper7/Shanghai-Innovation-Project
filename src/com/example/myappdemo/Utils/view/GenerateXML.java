package com.example.myappdemo.utils.view;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

import com.example.myappdemo.R;
import com.example.myappdemo.utils.controller.ItemOnClickListemerUtil;

public class GenerateXML {
	public static int genLinearLayoutItems(LinearLayout linearLayout, SimpleAdapter simpleAdapter, Context context) {
		int count = simpleAdapter.getCount();
		for(int i = 0; i < count; i++) {
			View v = simpleAdapter.getView(i, null, linearLayout);
			//set different bg resource
			if(i == 0){
				v.setBackgroundResource(R.drawable.call_item_top_n);
			}else if(i == count-1)
			{
				v.setBackgroundResource(R.drawable.call_item_bottom_n);
			}else {
				v.setBackgroundResource(R.drawable.call_item_middle_n);
			}
			
			ItemOnClickListemerUtil.setOnClickListener(context, v, i);
			
			linearLayout.addView(v);
		}
		Log.e("GenXML-drawable", "context.getResources().getDrawable(R.drawable.qav_video_header_animation)");
		linearLayout.setDividerDrawable(context.getResources().getDrawable(R.drawable.qav_video_header_animation));
		return 0;
	}
}
