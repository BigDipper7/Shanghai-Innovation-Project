package com.example.myappdemo.utils.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

import com.example.myappdemo.R;

public class ItemOnClickListemerUtil {
	public static void setOnClickListener( final Context context, final View view,  final int i) {
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
				
				final View dialogContent = LayoutInflater.from(context).inflate(resId, null);
				RadioGroup group = (RadioGroup) dialogContent.findViewById(R.id.radioGroup);
				group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					
					@Override
					public void onCheckedChanged(RadioGroup arg0, int arg1) {
						//获取变更后的选中项的ID
						int radioButtonId = arg0.getCheckedRadioButtonId();
						//根据ID获取RadioButton的实例
						RadioButton rb = (RadioButton)dialogContent.findViewById(radioButtonId);
						//更新文本内容，以符合选中项
						String str = (String) rb.getText();
						Log.e("---> CustomDialog - TextSlected", str);
						TextView tv = (TextView) view.findViewById(R.id.textView2);
						tv.setText(str);
					}
				});
				Dialog alertDialog = new AlertDialog.Builder(context).setView(dialogContent).create();
				alertDialog.show();
				
//				CustomDialog customDialog = new CustomDialog(context, resId, R.style.Page2CustomDialog, new OnCusDiaItmClickListener() {
//					
//					@Override
//					public void CusDiaItmClickListener(String string) {
//						//不清楚是V还是View
//						TextView tv = (TextView) view.findViewById(R.id.textView2);
//						tv.setText(string);
//					}
//				});
//				Log.e("--->onclicklistener", ""+i);
//				customDialog.setCanceledOnTouchOutside(true);
//				customDialog.show();


			}
		});
	}
	
	
	
}
