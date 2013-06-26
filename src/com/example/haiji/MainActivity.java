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
	public SoundPool sp1;
	public SoundPool sp2;
	public SoundPool sp3;
	public SoundPool sp4;
	public SoundPool sp5;
	public SoundPool sp6;
	public SoundPool sp7;
	public SoundPool sp8;
	public SoundPool sp9;
	public SoundPool sp10;
	public SoundPool sp11;
	public SoundPool sp12;
	public SoundPool sp13;
	public SoundPool sp14;
	public SoundPool sp15;
	public SoundPool sp16;
	
	int sound_id1;
	int sound_id2;
	int sound_id3;
	int sound_id4;
	int sound_id5;
	int sound_id6;
	int sound_id7;
	int sound_id8;
	int sound_id9;
	int sound_id10;
	int sound_id11;
	int sound_id12;
	int sound_id13;
	int sound_id14;
	int sound_id15;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp1 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp2 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp3 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp4 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp5 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp6 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp7 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp8 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp9 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp10 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp11 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp12 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp13 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp14 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		sp15 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		
		Button button1 = (Button) findViewById(id.button1);
		Button button2 = (Button) findViewById(id.button2);
		Button button3 = (Button) findViewById(id.button3);
		Button button4 = (Button) findViewById(id.button4);
		Button button5 = (Button) findViewById(id.button5);
		Button button6 = (Button) findViewById(id.button6);
		Button button7 = (Button) findViewById(id.button7);
		Button button8 = (Button) findViewById(id.button8);
		Button button9 = (Button) findViewById(id.button9);
		Button button10 = (Button) findViewById(id.button10);
		Button button11 = (Button) findViewById(id.button11);
		Button button12 = (Button) findViewById(id.button12);
		Button button13 = (Button) findViewById(id.button13);
		Button button14 = (Button) findViewById(id.button14);
		Button button15 = (Button) findViewById(id.button15);
		
		sound_id1 = sp1.load(this, R.raw.himawari, 1);
		sound_id2 = sp2.load(this, R.raw.tulip, 1);
		sound_id3 = sp3.load(this, R.raw.teinenpitte, 1);
		sound_id4 = sp4.load(this, R.raw.yamaga, 1);
		sound_id5 = sp5.load(this, R.raw.oreyamayakara, 1);
		sound_id6 = sp6.load(this, R.raw.yamasennkou, 1);
		sound_id7 = sp7.load(this, R.raw.syugo, 1);
		sound_id8 = sp8.load(this, R.raw.tunjaku, 1);
		sound_id9 = sp9.load(this, R.raw.butterfly, 1);
		sound_id10 = sp10.load(this, R.raw.sausage, 1);	
		sound_id11 = sp11.load(this, R.raw.gakkou, 1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp1.play(sound_id1, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp2.play(sound_id2, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp3.play(sound_id3, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp4.play(sound_id4, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp5.play(sound_id5, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp6.play(sound_id6, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp7.play(sound_id7, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp8.play(sound_id8, 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp9.play(sound_id9 , 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp9.play(sound_id10 , 1.0F, 1.0F, 0, 0, 1.0F);
			}
		});
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp9.play(sound_id11 , 1.0F, 1.0F, 0, 0, 1.0F);
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
		// sp.release();
	}

}
