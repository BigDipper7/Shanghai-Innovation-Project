package com.example.myappdemo.utils.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.example.myappdemo.R;

public class CustomDialog extends Dialog{

	private Context context;
	private int resLayout;
	private int theme;
	private OnCusDiaItmClickListener listener;
	private View page;
	private RadioGroup radioGroup;
	
	public interface OnCusDiaItmClickListener {
		/**
		 *�ص�����������ˢ��Main UI 
		 */
		public void CusDiaItmClickListener(String string);
	}
	
	public CustomDialog(Context context) {
		super(context);
		this.context = context;
	}
	
	public CustomDialog(Context context, int resLayout) {
		super(context);
		this.context = context;
		this.resLayout = resLayout;
	}

	public CustomDialog(Context context, int resLayout, int theme) {
		super(context, theme);
		this.context = context;
		this.resLayout = resLayout;
		this.theme = theme;
	}
	
	public CustomDialog(Context context, int resLayout, int theme, OnCusDiaItmClickListener listener) {
		super(context, theme);
		this.context = context;
		this.resLayout = resLayout;
		this.theme = theme;
		this.listener = listener;
		Log.e("CustomDialog -- Constructor", "Construct init");
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(resLayout);
		Log.e("CustomDialog---OnCreate", "OnCreate init");
		page = LayoutInflater.from(context).inflate(resLayout, null);
		Log.e("CustomDialog---RadioPage", ""+page);
		radioGroup = (RadioGroup) page.findViewById(R.id.radioGroup);
		Log.e("CustomDialog---RedioGroup", ""+radioGroup);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				dismiss();
				//��ȡ������ѡ�����ID
				int radioButtonId = group.getCheckedRadioButtonId();
				//����ID��ȡRadioButton��ʵ��
				RadioButton rb = (RadioButton)page.findViewById(radioButtonId);
				//�����ı����ݣ��Է���ѡ����
				String str = (String) rb.getText();
				Log.e("---> CustomDialog - TextSlected", str);
				listener.CusDiaItmClickListener(str);
			}
		});
	}
	
}
