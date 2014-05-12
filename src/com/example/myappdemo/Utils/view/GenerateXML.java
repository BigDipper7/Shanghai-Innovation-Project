package com.example.myappdemo.utils.view;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

import com.example.myappdemo.R;
import com.example.myappdemo.utils.controller.ItemOnClickListemerUtil;

public class GenerateXML {
	public static int genLinearLayoutItems(LinearLayout linearLayout, SimpleAdapter simpleAdapter, Context context, final int pageNum) {
		int count = simpleAdapter.getCount();
		for (int i = 0; i < count; i++) {
			View v = simpleAdapter.getView(i, null, linearLayout);// v 是simpleadapter产生的一个linearlayout的子项
			// set different bg resource
			if (i == 0) {
				v.setBackgroundResource(R.drawable.seletor_item_bg_top);
			} else if (i == count - 1) {
				v.setBackgroundResource(R.drawable.selector_item_bg_bottom);
			} else {
				v.setBackgroundResource(R.drawable.selector_item_bg_middle);
			}

			switch (pageNum) {
			case 1://第一个界面 page1的linearlayout元素监听
				break;
					case 113://第一个界面 page1的子界面 -> 租房activity里面的linearlayout子项事件监听//page1-->button13-->linearlayout's item
						ItemOnClickListemerUtil.setPage1Button13OnClickListener(context, v);//page1-btn13-zufangActivity中的linearlayout子项监听
						break;
			case 2://第二个界面 page2的linearlayout元素监听
				ItemOnClickListemerUtil.setPage2OnClickListener(context, v, i);//page2 的界面元素监听
				break;
			case 3://第三个界面 page3的linearlayout元素监听
				ItemOnClickListemerUtil.setPage3OnClickListener(context, v, i);//page3 的界面元素监听
				break;
					case 34://第三个界面 page3的linearlayout元素监听//即时通讯
						ItemOnClickListemerUtil.setPage3Item4OnClickListener(context, v);
						break;
			case 4://第四个界面 page4的linearlayout元素监听
				ItemOnClickListemerUtil.setPage4OnClickListener(context, v, i);//page4 的界面元素监听
				break;
			
			default:
				break;
			}

			linearLayout.addView(v);
		}
//		Log.e("GenXML-drawable","context.getResources().getDrawable(R.drawable.qav_video_header_animation)");
//		linearLayout.setDividerDrawable(context.getResources().getDrawable(R.drawable.qav_video_header_animation));
		return 0;
	}
}
