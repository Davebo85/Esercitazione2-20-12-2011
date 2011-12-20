package com.dueactivityv2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		TextView label = (TextView) findViewById(R.id.textview1);
		String iltestoricevuto = getIntent().getExtras().getString("iltestonelbox");
		label.setText(iltestoricevuto);
		
		Log.d("NEW METODI","onCreate " + iltestoricevuto);
		
	}

	public void onStart() {
		super.onStart();
		
		Log.d("NEW METODI","onStart");
	}

	public void onReStart() {
		super.onRestart();

		Log.d("NEW METODI","onReStart");
	}

	public void onResume() {
		super.onResume();
		
		Log.d("NEW METODI","onResume");
	}

	public void onPause() {
		super.onPause();

		Log.d("NEW METODI","onPause");
	}

	public void onStop() {
		super.onStop();
		
		Log.d("NEW METODI","onStop");
	}

	public void onDestroy() {
		super.onDestroy();
		
		Log.d("NEW METODI","onDestroy");
	}
}