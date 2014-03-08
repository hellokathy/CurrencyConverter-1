package csps.currency.converter;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.PixelFormat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText usd;
	EditText inr;
	EditText gbp;
	EditText eur;
	TextView warning;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		usd = (EditText) findViewById(R.id.editText1);
		inr = (EditText) findViewById(R.id.editText2);
		gbp = (EditText) findViewById(R.id.editText3);
		eur = (EditText) findViewById(R.id.editText4);
		warning = (TextView) findViewById(R.id.textView5);

		usd.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {

				System.out.println(usd.getText().toString());

				try {

					if (usd.getText().toString().equals("")) {
						double valUsd = 0;
					}

					else {
						double valUsd = 0;
						warning.setText("Please Enter Value in USD");
						valUsd = Double.parseDouble(usd.getText().toString());
						// double valUsd = 50.00;

						DecimalFormat round = new DecimalFormat("###.##");

						inr.setText(Double.valueOf(
								round.format((valUsd * 68.19))).toString());
						gbp.setText(Double.valueOf(
								round.format((valUsd * 1.64))).toString());
						eur.setText(Double.valueOf(
								round.format((valUsd * 1.36))).toString());
					}
				} catch (NumberFormatException e) {
					System.out.println("You've entered wrong number");
					warning.setText("Incorrect Format");
				}
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub

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
