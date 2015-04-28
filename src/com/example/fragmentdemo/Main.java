package com.example.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Button btn  =(Button) findViewById(R.id.btn);
		Button send  =(Button) findViewById(R.id.send);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				FragmentManager manager = getFragmentManager();
				FragmentTransaction mtTransaction = manager.beginTransaction();
				UIFragment f = new UIFragment();
				mtTransaction.add(
						R.id.frame 			//添加到的容器  
						, f					//添加的fragment
						,"ui_fragment");    //别名
				mtTransaction.commit();
			}
		});
		send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				FragmentManager manager = getFragmentManager();
				FragmentTransaction mtTransaction = manager.beginTransaction();
				DataFragment f = new DataFragment();
				Bundle b = new Bundle();
				b.putString("sf", "ur sour is mine!!!!"+
				"setArguments()必须在onattr（）前调用!!");
				f.setArguments(b);
				mtTransaction.add(
						R.id.data_frame 			//添加到的容器  
						, f					//添加的fragment
						,"data_fragment");    //别名
				mtTransaction.commit();
				Toast.makeText(Main.this, "发送数据给fragment", 0).show();
			}
		});
		
	}
}
