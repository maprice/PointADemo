package com.maprice.pointademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.pointa.PointA;

public class PARatingActivity extends Activity{
	
	LinearLayout lin_layout;
	Button b;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linear_layout);
		lin_layout = (LinearLayout)findViewById(R.id.linear_layout);
			b = new Button(this);
			b.setText("Rate my App!");
			
			b.setOnClickListener(new View.OnClickListener(){
	             public void onClick(View v) {
	            	PointA.rating().RateMyApp(PARatingActivity.this);
	             }
			});
			lin_layout.addView(b);
		}
	}
