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
		item1.put("txt", "10����ͬ�ô�ѧ�Ծ�װ��2��");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "�˾�ʮ�����Ƶ���� ��������̫��");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "��ý���н�Υ�� ������Ѽ��ɵ���");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "��ѹ���� ���\"��ҵ�ϻ���\"������");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}
	
}
