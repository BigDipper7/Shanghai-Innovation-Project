package com.example.myappdemo.utils.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.myappdemo.R;

public class DataGenUtil4ActivZuFang {
	/**
	 * Generate Data 4 Activity ZuFang
	 */
	
	public static List<Map<String, Object>> getData1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("img1", R.drawable.page_1_zu_fang_item1_pic);
		item1.put("txt", "10号线同济大学旁精装修2房");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "八九十年代房频出事 房子寿命太短");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "央媒曝中介违规 付服务费即可垫资");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "承压过大 万科\"事业合伙人\"遭质疑");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}
	
}
