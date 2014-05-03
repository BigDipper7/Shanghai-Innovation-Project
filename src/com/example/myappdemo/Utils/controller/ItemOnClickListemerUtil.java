package com.example.myappdemo.Utils.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

import com.example.myappdemo.MainActivity;
import com.example.myappdemo.R;
import com.example.myappdemo.hehe;

public class ItemOnClickListemerUtil {
	
	/**
	 * view ��onClick�������� �ǵڶ�������page2��linearlayout�����������
	 * @param context 
	 * @param view ������������
	 * @param i ���յĶ�Ӧ��������к�
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
				final Dialog alertDialog = new AlertDialog.Builder(context).setView(dialogContent).create();
				alertDialog.show();
				//����radiogroup �İ�������
				RadioGroup group = (RadioGroup) dialogContent.findViewById(R.id.radioGroup);
				group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					
					@Override
					public void onCheckedChanged(RadioGroup arg0, int arg1) {
						alertDialog.dismiss();
						//��ȡ������ѡ�����ID
						int radioButtonId = arg0.getCheckedRadioButtonId();
						//����ID��ȡRadioButton��ʵ��
						RadioButton rb = (RadioButton)dialogContent.findViewById(radioButtonId);
						//�����ı����ݣ��Է���ѡ����
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
//						//�������V����View
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
	public static void setPage3OnClickListener( final Context context, final View view,  final int i,final String user) {
		view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				final View t_view = view;
				int resId = 0;
				// initial resId
				switch (i) {
				case 0:{
					Intent intent=new Intent(context,hehe.class);
					intent.putExtra("user", user);
					context.startActivity(intent);
					break;
					}
				case 1: {
					Intent intent=new Intent(context,hehe.class);
					intent.putExtra("user", user);
					context.startActivity(intent);
					break;
					}			
				case 2: {
					Intent intent=new Intent(context,hehe.class);
					intent.putExtra("user", user);
					context.startActivity(intent);
					break;
					}
				case 3:{
					Intent intent=new Intent(context,hehe.class);
					intent.putExtra("user", user);
					context.startActivity(intent);
					break;
					}	
				case 4:{
					Intent intent=new Intent(context,hehe.class);
					intent.putExtra("user", user);
					context.startActivity(intent);
					break;
					}	
				default: break;
				}
				
			}
		});
		}
	
}
