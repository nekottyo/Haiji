package com.example.haiji;

import com.example.haiji.R.id;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	public SoundPool sp;
	int sound_id1;
	int sound_id2;
	int sound_id3;
	int sound_id4;
	int sound_id5;
	int sound_id6;
	int sound_id7;
	int sound_id8;
	int sound_id9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		Button button1 = (Button) findViewById(id.button1);
		Button button2 = (Button) findViewById(id.button2);
		Button button3 = (Button) findViewById(id.button3);
		Button button4 = (Button) findViewById(id.button4);
		Button button5 = (Button) findViewById(id.button5);
		Button button6 = (Button) findViewById(id.button6);
		
		sound_id1 = sp.load(this, R.raw.himawari, 1);
		sound_id2 = sp.load(this, R.raw.tulip, 1);
		sound_id3 = sp.load(this, R.raw.teinenpitte, 1);
		sound_id4 = sp.load(this, R.raw.yamaga, 1);
		sound_id5 = sp.load(this, R.raw.oreyamayakara, 1);
		sound_id6 = sp.load(this, R.raw.yamasennkou, 1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp.play(sound_id1, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp.play(sound_id2, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp.play(sound_id3, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp.play(sound_id4, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp.play(sound_id5, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp.play(sound_id6, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onPause() {
		sp.release();
	}

}
