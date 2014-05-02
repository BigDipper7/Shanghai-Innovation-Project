package com.example.myappdemo.utils.controller;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.myappdemo.R;
import com.example.myappdemo.utils.view.CustomDialog;
import com.example.myappdemo.utils.view.CustomDialog.OnCusDiaItmClickListener;

public class ItemOnClickListemerUtil {
	public static void setOnClickListener(final Context context,final View view, final int i) {
		view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				final View t_view = view;
				int resId = 0;
				// initial resId
				switch (i) {
				case 0: resId = R.layout.page_2_select_dialog_1; break;
				case 1: break;
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				default: break;
				}
				CustomDialog customDialog = new CustomDialog(context, resId, R.style.Page2CustomDialog, new OnCusDiaItmClickListener() {
					
					@Override
					public void CusDiaItmClickListener(String string) {
						//不清楚是V还是View
						TextView tv = (TextView) view.findViewById(R.id.textView2);
						tv.setText(string);
					}
				});
				customDialog.setCanceledOnTouchOutside(true);
				customDialog.show();
//				CustomDialog cd = new CustomDialog(this, R.layout.Dialogxml,
//						theme, new hudiaoFun() {
//							onitemchoose(string str) {
//								view.findviewbyid(R.id.textview2).setText(str);
//							}
//						});

			}
		});
	}
	
	
	
}
