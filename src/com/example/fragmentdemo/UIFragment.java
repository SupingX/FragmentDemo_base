package com.example.fragmentdemo;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;

public class UIFragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//设置容器的大小
		container.setLayoutParams(new LayoutParams(100, 100));
		container.setBackgroundColor(Color.GREEN);
		//将UIFragment动态添加到容器ViewGroup中，使用的inflate方法
		View view = inflater.inflate(R.layout.ui_fragment, container, false);
		return view;
	}
	

}
