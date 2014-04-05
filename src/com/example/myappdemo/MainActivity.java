package com.example.myappdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	private List<String> titleList = new ArrayList<String>();
	private List<View> viewList = new ArrayList<View>();
	private ViewPager viewPager;//ViewPager 
	private ListView listView;//ListView
	private PagerAdapter pagerAdapter;//Adapter for viewpager 
	private ArrayAdapter<String> arrayAdapter;//Adapter for listview
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		
		/*
		 * initialize the page titles
		 * */
		String xmlTitle1 = "ÎÒµÄ×â·¿";
		String xmlTitle2 = "Page 2";
		String xmlTitle3 = "Page 3";
		titleList.add(xmlTitle1);
		titleList.add(xmlTitle2);
		titleList.add(xmlTitle3);
		getLayoutInflater();
		/*
		 *  initialize the page view
		 * */
		LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
		View page1 = layoutInflater.inflate(R.layout.layout1, null);
		View page2 = layoutInflater.inflate(R.layout.layout2, null);
		View page3 = layoutInflater.inflate(R.layout.layout3, null);
		viewList.add(page1);
		viewList.add(page2);
		viewList.add(page3);
		
		/*
		 *  initialize the views
		 * */
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		listView = (ListView) page1.findViewById(R.id.listView1);
		
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
		arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, getData());
		
		/*
		 *  set adapter
		 * */
		viewPager.setAdapter(pagerAdapter);
		listView.setAdapter(arrayAdapter);
		
		
	}

	private List<String> getData() {
		List<String> data = new ArrayList<String>();
		data.add("data1");
		data.add("data2");
		data.add("data3");
		data.add("data4");
		data.add("data5");
		data.add("data6");
		data.add("data7");
		data.add("data8");
		return data;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
