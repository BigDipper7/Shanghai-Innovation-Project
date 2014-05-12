package com.example.myappdemo.utils.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
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
import com.example.myappdemo.activity.main.ErShouFangActivity;
import com.example.myappdemo.activity.main.MainActivity;
import com.example.myappdemo.activity.main.XinFangActivity;
import com.example.myappdemo.activity.main.ZuFangActivityDetails;
import com.example.myappdemo.activity.page3.ChattingActivity;
import com.example.myappdemo.activity.page3.JiShiTongXunActivity;
import com.example.myappdemo.activity.page4.YongHuFanKuiActivity;

public class ItemOnClickListemerUtil {
	
	/**
	 * view ��onClick�������� �ǵ�һ������page1��Button13����ת����ZuFangActivity
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
				final Dialog alertDialog = new AlertDialog.Builder(context).setTitle("��ѡ��").setView(dialogContent).create();
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

	/**
	 * view ��onClick�������� �ǵ���������page3��linearlayout�����������
	 * @param context 
	 * @param view ������������
	 * @param i ���յĶ�Ӧ��������к�
	 */
	public static void setPage3OnClickListener(final Context context, View view, final int i) {
		view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				switch (i) {
				case 0://���Ż
					
					break;
				case 1://�ҵ��·�
					context.startActivity(new Intent(context, XinFangActivity.class));	
					break;
				case 2://�ҵĶ��ַ�
					context.startActivity(new Intent(context, ErShouFangActivity.class));
					break;
				case 3://�ҵ��ⷿ
					
					break;
				case 4://��ʱͨѶ
					context.startActivity(new Intent(context, JiShiTongXunActivity.class));
					break;
				
				default:
					break;
				}
			}
		});
	}
	
	/**
	 * view ��onClick�������� �ǵ���������page3������Item4 ��ʱͨѶActivity�����linearlayout���� �ļ�������
	 * @param context 
	 * @param view ������������
	 * @param i ���յĶ�Ӧ��������к�
	 */
	public static void setPage3Item4OnClickListener(final Context context, View view) {
		view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				switch (i) {
//				case 0:
//					
//					break;
//				case 1:
//
//					break;
//				case 2:	
//	
//					break;
//				case 3:
//	
//					break;
//				case 4:
//	
//					break;
//
//				default:
//					break;
//				}
				TextView nameTV = (TextView) v.findViewById(R.id.textView2);
				String name = (String) nameTV.getText();
				Log.e("User Name", name);
				Intent intent = new Intent(context, ChattingActivity.class);
				intent.putExtra("name", name);
				context.startActivity(intent);
//				Int resId = 
			}
		});
		
	}

	/**
	 * view ��onClick�������� �ǵ��ĸ�����page4��linearlayout�����������
	 * @param context 
	 * @param view ������������
	 * @param i ���յĶ�Ӧ��������к�
	 */
	public static void setPage4OnClickListener(final Context context, View view, final int i) {
		view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				switch (i) {
				case 0://�л�����
					final View dialogContent1 = LayoutInflater.from(context).inflate(R.layout.page_4_select_dialog, null);
					final AlertDialog alertDialog1 = new AlertDialog.Builder(context).setTitle("��ѡ�����").setView(dialogContent1).create();//ʵ�ַ�ʽ ��������
					alertDialog1.show();
					RadioGroup group1 = (RadioGroup) dialogContent1.findViewById(R.id.radioGroup);
					group1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
						
						@Override
						public void onCheckedChanged(RadioGroup arg0, int arg1) {
							alertDialog1.dismiss();
							//��ȡ������ѡ�����ID
							int radioButtonId = arg0.getCheckedRadioButtonId();
							//����ID��ȡRadioButton��ʵ��
							RadioButton rb = (RadioButton)dialogContent1.findViewById(radioButtonId);
							//�����ı����ݣ��Է���ѡ����
							String str = (String) rb.getText();
							Log.e("---> CustomDialog - TextSlected", str);
							Toast toast = Toast.makeText(context, "���Ѿ��������л�Ϊ: "+str, Toast.LENGTH_SHORT);
							toast.setGravity(Gravity.CENTER, 0, 0);
							toast.show();
							
						}
					});
					break;
				case 1://ͼƬ��������

					break;
				case 2://��ʱͨѶ����

					break;
				case 3://�û�����
					context.startActivity(new Intent(context, YongHuFanKuiActivity.class));
					break;
				case 4://ʹ�ð���
					final View dialogContent4 = LayoutInflater.from(context).inflate(R.layout.page_4_dialog_help, null);
					final AlertDialog alertDialog4 = new AlertDialog.Builder(context).setTitle("Help").setView(dialogContent4).create();//ʵ�ַ�ʽ ��������
					alertDialog4.show();
					break;
				case 5://��������
					final View dialogContent5 = LayoutInflater.from(context).inflate(R.layout.page_4_dialog_about_us, null);
					final AlertDialog alertDialog5 = new AlertDialog.Builder(context).setTitle("About Us").setView(dialogContent5).create();//ʵ�ַ�ʽ ��������
					alertDialog5.show();
					break;
				case 6://��������
					final View dialogContent6 = LayoutInflater.from(context).inflate(R.layout.page_4_dialog_mian_ze, null);
					final AlertDialog alertDialog6 = new AlertDialog.Builder(context).setTitle("��������").setView(dialogContent6).create();//ʵ�ַ�ʽ ��������
					alertDialog6.show();
					break;
					
				default:
					break;
				}
				
			}
		});
	}

}
