package com.maprice.pointademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PAAnalyticsActivity extends Activity{
	
	LinearLayout lin_layout;
	Button b;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linear_layout);
		
		lin_layout = (LinearLayout)findViewById(R.id.linear_layout);
		
		for (int i = 1; i <= 3; i++){
			b = new Button(this);
			b.setText("Button " + i);
			b.setId(i);
			b.setOnClickListener(new View.OnClickListener(){
	             public void onClick(View v) {
	            	 String msg = "Button " + v.getId() + " Pressed";
	            	 Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show(); 
	             }
	        });
			lin_layout.addView(b);
		}
	}
}
