package com.example.fragmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		TextView tv = (TextView) findViewById(R.id.detail);	
		String detail = getIntent().getStringExtra("detail");
		tv.setText(detail);
	}
}
