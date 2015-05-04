package com.amr.amrxo;

import java.util.Timer;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	/**
	 * @param args
	 */
	static MediaPlayer ourSong;

	SharedPreferences saving;

	@Override
	protected void onCreate(Bundle makingBackgroud) {
		// TODO Auto-generated method stub
		super.onCreate(makingBackgroud);
		setContentView(R.layout.splash);

		saving = getSharedPreferences(StartingPoint.fileName, 0);
		ourSong = MediaPlayer.create(Splash.this, R.raw.bluetonic_world);
		saving = getSharedPreferences(StartingPoint.fileName, 0);
		if (saving.getBoolean("sound", true) == true) {
			ourSong.start();
		}
		ourSong.setLooping(true);
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					if (!Splash.this.isFinishing()) {
						Intent openMainActivity = new Intent(
								"com.amr.amrxo.MENU");
						startActivity(openMainActivity);
					}
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

		finish();
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		ourSong.release();
		finish();

	}

}
