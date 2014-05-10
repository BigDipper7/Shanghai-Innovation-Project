package com.example.myappdemo.utils.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myappdemo.R;
import com.example.myappdemo.activity.main.ZuFangActivityDetails;

public class ItemOnClickListemerUtil {
	
	/**
	 * view 的onClick监听函数 是第一个界面page1的Button13的跳转界面ZuFangActivity
	 * 
	 */
	public static void setPage1Button13OnClickListener(final Context context, View view) {
		view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				context.startActivity(new Intent(context, ZuFangActivityDetails.class));
			}
		});
	}

	
	
	/**
	 * view 的onClick监听函数 是第二个界面page2的linearlayout子项监听函数
	 * @param context 
	 * @param view 最后监听的子项
	 * @param i 最终的对应子项的序列号
	 */
	public static void setPage2OnClickListener( final Context context, final View view,  final int i) {
		view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				final View t_view = view;
				int resId = 0;
				// initial resId
				switch (i) {
				case 0: resId = R.layout.page_2_select_dialog_1; break;
				case 1: resId = R.layout.page_2_select_dialog_2; break;
				case 2: resId = R.layout.page_2_select_dialog_3; break;
				case 3: resId = R.layout.page_2_select_dialog_4; break;
				case 4: resId = R.layout.page_2_select_dialog_5; break;
				case 5: resId = R.layout.page_2_select_dialog_6; break;
				case 6: resId = R.layout.page_2_select_dialog_7; break;
				default: break;
				}
				
				final View dialogContent = LayoutInflater.from(context).inflate(resId, null);
				final Dialog alertDialog = new AlertDialog.Builder(context).setTitle("请选择").setView(dialogContent).create();
				alertDialog.show();
				//监听radiogroup 的按键监听
				RadioGroup group = (RadioGroup) dialogContent.findViewById(R.id.radioGroup);
				group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					
					@Override
					public void onCheckedChanged(RadioGroup arg0, int arg1) {
						alertDialog.dismiss();
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
				
//				CustomDialog customDialog = new CustomDialog(context, resId, R.style.Page2CustomDialog, new OnCusDiaItmClickListener() {
//					
//					@Override
//					public void CusDiaItmClickListener(String string) {
//						//不清楚是V还是View
//						TextView tv = (TextView) view.findViewById(R.id.textView2);
//						Log.e("now -->in", "bull->>>");
//						tv.setText(string);
//					}
//				});
//				Log.e("--->onclicklistener", ""+i);
////				customDialog.setCanceledOnTouchOutside(true);
//				customDialog.show();


			}
		});
	}

	/**
	 * view 的onClick监听函数 是第四个界面page4的linearlayout子项监听函数
	 * @param context 
	 * @param view 最后监听的子项
	 * @param i 最终的对应子项的序列号
	 */
	public static void setPage4OnClickListener(final Context context, View view, final int i) {
		view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				switch (i) {
				case 0://切换城市
					final View dialogContent = LayoutInflater.from(context).inflate(R.layout.page_4_select_dialog, null);
					final AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle("请选择城市").setView(dialogContent).create();//实现方式 弹出弹窗
					alertDialog.show();
					RadioGroup group = (RadioGroup) dialogContent.findViewById(R.id.radioGroup);
					group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
						
						@Override
						public void onCheckedChanged(RadioGroup arg0, int arg1) {
							alertDialog.dismiss();
							//获取变更后的选中项的ID
							int radioButtonId = arg0.getCheckedRadioButtonId();
							//根据ID获取RadioButton的实例
							RadioButton rb = (RadioButton)dialogContent.findViewById(radioButtonId);
							//更新文本内容，以符合选中项
							String str = (String) rb.getText();
							Log.e("---> CustomDialog - TextSlected", str);
							Toast toast = Toast.makeText(context, "你已经将城市切换为: "+str, Toast.LENGTH_SHORT);
							toast.setGravity(Gravity.CENTER, 0, 0);
							toast.show();
							
						}
					});
					break;
				case 1://图片质量设置

					break;
				case 2://即时通讯设置

					break;
				case 3://用户反馈

					break;
				case 4://使用帮助

					break;
				case 5://关于我们

					break;
				case 6://免责声明

					break;
					
				default:
					break;
				}
				
			}
		});
		
	}
	
	
	
}
