package com.amr.amrxo;

import com.amr.amrxo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {
	static String bc="default", lc="black", oM="black", xM="black";
	Button start, options, help, about;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		start = (Button) findViewById(R.id.bStart);
		options = (Button) findViewById(R.id.bOptions);
		help = (Button) findViewById(R.id.bHelp);
		about = (Button) findViewById(R.id.bAbout);

		start.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent("com.amr.amrxo.STARTINGPOINT");
				startActivity(intent);
			}
		});

		options.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent("com.amr.amrxo.OPTIONS");
				startActivity(intent);
			}
		});

		help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent("com.amr.amrxo.HELP");
				startActivity(intent);
			}
		});

		about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent("com.amr.amrxo.ABOUT");
				startActivity(intent);
			}
		});
	}

	

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Splash.ourSong.release();
	}

	
	

	
	
}
