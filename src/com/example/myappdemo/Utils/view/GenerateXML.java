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
			View v = simpleAdapter.getView(i, null, linearLayout);// v ��simpleadapter������һ��linearlayout������
			// set different bg resource
			if (i == 0) {
				v.setBackgroundResource(R.drawable.seletor_item_bg_top);
			} else if (i == count - 1) {
				v.setBackgroundResource(R.drawable.selector_item_bg_bottom);
			} else {
				v.setBackgroundResource(R.drawable.selector_item_bg_middle);
			}

			switch (pageNum) {
			case 1://��һ������ page1��linearlayoutԪ�ؼ���
				break;
					case 113://��һ������ page1���ӽ��� -> �ⷿactivity�����linearlayout�����¼�����//page1-->button13-->linearlayout's item
						ItemOnClickListemerUtil.setPage1Button13OnClickListener(context, v);//page1-btn13-zufangActivity�е�linearlayout�������
						break;
			case 2://�ڶ������� page2��linearlayoutԪ�ؼ���
				ItemOnClickListemerUtil.setPage2OnClickListener(context, v, i);//page2 �Ľ���Ԫ�ؼ���
				break;
			case 3://���������� page3��linearlayoutԪ�ؼ���
				ItemOnClickListemerUtil.setPage3OnClickListener(context, v, i);//page3 �Ľ���Ԫ�ؼ���
				break;
					case 34://���������� page3��linearlayoutԪ�ؼ���//��ʱͨѶ
						ItemOnClickListemerUtil.setPage3Item4OnClickListener(context, v);
						break;
			case 4://���ĸ����� page4��linearlayoutԪ�ؼ���
				ItemOnClickListemerUtil.setPage4OnClickListener(context, v, i);//page4 �Ľ���Ԫ�ؼ���
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
