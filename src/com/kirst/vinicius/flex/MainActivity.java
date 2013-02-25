package com.kirst.vinicius.flex;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnCalculate = (Button) findViewById(R.id.button1);
		btnCalculate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView result = (TextView) findViewById(R.id.textViewResult);
				
				EditText editTextAlcohol = (EditText) findViewById(R.id.editTextAlcohol);
				EditText editTextGas = (EditText) findViewById(R.id.editTextGas);
				
				Editable strAlcohol = editTextAlcohol.getText();
				Editable strGas = editTextGas.getText();
				
				double alcoholVal = Double.parseDouble(strAlcohol.toString());
				double gasVal = Double.parseDouble(strGas.toString());
				
				if (alcoholVal / gasVal <= 0.7) {
					result.setText(R.string.alcohol);
				} else {
					result.setText(R.string.gas);
				}
				
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
