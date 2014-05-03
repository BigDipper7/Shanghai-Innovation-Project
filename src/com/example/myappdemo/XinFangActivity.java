package com.example.myappdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class XinFangActivity extends Activity {
	private Button titleBarBack_btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_xin_fang);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
        
        titleBarBack_btn = (Button) findViewById(R.id.button1);
        titleBarBack_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
//				arg0.setBackgroundResource(R.drawable.btn_left_s);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.xin_fang, menu);
		return true;
	}

}
