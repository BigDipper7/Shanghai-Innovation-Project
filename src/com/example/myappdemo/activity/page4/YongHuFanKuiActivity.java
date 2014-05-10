package com.example.myappdemo.activity.page4;

import com.example.myappdemo.R;
import com.example.myappdemo.R.layout;
import com.example.myappdemo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class YongHuFanKuiActivity extends Activity {

	private Button titleBarBack_btn;
	private TextView titleBarTitle_tv;
	private Button titleBarConfirm_btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_page4_yong_hu_fan_kui);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar_1);

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
        titleBarTitle_tv.setText("用户反馈");
        titleBarConfirm_btn = (Button) findViewById(R.id.button2);
        titleBarConfirm_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast toast = Toast.makeText(YongHuFanKuiActivity.this, "已经将您的意见反馈给我们，谢谢", Toast.LENGTH_SHORT);
				toast.show();
				finish();
			}
		});
        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.yong_hu_fan_kui, menu);
		return true;
	}

}
