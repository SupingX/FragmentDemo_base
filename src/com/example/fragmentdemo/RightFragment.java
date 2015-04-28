package com.example.fragmentdemo;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightFragment extends Fragment {
	
	@Override
	public void onInflate(Activity activity, AttributeSet attrs,
			Bundle savedInstanceState) {
		System.out.println("--1--onInflate()--");
		//activity获取资源
		System.out.println(activity.getResources().getString(R.string.hello_world));
		//attrs 资源文件里的属性
		//savedInstanceState 保存的状态
		super.onInflate(activity, attrs, savedInstanceState);
	}
	
	@Override
	public void onAttach(Activity activity) {
		System.out.println("--2--onAttach()--");
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		System.out.println("--3--onCreate()--");
		System.out.println("初始化一些数据 ...");
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		System.out.println("--4--onCreateView()--");
		View view = inflater.inflate(R.layout.right_fragment, null);
		return view;
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		System.out.println("--5--onViewCreated()--");
		super.onViewCreated(view, savedInstanceState);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		System.out.println("--6--onActivityCreated()--");
		System.out.println("可以操作view");
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	public void onStart() {
		System.out.println("--7--onStart()--");
		System.out.println("建议逻辑放在这里");
		
		super.onStart();
	}
	
	@Override
	public void onResume() {
		System.out.println("--8--onResume()--");
		super.onResume();
	}
	
	@Override
	public void onPause() {
		System.out.println("--9--onPause()--");
		super.onPause();
	}
	
	@Override
	public void onStop() {
		System.out.println("--10--onStop()--");
		super.onStop();
	}
	
	@Override
	public void onDestroyView() {
		System.out.println("--11--onDestroyView()--");
		super.onDestroyView();
	}
	
	@Override
	public void onDestroy() {
		System.out.println("--12--onDestroy()--");
		super.onDestroy();
	}
	
	@Override
	public void onDetach() {
		System.out.println("--13--onDetach()--");
		super.onDetach();
	}
}
