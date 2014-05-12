package com.example.myappdemo.utils.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.myappdemo.R;

public class DataGenUtil4ActivJiShiTongXun {
	/*
	 * get the data while deal with page3_view_for_JiShiTongXun
	 */
	public static List<Map<String, Object>> getData1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("img1", R.drawable.profile_icon_1);
		item1.put("txt", "Timo");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img1", R.drawable.profile_icon_2);
		item1.put("txt", "God");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img1", R.drawable.profile_icon_3);
		item1.put("txt", "Alien");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img1", R.drawable.profile_icon_4);
		item1.put("txt", "Kin");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img1", R.drawable.profile_icon_5);
		item1.put("txt", "Jane");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img1", R.drawable.profile_icon_default);
		item1.put("txt", "LionKing");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}
}
