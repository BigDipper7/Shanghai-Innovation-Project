package com.example.myappdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ZhouBianFangJiaActivity extends Activity {
	private Button titleBarBack_btn;
	private TextView titleBarTitle_tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_zhou_bian_fang_jia);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
        
        /*
         * initialize titlebar back button & set back button on click listener
         * */
        titleBarBack_btn = (Button) findViewById(R.id.button1);
        titleBarBack_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
        titleBarTitle_tv = (TextView) findViewById(R.id.textView1);
        titleBarTitle_tv.setText("÷‹±ﬂ∑øº€");
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.zhou_bian_fang_jia, menu);
		return true;
	}

}
