package com.example.myappdemo.activity.page3;

import com.example.myappdemo.R;
import com.example.myappdemo.R.layout;
import com.example.myappdemo.R.menu;
import com.example.myappdemo.activity.main.MainActivity;
import com.example.myappdemo.activity.page4.YongHuFanKuiActivity;
import com.example.myappdemo.utils.model.DataGenUtil4ActivJiShiTongXun;
import com.example.myappdemo.utils.model.DataGenUtil4ActivMain;
import com.example.myappdemo.utils.view.GenerateXML;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class JiShiTongXunActivity extends Activity {

	private TextView titleBarTitle_tv;
	private Button titleBarConfirm_btn, titleBarBack_btn;
	private SimpleAdapter simpleAdapter1;
	private LinearLayout ll1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_page3_ji_shi_tong_xun);
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
        titleBarTitle_tv.setText("即时通讯");
        titleBarConfirm_btn = (Button) findViewById(R.id.button2);
        titleBarConfirm_btn.setText("发现");
        titleBarConfirm_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast toast = Toast.makeText(JiShiTongXunActivity.this, "正在扫描即时通讯~~", Toast.LENGTH_SHORT);
				toast.show();
				finish();
			}
		});
        init();
	}

	private void init() {
		ll1 = (LinearLayout) findViewById(R.id.linearLayout1);
		simpleAdapter1 = new SimpleAdapter(JiShiTongXunActivity.this, DataGenUtil4ActivJiShiTongXun.getData1(), R.layout.page_3_item4_ji_shi_tong_xun_item_for_linearlayout, new String[] {"img1", "txt", "imgEnd"}, new int[] {R.id.imageView1, R.id.textView2, R.id.imageView2});
		GenerateXML.genLinearLayoutItems(ll1, simpleAdapter1, JiShiTongXunActivity.this, 34);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ji_shi_tong_xun, menu);
		return true;
	}

}
