package com.example.myappdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

import com.example.myappdemo.Utils.model.DataGenUtil;
import com.example.myappdemo.Utils.view.GenerateXML;

public class MainActivity extends Activity {
	private List<User> usergroup=new ArrayList<User>();
	private List<String>  titleList = new ArrayList<String>();
	private List<View> viewList = new ArrayList<View>();
	private ViewPager viewPager;//ViewPager 
	private LinearLayout ll1, ll2, ll3, ll4;
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
		
		Button but1=(Button) page4.findViewById(R.id.button1);
		but1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.i("heloo", "注销");
			}
		});
		
		
		
		//讀取數據
		int count=readSharedPreferencesInt("count");
		for(int i=0;i<count;i++){
		String user=readSharedPreferencesString("user");
		String location=readSharedPreferencesString("location");
		int price=readSharedPreferencesInt("price");
		User us=new User();
		
		us.setUserName(user);
		us.setLocation(location);
		us.setPrice(price);
		
		usergroup.add(us);
		}
		Bundle bundle=new Bundle();
		bundle.putSerializable("user",(Serializable) usergroup);
		
		
		
		
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
		simpleAdapter1 = new SimpleAdapter(MainActivity.this, DataGenUtil.getData1(), R.layout.page_1_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter2 = new SimpleAdapter(MainActivity.this, DataGenUtil.getData2(), R.layout.page_2_item_for_linearlayout, new String[] {"txt1", "txt2", "imgEnd"}, new int[] {R.id.textView1, R.id.textView2, R.id.imageView2});
		simpleAdapter3 = new SimpleAdapter(MainActivity.this, DataGenUtil.getData3(), R.layout.page_3_item_for_linearlayout, new String[] {"img", "txt", "imgEnd"}, new int[] {R.id.imageView1, R.id.textView1, R.id.imageView2});
		simpleAdapter4 = new SimpleAdapter(MainActivity.this, DataGenUtil.getData4(), R.layout.page_4_item_for_linearlayout, new String[] {"img", "txt", "imgEnd"}, new int[] {R.id.imageView1, R.id.textView1, R.id.imageView2});
		
		/*
		 * adapter -> view -> insert in linearlayout
		 * in the meantime  genItems for LinearLayout
		 * */
		GenerateXML.genLinearLayoutItems(ll1, simpleAdapter1, MainActivity.this, 1,bundle);
		GenerateXML.genLinearLayoutItems(ll2, simpleAdapter2, MainActivity.this, 2,bundle);
		GenerateXML.genLinearLayoutItems(ll3, simpleAdapter3, MainActivity.this, 3,bundle);
		GenerateXML.genLinearLayoutItems(ll4, simpleAdapter4, MainActivity.this, 4,bundle);
	
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
	
	 private void saveSharedPreferences(String arg0,boolean bool){  
	        /* 
	         * getSharedPreferences(String name,int mode)方法是在Context中定义的抽象方法，在ContextWrapper中进行了具体实现， 
	         * 该方法会根据用户传递的名称和写入类型创建一个SharedPreferences对象进行返回。 
	         * 在Activity中，还有一个方法可以回去SharedPreferences对象，这个方法就是SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE); 
	         * 改方法在Activity中定义并实现，这里没有name参数是因为该方法默认将当前Activity的类名作为name属性（这里的类名并不包含包路径哦） 
	         * */  
	        SharedPreferences sharedPreferences = getSharedPreferences("preferences", MODE_PRIVATE);  
	          
	        //存储数据  
	        SharedPreferences.Editor editor = sharedPreferences.edit();  
	        editor.putBoolean(arg0, bool);
	        Boolean b = editor.commit();  
	          
	        if(b){  
	            Log.i("通知：", "保存成功！");  
	        }else{  
	            Log.i("通知", "保存失败！");  
	        }  
	          
	    }  
	 private void saveSharedPreferences(String arg0,int arg1){  
	        SharedPreferences sharedPreferences = getSharedPreferences("preferences", MODE_PRIVATE);  
	          
	        //存储数据  
	        SharedPreferences.Editor editor = sharedPreferences.edit();  
	        editor.putInt(arg0, arg1);
	        Boolean b = editor.commit();  
	          
	        if(b){  
	            Log.i("通知：", "保存成功！");  
	        }else{  
	            Log.i("通知", "保存失败！");  
	        }  
	          
	    }  
	      
	 private void saveSharedPreferences(String arg0,String arg1){  
	        SharedPreferences sharedPreferences = getSharedPreferences("preferences", MODE_PRIVATE);  
	          
	        //存储数据  
	        SharedPreferences.Editor editor = sharedPreferences.edit();  
	        editor.putString(arg0, arg1);
	        Boolean b = editor.commit();  
	          
	        if(b){  
	            Log.i("通知：", "保存成功！");  
	        }else{  
	            Log.i("通知", "保存失败！");  
	        }  
	          
	    }  

	    private String readSharedPreferencesString(String arg0){   
	        String result = "" ;  
	        SharedPreferences sharedPreferences = this.getSharedPreferences("preferences", MODE_PRIVATE);  
	        result+=sharedPreferences.getString(arg0, "暂时没有人"); 
			return result;  	        
	    }  
	    private int readSharedPreferencesInt(String arg0){   
	        int result = 0 ;  
	        SharedPreferences sharedPreferences = this.getSharedPreferences("preferences", MODE_PRIVATE);  
	        result=sharedPreferences.getInt(arg0, 0); 
			return result;  	        
	    }  
	    private Boolean readSharedPreferencesBoolean(String arg0){   
	        Boolean result = false ;  
	        SharedPreferences sharedPreferences = this.getSharedPreferences("preferences", MODE_PRIVATE);  
	        result=sharedPreferences.getBoolean(arg0, false); 
			return result;  	        
	    }  


}
