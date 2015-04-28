package com.example.fragmentdemo;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DataFragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		container.setBackgroundColor(Color.GRAY);
		View view = inflater.inflate(R.layout.data_fragment, container,false);
		Button  show = (Button) view.findViewById(R.id.show);
		show.setBackgroundColor(Color.BLUE);
		final TextView tv = (TextView) view.findViewById(R.id.tv_show);
		show.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String str = getArguments().getString("sf");
				tv.setTextColor(Color.RED);
				tv.setText(str==null?"null":str);
			}
		});
		return view;
	}
}
