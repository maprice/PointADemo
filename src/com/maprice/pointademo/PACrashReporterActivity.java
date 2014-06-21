package com.maprice.pointademo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.pointa.PointA;

public class PACrashReporterActivity extends ListActivity {

	static final String[] LIST_ITEMS = new String[] { "Null pointer", "Array out of bounds"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_pa,LIST_ITEMS));

		ListView listView = getListView();
		listView.setTextFilterEnabled(true);

		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				if(((TextView) view).getText().equals("Null pointer")){
					String x = null;
					x.toUpperCase();
				}
				else if(((TextView) view).getText().equals("Array out of bounds")){
					int x[] = new int[0];
					int y = x[1];
				}
			}
		});

	}

}
