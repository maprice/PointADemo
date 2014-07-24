package com.maprice.pointademo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.pointa.PointA;

public class PAActivity extends ListActivity {
	 
	static final String[] LIST_ITEMS = new String[] { "Ads", "Analytics", "Billing", "Cloud", "Crash", "Facebook", "Rating"};
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		PointA.init(this.getApplication());
		
		//PointA.push().setDefaultPushCallback(this, PAActivity.class);
		
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_pa, LIST_ITEMS));
 
		ListView listView = getListView();
		listView.setTextFilterEnabled(true);
 
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				
				if(((TextView) view).getText().equals("Crash")){
					Intent intent = new Intent(PAActivity.this, PACrashReporterActivity.class);
					PAActivity.this.startActivity(intent);
				}
				else if(((TextView) view).getText().equals("Analytics")){
					Intent intent = new Intent(PAActivity.this, PAAnalyticsActivity.class);
					PAActivity.this.startActivity(intent);
				}
				else if(((TextView) view).getText().equals("Ads")){
					Intent intent = new Intent(PAActivity.this, PAAdActivity.class);
					PAActivity.this.startActivity(intent);
				}
				else if(((TextView) view).getText().equals("Rating")){
					Intent intent = new Intent(PAActivity.this, PARatingActivity.class);
					PAActivity.this.startActivity(intent);
				}
				else{
				
			    // When clicked, show a toast with the TextView text
			    Toast.makeText(getApplicationContext(),
				((TextView) view).getText(), Toast.LENGTH_SHORT).show();
				}
			    
			    
			    
			}
		});
 
	}
 
}
