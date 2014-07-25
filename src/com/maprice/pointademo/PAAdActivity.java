package com.maprice.pointademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.pointa.PointA;

public class PAAdActivity extends Activity{

	Button mButton;
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
		
		//rel_layout.addView(showBanner);
		//rel_layout.addView(hideBanner);


		PointA.ads().precacheInterstitialAd(this);
		rel_layout = (RelativeLayout)findViewById(R.id.rel_layout);


		PointA.ads().showBannerAd(rel_layout, this);


		mButton = new Button(this);
		mButton.setText("Show interstitial");

		mButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				PointA.ads().showInterstitialAd(PAAdActivity.this);
			}
		});
		rel_layout.addView(mButton);


	}
}
