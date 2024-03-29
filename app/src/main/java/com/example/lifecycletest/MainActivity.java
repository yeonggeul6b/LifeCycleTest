package com.example.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
	Button nextBtn;
	String tag = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.d(tag, "onCreate()");

		nextBtn = findViewById(R.id.nextBtn);

		nextBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

				startActivity(intent);
			}
		});
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

		Log.d(tag, "onDestory()");
	}
}
