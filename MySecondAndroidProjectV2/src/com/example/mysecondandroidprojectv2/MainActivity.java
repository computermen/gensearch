package com.example.mysecondandroidprojectv2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.webkit.WebView;

public class MainActivity extends Activity {
	TextView textView;
	CheckBox pepBox, cheeseBox;
	WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		pepBox = (CheckBox) findViewById(R.id.checkBox1);
		cheeseBox = (CheckBox) findViewById(R.id.checkBox2);
		textView = (TextView) findViewById(R.id.textView2);
		webView = (WebView) findViewById(R.id.webView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onButton1Click(View view) {
		StringBuilder str = new StringBuilder("");
		if (pepBox.isChecked()) {
			str.append("Pepperoni");
		} 
		if (cheeseBox.isChecked()) {
			str.append("\"Extra cheese\"");
		}
		if (str.length() == 23) {
			str.insert(9, '+');
		}
		if (str.length() == 0) {
			str.append("Plain");
		}
		textView.setText(str);
		webView.loadUrl("http://www.google.com/search?q="+str.toString());
	}

}
