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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.myappdemo.Utils.GenerateXML;
import com.example.myappdemo.Utils.MyUtils;

public class MainActivity extends Activity {
	private List<String>  titleList = new ArrayList<String>();
	private List<View> viewList = new ArrayList<View>();
	private ViewPager viewPager;//ViewPager 
	private LinearLayout ll1, ll2, ll3, ll4;
	private PagerAdapter pagerAdapter;//Adapter for viewpager 
	private SimpleAdapter simpleAdapter1, simpleAdapter2, simpleAdapter3, simpleAdapter4;
	
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
		simpleAdapter1 = new SimpleAdapter(MainActivity.this, MyUtils.getData1(), R.layout.page_1_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter2 = new SimpleAdapter(MainActivity.this, MyUtils.getData2(), R.layout.page_2_item_for_linearlayout, new String[] {"txt1", "txt2", "imgEnd"}, new int[] {R.id.textView1, R.id.textView2, R.id.imageView2});
		simpleAdapter3 = new SimpleAdapter(MainActivity.this, MyUtils.getData3(), R.layout.page_3_item_for_linearlayout, new String[] {"img", "txt", "imgEnd"}, new int[] {R.id.imageView1, R.id.textView1, R.id.imageView2});
		simpleAdapter4 = new SimpleAdapter(MainActivity.this, MyUtils.getData4(), R.layout.page_4_item_for_linearlayout, new String[] {"img", "txt", "imgEnd"}, new int[] {R.id.imageView1, R.id.textView1, R.id.imageView2});
		
		/*
		 * adapter -> view -> insert in linearlayout
		 * in the meantime  genItems for LinearLayout
		 * */
		GenerateXML.genLinearLayoutItems(ll1, simpleAdapter1, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll2, simpleAdapter2, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll3, simpleAdapter3, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll4, simpleAdapter4, MainActivity.this);
	
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
