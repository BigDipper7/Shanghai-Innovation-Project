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
		item1.put("txt", "���Ż");
		item1.put("txt2","     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�ҵ��·�");
		item1.put("txt2", "     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�ҵĶ��ַ�");
		item1.put("txt2", "     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�ҵ��ⷿ");
		item1.put("txt2", "     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "��ʱͨѶ");
		item1.put("txt2", "     >  ");
		data.add(item1);
		
		return data;
	}

	public static List< Map<String, Object> >  getData2() {
		List< Map<String, Object> >  data = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("txt3","     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("txt3", "     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("txt1", "�۸�");
		item1.put("txt2", "����");
		item1.put("txt3", "     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("txt1", "��ɫ");
		item1.put("txt2", "����");
		item1.put("txt3", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("txt3", "     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("txt3", "     >  ");
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("txt1", "װ��״��");
		item1.put("txt2", "����");
		item1.put("txt3", "     >  ");
		data.add(item1);
		
		
		return data;
	}
	
}
