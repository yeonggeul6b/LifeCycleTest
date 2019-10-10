package com.example.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
	Button backBtn;
	String tag = "Main2Activity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);

		Log.d(tag, "onCreate()");

		backBtn = findViewById(R.id.backBtn);

		backBtn.setOnClickListener(this);
	}

	public void onClick(View view) {
		finish();
	}

	@Override
	protected void onStart() {
		super.onStart();

		Log.d(tag, "onStart()");
	}

	@Override
	protected void onResume() {
		super.onResume();

		Log.d(tag, "onResume()");
	}

	@Override
	protected void onPause() {
		super.onPause();

		Log.d(tag, "onPause()");
	}

	@Override
	protected void onStop() {
		super.onStop();

		Log.d(tag, "onStop()");
	}

	@Override
	protected void onRestart() {
		super.onRestart();

		Log.d(tag, "onRestart()");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		Log.d(tag, "onDestroy()");
	}
}
