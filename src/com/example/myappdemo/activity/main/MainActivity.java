package com.example.myappdemo.activity.main;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

import com.example.myappdemo.R;
import com.example.myappdemo.utils.model.DataGenUtil4ActivMain;
import com.example.myappdemo.utils.view.GenerateXML;

public class MainActivity extends Activity {
	private List<String>  titleList = new ArrayList<String>();
	private List<View> viewList = new ArrayList<View>();
	private ViewPager viewPager;//ViewPager 
	private LinearLayout ll1, ll2, ll3, ll4;
	private Button page1Btn_11, page1Btn_12, page1Btn_13, page1Btn_21, page1Btn_22, page1Btn_23, page2Btn_search;
	private PagerAdapter pagerAdapter;//Adapter for viewpager 
	private SimpleAdapter simpleAdapter1, simpleAdapter2, simpleAdapter3, simpleAdapter4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		/*
		 * initialize the page titles
		 * */
		String xmlTitle1 = "首页";
		String xmlTitle2 = "搜索";
		String xmlTitle3 = "我的租房";
		String xmlTitle4 = "更多";
		titleList.add(xmlTitle1);
		titleList.add(xmlTitle2);
		titleList.add(xmlTitle3);
		titleList.add(xmlTitle4);
		
		/*
		 *  initialize the page view
		 * */
		LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
		View page1 = layoutInflater.inflate(R.layout.page_1, null);
		View page2 = layoutInflater.inflate(R.layout.page_2, null);
		View page3 = layoutInflater.inflate(R.layout.page_3, null);
		View page4 = layoutInflater.inflate(R.layout.page_4, null);
		viewList.add(page1);
		viewList.add(page2);
		viewList.add(page3);
		viewList.add(page4);
			
		/*
		 *  initialize the views
		 * */
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		ll1 = (LinearLayout) page1.findViewById(R.id.linearLayout1);
		ll2 = (LinearLayout) page2.findViewById(R.id.linearLayout1);
		ll3 = (LinearLayout) page3.findViewById(R.id.linearLayout1);
		ll4 = (LinearLayout) page4.findViewById(R.id.linearLayout1);
		
		/*
		 * initialize page1 buttons
		 * */
		page1Btn_11 = (Button) page1.findViewById(R.id.button1); 
		page1Btn_12 = (Button) page1.findViewById(R.id.button2); 
		page1Btn_13 = (Button) page1.findViewById(R.id.button3); 
		page1Btn_21 = (Button) page1.findViewById(R.id.button4); 
		page1Btn_22 = (Button) page1.findViewById(R.id.button5); 
		page1Btn_23 = (Button) page1.findViewById(R.id.button6); 
		
		/*
		 * initialize page1 buttons OnClickListener --->  go to different activities
		 * */
		page1Btn_11.setOnClickListener(new OnClickListener() {//新房
			
			@Override
			public void onClick(View arg0) {
				viewPager.setCurrentItem(2, true);
//				startActivity(new Intent(MainActivity.this, XinFangActivity.class));
			}
		});
		page1Btn_12.setOnClickListener(new OnClickListener() {//二手房
			
			@Override
			public void onClick(View arg0) {
				viewPager.setCurrentItem(2, true);
//				startActivity(new Intent(MainActivity.this, ErShouFangActivity.class));
			}
		});
		page1Btn_13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				viewPager.setCurrentItem(1, true);//跳转到第二个界面 搜索界面  实现逻辑就是 先是跳转 然后就是搜索 然后就是显示ZuFangActivity
//				startActivity(new Intent(MainActivity.this, ZuFangActivity.class));
			}
		});
		page1Btn_21.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this, ZhouBianFangJiaActivity.class));
			}
		});
		page1Btn_22.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this, WoYaoMaiFangActivity.class));
			}
		});
		page1Btn_23.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
//				viewPager.setCurrentItem(3, true);
				startActivity(new Intent(MainActivity.this, WoYaoChuZuActivity.class));
			}
		});
		
		
		/*
		 * initialize page2 button {search button}
		 * */
		page2Btn_search = (Button) page2.findViewById(R.id.button1);
		page2Btn_search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, ZuFangActivity.class));
			}
		});
		
		/*
		 * initialize adapters
		 * */
		pagerAdapter = new PagerAdapter() {
			
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
			
			@Override
			public int getCount() {
				return viewList.size();
			}
			
			@Override
			public void destroyItem(ViewGroup container, int position,
					Object object) {
				container.removeView(viewList.get(position));
//				super.destroyItem(container, position, object);
			}
			
			@Override
			public CharSequence getPageTitle(int position) {
				return titleList.get(position);
			}
			
			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				container.addView(viewList.get(position));
				return viewList.get(position);
			}
			
			@Override
			public int getItemPosition(Object object) {
				return super.getItemPosition(object);
			}
		};
		simpleAdapter1 = new SimpleAdapter(MainActivity.this, DataGenUtil4ActivMain.getData1(), R.layout.page_1_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter2 = new SimpleAdapter(MainActivity.this, DataGenUtil4ActivMain.getData2(), R.layout.page_2_item_for_linearlayout, new String[] {"txt1", "txt2", "imgEnd"}, new int[] {R.id.textView1, R.id.textView2, R.id.imageView2});
		simpleAdapter3 = new SimpleAdapter(MainActivity.this, DataGenUtil4ActivMain.getData3(), R.layout.page_3_item_for_linearlayout, new String[] {"img", "txt", "imgEnd"}, new int[] {R.id.imageView1, R.id.textView1, R.id.imageView2});
		simpleAdapter4 = new SimpleAdapter(MainActivity.this, DataGenUtil4ActivMain.getData4(), R.layout.page_4_item_for_linearlayout, new String[] {"img", "txt", "imgEnd"}, new int[] {R.id.imageView1, R.id.textView1, R.id.imageView2});
		
		/*
		 * adapter -> view -> insert in linearlayout
		 * in the meantime  genItems for LinearLayout
		 * */
		GenerateXML.genLinearLayoutItems(ll1, simpleAdapter1, MainActivity.this, 1);
		GenerateXML.genLinearLayoutItems(ll2, simpleAdapter2, MainActivity.this, 2);
		GenerateXML.genLinearLayoutItems(ll3, simpleAdapter3, MainActivity.this, 3);
		GenerateXML.genLinearLayoutItems(ll4, simpleAdapter4, MainActivity.this, 4);
	
		/*
		 *  set adapter
		 * */
		viewPager.setAdapter(pagerAdapter);

		/*
		 *  set list view height
		 * */
//		MyUtils.setListViewHeightBasedOnChildren(listView, MainActivity.this);
//		MyUtils.setListViewHeightBasedOnChildren(listView2, MainActivity.this);
//		MyUtils.setListViewHeightBasedOnChildren(listView3, MainActivity.this);
//		MyUtils.setListViewHeightBasedOnChildren(listView4, MainActivity.this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
