package com.amr.amrxo;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Options extends Activity {

	Spinner backColor, lineColor, xMarker, oMarker;
	Button apply, cancel;
	ToggleButton sound;
	SharedPreferences saving;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);

		backColor = (Spinner) findViewById(R.id.spinner1);
		lineColor = (Spinner) findViewById(R.id.spinner2);
		oMarker = (Spinner) findViewById(R.id.spinner3);
		xMarker = (Spinner) findViewById(R.id.spinner4);
		sound=(ToggleButton) findViewById(R.id.toggleButtonSound);

		
		apply = (Button) findViewById(R.id.bApply);
		cancel = (Button) findViewById(R.id.bCancel);

		saving = getSharedPreferences(StartingPoint.fileName, 0);

		sound.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(sound.isChecked()==true){
					Splash.ourSong.start();
				}else{
					Splash.ourSong.pause();
				}
			}
		});
		
		apply.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (!backColor.getSelectedItem().equals("default")
						&& (backColor.getSelectedItem().equals(
								xMarker.getSelectedItem()) || backColor
								.getSelectedItem().equals(
										oMarker.getSelectedItem()))) {

					Toast.makeText(
							Options.this,
							"Background color can't be similar to X or O Markers",
							Toast.LENGTH_SHORT).show();
				} else if (!backColor.getSelectedItem().equals("default")
						&& (backColor.getSelectedItem().equals(lineColor
								.getSelectedItem()))) {
					Toast.makeText(Options.this,
							"Background color can't be similar to Line color",
							Toast.LENGTH_SHORT).show();
				} else {
					Menu.bc = (String) backColor.getSelectedItem();
					Menu.lc = (String) lineColor.getSelectedItem();
					Menu.xM = (String) xMarker.getSelectedItem();
					Menu.oM = (String) oMarker.getSelectedItem();

					SharedPreferences.Editor editor = saving.edit();
					
					editor.putInt("bc",  backColor.getSelectedItemPosition());
					editor.putInt("lc", lineColor.getSelectedItemPosition());
					editor.putInt("xc", xMarker.getSelectedItemPosition());
					editor.putInt("oc", oMarker.getSelectedItemPosition());
					
				
					editor.commit();
					Options.this.finish();
				}
			}
		});

		cancel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Options.this.finish();
			}
		});

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		SharedPreferences.Editor editor = saving.edit();
		
		editor.putBoolean("sound", sound.isChecked());
		editor.commit();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		if(Splash.ourSong.isPlaying()){
			sound.setChecked(true);
		}else{
			sound.setChecked(false);
		}
		saving = getSharedPreferences(StartingPoint.fileName, 0);
		
		backColor.setSelection(saving.getInt("bc", 0));
		lineColor.setSelection(saving.getInt("lc", 0));
		xMarker.setSelection(saving.getInt("xc", 0));
		oMarker.setSelection(saving.getInt("oc", 0));
		
		
	}
}
