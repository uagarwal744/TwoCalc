package com.learningandroid.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.GetChars;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	String val1, val2;
	double one, two, total;
	EditText var1, var2;
	Button add, sub, mul, div, mod, pow, bc1, bc2, swap, gcd, lcm, clear;
	TextView display;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		total=0;
		add=(Button) findViewById(R.id.bAdd);
		sub=(Button) findViewById(R.id.bSub);
		mul=(Button) findViewById(R.id.bMul);
		div=(Button) findViewById(R.id.bDiv);
		mod=(Button) findViewById(R.id.bMod);
		pow=(Button) findViewById(R.id.bPow);
		bc1=(Button) findViewById(R.id.bC1);
		bc2=(Button) findViewById(R.id.bC2);
		swap=(Button) findViewById(R.id.bSwap);
		gcd=(Button) findViewById(R.id.bGcd);
		lcm=(Button) findViewById(R.id.bLcm);
		clear=(Button) findViewById(R.id.bClear);
		


		display= (TextView) findViewById(R.id.tvDisplay);

		
		clear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				total=0;
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				var1.setText("0");
				var2.setText("0");
				
				display.setText(""+total+"");
			}
		});
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				total=one+two;
				display.setText(""+total+"");
			}
		});
		sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				total=one-two;
				display.setText(""+total+"");
			}
		});
		mul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				total=one*two;
				display.setText(""+total+"");
			}
		});
		div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				total=one/two;
				display.setText(""+total+"");
			}
		});
		mod.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				total=one%two;
				display.setText(""+total+"");
			}
		});
		pow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				total=java.lang.Math.pow(one,two);
				display.setText(""+total+"");
			}
		});
		bc1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=display.getText().toString();

				var1.setText(val1);
			}
		});
		bc2.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val2=display.getText().toString();

				var2.setText(val2);
			}
		});
		swap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();				
				
				var1.setText(val2);
				var2.setText(val1);
			}
		});
		gcd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				total=gcd(one,two);
				display.setText(""+total+"");
			}
		});
		lcm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				var1 = (EditText) findViewById(R.id.var1);
				var2 = (EditText) findViewById(R.id.var2);
				
				val1=var1.getText().toString();
				val2=var2.getText().toString();
				
				one=Double.valueOf(val1);
				two=Double.valueOf(val2);
				
				int one1=(int) one;
				int two1=(int) two;
				
				total=one1*two1/gcd(one,two);
				
				display.setText(""+total+"");
			}
		});
		
	}

	public int gcd(double one2, double two2) {
		// TODO Auto-generated method stub
		int one=(int) one2;
		int two=(int) two2;
		int temp;
		if(one<two) {temp=one; one=two; two=temp;}
		while(one%two!=0)
		{
			temp=two;
			two=one%two;
			one=temp;
		}
			
		
		return two;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
