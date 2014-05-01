package com.example.myappdemo.utils.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.myappdemo.R;
import com.example.myappdemo.utils.DensityUtil;

public class DataGenUtil {
	/*
	 * get the data while deal with page1_view_for_listviw.xml
	 */
	public static List<Map<String, Object>> getData1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt", "4���Ϻ���ӭ\"�ٵ���С����\"");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "�˾�ʮ�����Ƶ���� ��������̫��");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "��ý���н�Υ�� ������Ѽ��ɵ���");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "��ѹ���� ���\"��ҵ�ϻ���\"������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "��������");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "��������");
//		item1.put("txt2", "     >  ");
//		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "�۸�");
		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "��ɫ");
		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "����");
		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "װ��״��");
		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}

	public static List<Map<String, Object>> getData3() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "���Ż");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�ҵ��·�");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�ҵĶ��ַ�");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�ҵ��ⷿ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "��ʱͨѶ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData4() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�л�����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "ͼƬ��������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "��ʱͨѶ����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "�û�����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "ʹ�ð���");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "��������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "��������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}
	
	

	/**
	 * ����listview��ʵ�߶� �����scroll view�м�listviewֻ��ʾһ�е����� 
	 * @param listView
	 * @param context
	 */
	public static void setListViewHeightBasedOnChildren(ListView listView, Context context) {   
        // ��ȡListView��Ӧ��Adapter   
        ListAdapter listAdapter = listView.getAdapter();   
        if (listAdapter == null) {   
            return;   
        }   
   
        int totalHeight = 0;   
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {   
            // listAdapter.getCount()�������������Ŀ   
            View listItem = listAdapter.getView(i, null, listView);   
            // ��������View �Ŀ��   
            listItem.measure(0, 0);    
            // ͳ������������ܸ߶�   
            totalHeight += listItem.getMeasuredHeight();    
        }   
   
        ViewGroup.LayoutParams params = listView.getLayoutParams();   
        //TODO  ��֪��Ϊʲôbug��  ����д��14  ��1p��divider�ĸ߶�
        params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1)) + DensityUtil.dip2px(context, 14);   
        // listView.getDividerHeight()��ȡ�����ָ���ռ�õĸ߶�   
        //DensityUtil.dip2px(context, 14) ����Ϊ�����ı����߿��peddingֵ��7dp &7dp ��14dp����ת����px  Ȼ���ٽ��и�ֵ
        // params.height���õ�����ListView������ʾ��Ҫ�ĸ߶�   
        listView.setLayoutParams(params);   
    }
}
