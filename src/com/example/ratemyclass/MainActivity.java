package com.example.ratemyclass;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.Loader.ForceLoadContentObserver;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button button1;
	private Button button2;
	private Button button3;
	int cont;
	Bundle extras = getIntent().getExtras();
	//realmente precisa dessa chave?
	{
	if(extras==null){
		cont=0;
	}else{
		cont=extras.getInt("contador", 0);
	}
	}
	//realmente precisa dessa chave?
	String[][] perguntas = new String[7][2];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String pergunta = perguntas[cont][0];
		setContentView(R.layout.activity_main);
		TextView shownQ = (TextView)findViewById(R.id.textView2);
		shownQ.setText(pergunta); 
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				perguntas[cont][1] = "1";
				cont++;
				Intent intent = new Intent(MainActivity.this, MainActivity.class);
				intent.putExtra("contador", cont);
				startActivity(intent);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				perguntas[cont][1]="2";
				cont++;
				Intent intent = new Intent(MainActivity.this, MainActivity.class);
				intent.putExtra("contador", cont);
				startActivity(intent);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				perguntas[cont][1]="3";
				cont++;
				Intent intent = new Intent(MainActivity.this, MainActivity.class);
				intent.putExtra("contador", cont);
				startActivity(intent);
			}
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
