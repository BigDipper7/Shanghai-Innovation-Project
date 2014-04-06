package com.example.myappdemo.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.myappdemo.R;

public class MyUtils {
	/*
	 * get the data  while deal with  page1_view_for_listviw.xml
	 * */
	public static List< Map<String, Object> > getData() {
		List< Map<String, Object> >  data = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "热门活动");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "我的新房");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "我的二手房");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "我的租房");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "即时通讯");
		data.add(item1);
		
		return data;
	}
	
}
