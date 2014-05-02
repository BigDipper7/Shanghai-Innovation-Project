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
		 *回调函数，用于刷新Main UI 
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
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(resLayout);
		page = LayoutInflater.from(context).inflate(resLayout, null);
		radioGroup = (RadioGroup) page.findViewById(R.id.radioGroup);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				//获取变更后的选中项的ID
				int radioButtonId = group.getCheckedRadioButtonId();
				//根据ID获取RadioButton的实例
				RadioButton rb = (RadioButton)page.findViewById(radioButtonId);
				//更新文本内容，以符合选中项
				String str = (String) rb.getText();
				Log.e("---> CustomDialog - TextSlected", str);
				listener.CusDiaItmClickListener(str);
			}
		});
	}
	
}
