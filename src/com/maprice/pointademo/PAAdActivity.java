package com.maprice.pointademo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.pointa.*;

public class PAAdActivity extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.blank_activity);
		
		RelativeLayout RL = (RelativeLayout)findViewById(R.id.rel_layout);
		
		PointA.init();
		PointA.ads().showAd(RL, this);
	}
}
