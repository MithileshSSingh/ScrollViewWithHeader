package com.example.scrollviewwithheader.custom;

import java.util.ArrayList;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollViewWithHeader extends ScrollView implements
		OnScrollChangedListener {

	private Context mContext;
	private ArrayList<View> headerList;
	private TextView tvHeader;

	public ScrollViewWithHeader(Context context, AttributeSet attribute) {
		super(context, attribute);
		this.mContext = context;
		headerList = new ArrayList<View>();
	}

	public void build() {
		init();
	}

	private void init() {
		initListener();
	}

	private void initListener() {
		getViewTreeObserver().addOnScrollChangedListener(this);
	}

	public void addChildHeaders(View v) {
		headerList.add(v);
	}

	public void addHeader(TextView v) {
		this.tvHeader = v;
	}

	@Override
	public void onScrollChanged() {
		int position[] = new int[2];
		tvHeader.getLocationOnScreen(position);
		int tvHeaderY = position[1];
		tvHeader.setVisibility(View.GONE);
		if (headerList != null & headerList.size() > 0) {
			for (View v : headerList) {

				String header = (String) ((TextView) v).getText();
				v.getLocationOnScreen(position);
				if (position[1] <= tvHeaderY) {
					tvHeader.setVisibility(View.VISIBLE);
					tvHeader.setText(header);
				}

			}
		}
	}

}
