package com.example.surfaceviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

public class MainActivity extends Activity {

	private static final String TAG = "SurfaceViewExample";
	/** Called when the activity is first created. */
	private Display mDisplay;
	public static int deviceWidth, deviceHeight;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SView(getApplicationContext()));
		mDisplay = ((WindowManager) getSystemService(WINDOW_SERVICE))
				.getDefaultDisplay();

		deviceHeight = mDisplay.getHeight();
		deviceWidth = mDisplay.getWidth();

		Log.d(TAG, "W // " + deviceWidth + "   H // " + deviceHeight);
	}
}
