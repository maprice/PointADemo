package com.maprice.pointademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.pointa.*;

public class PAAdActivity extends Activity{
	
	RelativeLayout rel_layout;
	Button showBanner;
	Button hideBanner;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.blank_activity);
		rel_layout = (RelativeLayout)findViewById(R.id.rel_layout);
		
		showBanner = new Button(this);
		showBanner.setText("Show Banner Ad");
		showBanner.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				PointA.ads().showBannerAd(rel_layout, PAAdActivity.this);
			}
		});
		
		hideBanner = new Button(this);
		hideBanner.setText("Hide Banner Ad");
		hideBanner.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				PointA.ads().hideBannerAd(rel_layout);
			}
		});
		
		rel_layout.addView(showBanner);
		rel_layout.addView(hideBanner);
	}
}
