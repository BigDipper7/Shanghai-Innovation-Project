package com.example.myappdemo.activity.page3;

import com.example.myappdemo.R;
import com.example.myappdemo.R.layout;
import com.example.myappdemo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ChattingActivity extends Activity {

	private Button titleBarBack_btn;
	private TextView titleBarTitle_tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_page3_ji_shi_tong_xun_chatting);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
        
        String name = this.getIntent().getStringExtra("name");//get user name
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
        titleBarTitle_tv.setText(name);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chatting, menu);
		return true;
	}

}
