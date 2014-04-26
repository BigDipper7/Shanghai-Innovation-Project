package com.example.myappdemo.Utils;

import com.example.myappdemo.R;

import android.R.raw;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

public class GenerateXML {
	public static int genLinearLayoutItems(LinearLayout linearLayout, SimpleAdapter simpleAdapter) {
		for(int i = 0; i < simpleAdapter.getCount(); i++) {
			View v = simpleAdapter.getView(i, null, linearLayout);
			
			//set different bg resource
			
			linearLayout.addView(v);
		}
		linearLayout.setDividerDrawable(R.drawable.home_divider);
		return 0;
	}
}
