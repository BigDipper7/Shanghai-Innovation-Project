package com.example.myappdemo.utils.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public class CustomDialog extends Dialog{

	private Context context;
	private int resLayout;
	private int theme;
	private OnCusDiaItmClickListener listener;
	
	public interface OnCusDiaItmClickListener {
		/**
		 *回调函数，用于刷新Main -->UI 
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
	}
	
}
