package com.maprice.pointademo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pointa.PointA;

public class PATwitterActivity extends Activity {
	// Constants
	
	// Login button
	Button btnLoginTwitter;
	// Update status button
	Button btnUpdateStatus;
	// Logout button
	Button btnLogoutTwitter;
	// EditText for update
	EditText txtUpdate;
	// lbl update
	TextView lblUpdate;
	TextView lblUserName;

	// Progress dialog
	ProgressDialog pDialog;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twitter_layout);
		
		// All UI elements
		btnLoginTwitter = (Button) findViewById(R.id.btnLoginTwitter);
		btnUpdateStatus = (Button) findViewById(R.id.btnUpdateStatus);
		btnLogoutTwitter = (Button) findViewById(R.id.btnLogoutTwitter);
		txtUpdate = (EditText) findViewById(R.id.txtUpdateStatus);
		lblUpdate = (TextView) findViewById(R.id.lblUpdate);
		lblUserName = (TextView) findViewById(R.id.lblUserName);

		/**
		 * Twitter login button click event will call loginToTwitter() function
		 * */
		btnLoginTwitter.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// Call login twitter function
				PointA.twitter().loginToTwitter(PATwitterActivity.this);
			}
		});

		/**
		 * Button click event to Update Status, will call updateTwitterStatus()
		 * function
		 * */
		btnUpdateStatus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				PointA.twitter().postTweet("Sent from PointA: " + txtUpdate.getText().toString());

			}
		});

		/**
		 * Button click event for logout from twitter
		 * */
		btnLogoutTwitter.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// Call logout twitter function
				PointA.twitter().logoutFromTwitter();
			}
		});
		PointA.twitter().onCreate(this);

		btnLoginTwitter.setVisibility(View.VISIBLE);

		// Show Update Twitter
		lblUpdate.setVisibility(View.VISIBLE);
		txtUpdate.setVisibility(View.VISIBLE);
		btnUpdateStatus.setVisibility(View.VISIBLE);
		btnLogoutTwitter.setVisibility(View.VISIBLE);
		
	}
 

}