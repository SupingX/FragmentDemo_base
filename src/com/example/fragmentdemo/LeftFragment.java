package com.example.fragmentdemo;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LeftFragment extends Fragment implements OnItemClickListener{
	private String data[] = new String[]{
			"sf"
			,"sb"
			,"jugg"
			,"Medusa"
			,"Windrunner"
			,"Zues"
	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.left_fragment, null);
		ListView listV = (ListView) view.findViewById(R.id.listV);
		ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity()
				, android.R.layout.simple_list_item_activated_1
				,data);
		listV.setAdapter(adapter);
		//设置单选模式
		listV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		listV.setOnItemClickListener(this);
		return view;
	}
	
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		try {
			TextView tv = (TextView) getActivity().findViewById(R.id.detail);
			InputStream is = getActivity().getResources().getAssets().open("m"+position);
			byte [] buffer = new byte [1024];
			int count = is.read(buffer);
			String detail = new String(buffer,0,count,"utf-8");
			System.out.println(detail);
			if(tv==null){
				Intent intent = new Intent(getActivity(),DetailActivity.class);
				intent.putExtra("detail", detail);
				startActivity(intent);
			} else {
				tv.setText(detail);
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
