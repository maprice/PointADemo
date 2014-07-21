package com.maprice.pointademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.pointa.*;

public class PAAdActivity extends Activity{

	Button mButton;
	RelativeLayout rel_layout;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.blank_activity);


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
