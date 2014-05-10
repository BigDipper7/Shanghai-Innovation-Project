package com.example.myappdemo.activity.main;

import com.example.myappdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class WoYaoChuZuActivity extends Activity {

	private Button titleBarBack_btn;
	private TextView titleBarTitle_tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_wo_yao_chu_zu);
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
        titleBarTitle_tv.setText("ÎÒÒª³ö×â");
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wo_yao_buy, menu);
		return true;
	}

}
