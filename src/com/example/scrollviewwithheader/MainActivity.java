package com.example.scrollviewwithheader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.scrollviewwithheader.custom.ScrollViewWithHeader;

public class MainActivity extends Activity {

	private ScrollViewWithHeader scrollView;
	private TextView tvHeader;
	private TextView tvChild1;
	private TextView tvChild2;
	private TextView tvChild3;
	private TextView tvChild4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		init();
	}

	private void init() {
		initViews();
		initScrollView();
	}

	
	/**
	 * Adding ScrollView Header and child header
	 */
	private void initScrollView() {
		scrollView.addHeader(tvHeader);
		scrollView.addChildHeaders(tvChild1);
		scrollView.addChildHeaders(tvChild2);
		scrollView.addChildHeaders(tvChild3);
		scrollView.addChildHeaders(tvChild4);
		scrollView.build();
	}

	private void initViews() {
		scrollView = (ScrollViewWithHeader) findViewById(R.id.scroll_view);
		tvHeader = (TextView) findViewById(R.id.tv_header);
		tvChild1 = (TextView) findViewById(R.id.child1);
		tvChild2 = (TextView) findViewById(R.id.child2);
		tvChild3 = (TextView) findViewById(R.id.child3);
		tvChild4 = (TextView) findViewById(R.id.child4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
