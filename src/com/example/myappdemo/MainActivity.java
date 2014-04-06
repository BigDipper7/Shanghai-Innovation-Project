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
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.myappdemo.Utils.MyUtils;

public class MainActivity extends Activity {
	private List<String> titleList = new ArrayList<String>();
	private List<View> viewList = new ArrayList<View>();
	private ViewPager viewPager;//ViewPager 
	private ListView listView, listView2;//ListView
	private PagerAdapter pagerAdapter;//Adapter for viewpager 
	private SimpleAdapter simpleAdapter, simpleAdapter2;
	
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
		String xmlTitle4 = "首页";
		String xmlTitle2 = "搜索";
		String xmlTitle1 = "我的租房";
		String xmlTitle3 = "账户设置";
		titleList.add(xmlTitle4);
		titleList.add(xmlTitle2);
		titleList.add(xmlTitle1);
		titleList.add(xmlTitle3);
		
		/*
		 *  initialize the page view
		 * */
		LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
		View page4 = layoutInflater.inflate(R.layout.page4, null);
		View page2 = layoutInflater.inflate(R.layout.page2, null);
		View page1 = layoutInflater.inflate(R.layout.page1, null);
		View page3 = layoutInflater.inflate(R.layout.page3, null);
		viewList.add(page4);
		viewList.add(page2);
		viewList.add(page1);
		viewList.add(page3);
			
		/*
		 *  initialize the views
		 * */
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		listView = (ListView) page1.findViewById(R.id.listView1);
		listView2 = (ListView) page2.findViewById(R.id.listView1);
		
		
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
//		arrayAdapter = new ArrayAdapter<View>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, MyUtils.getData(MainActivity.this));
		simpleAdapter = new SimpleAdapter(MainActivity.this, MyUtils.getData(), R.layout.page1_view_for_listview, new String[] {"img", "txt", "txt2"}, new int[] {R.id.imageView1, R.id.textView1, R.id.textView2});
		simpleAdapter2 = new SimpleAdapter(MainActivity.this, MyUtils.getData2(), R.layout.page2_view_for_listview, new String[] {"txt1", "txt2", "txt3"}, new int[] {R.id.textView1, R.id.textView2, R.id.textView3});
		
		/*
		 *  set adapter
		 * */
		viewPager.setAdapter(pagerAdapter);
		listView.setAdapter(simpleAdapter);
		listView2.setAdapter(simpleAdapter2);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
