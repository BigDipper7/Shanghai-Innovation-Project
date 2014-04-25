package com.example.myappdemo.Utils;

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

public class MyUtils {
	/*
	 * get the data while deal with page1_view_for_listviw.xml
	 */
	public static List<Map<String, Object>> getData() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "热门活动");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "我的新房");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "我的二手房");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "我的租房");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "即时通讯");
		item1.put("txt2", "     >  ");
		data.add(item1);

		return data;
	}

	public static List<Map<String, Object>> getData2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt1", "区域");
		item1.put("txt2", "不限");
		item1.put("txt3", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "类型");
		item1.put("txt2", "不限");
		item1.put("txt3", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "价格");
		item1.put("txt2", "不限");
		item1.put("txt3", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "特色");
		item1.put("txt2", "不限");
		item1.put("txt3", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "环线");
		item1.put("txt2", "不限");
		item1.put("txt3", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "地铁");
		item1.put("txt2", "不限");
		item1.put("txt3", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "装修状况");
		item1.put("txt2", "不限");
		item1.put("txt3", "     >  ");
		data.add(item1);

		return data;
	}

	public static List<Map<String, Object>> getData3() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "切换城市");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "图片质量设置");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "即时通讯设置");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "用户反馈");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "使用帮助");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "关于我们");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "免责声明");
		item1.put("txt2", "     >  ");
		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData4() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt", "4月上海或迎\"迟到的小阳春\"");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "八九十年代房频出事 房子寿命太短");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "央媒曝中介违规 付服务费即可垫资");
		item1.put("txt2", "     >  ");
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "承压过大 万科\"事业合伙人\"遭质疑");
		item1.put("txt2", "     >  ");
		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "关于我们");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "免责声明");
//		item1.put("txt2", "     >  ");
//		data.add(item1);

		return data;
	}

	/**
	 * 设置listview真实高度 解决了scroll view中间listview只显示一行的问题 
	 * @param listView
	 * @param context
	 */
	public static void setListViewHeightBasedOnChildren(ListView listView, Context context) {   
        // 获取ListView对应的Adapter   
        ListAdapter listAdapter = listView.getAdapter();   
        if (listAdapter == null) {   
            return;   
        }   
   
        int totalHeight = 0;   
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {   
            // listAdapter.getCount()返回数据项的数目   
            View listItem = listAdapter.getView(i, null, listView);   
            // 计算子项View 的宽高   
            listItem.measure(0, 0);    
            // 统计所有子项的总高度   
            totalHeight += listItem.getMeasuredHeight();    
        }   
   
        ViewGroup.LayoutParams params = listView.getLayoutParams();   
        //TODO  不知道为什么bug了  不能写成14  少1p的divider的高度
        params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1)) + DensityUtil.dip2px(context, 14);   
        // listView.getDividerHeight()获取子项间分隔符占用的高度   
        //DensityUtil.dip2px(context, 14) 是因为最外层的背景边框的pedding值是7dp &7dp 共14dp将其转化成px  然后再进行赋值
        // params.height最后得到整个ListView完整显示需要的高度   
        listView.setLayoutParams(params);   
    }
}
