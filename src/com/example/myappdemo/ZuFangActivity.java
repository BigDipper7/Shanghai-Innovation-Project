package com.example.myappdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.myappdemo.utils.model.DataGenUtil4ActivZuFang;
import com.example.myappdemo.utils.view.GenerateXML;

public class ZuFangActivity extends Activity {
	private Button titleBarBack_btn;
	private TextView titleBarTitle_tv;
	private SimpleAdapter simpleAdapter;
	private LinearLayout ll1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_zu_fang);
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
        titleBarTitle_tv.setText("×â·¿");
        
        init();
	}

	private void init() {
		/*
		 * initialize linearlayout
		 * */
		ll1 = (LinearLayout) findViewById(R.id.linearLayout1);
		Log.e("zufang_acticity", "init()");
		/*
		 * initialize adapters
		 * */
		simpleAdapter = new SimpleAdapter(ZuFangActivity.this, DataGenUtil4ActivZuFang.getData1(), R.layout.page_1_button13_item_for_linearlayout, new String[] {"img1", "txt", "imgEnd"}, new int[] {R.id.imageView1 ,R.id.textView1, R.id.imageView2});
		
		GenerateXML.genLinearLayoutItems(ll1, simpleAdapter, ZuFangActivity.this, 113);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.zu_fang, menu);
		return true;
	}

}
