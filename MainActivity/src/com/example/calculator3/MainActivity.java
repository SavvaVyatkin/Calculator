package com.example.calculator3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	long i = 0;
	long m = 0;
	boolean addition = false;
	boolean subtraction = false;
	boolean multiplication = false;
	boolean division = false;

	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView mTextView = (TextView) findViewById(R.id.textView1);


		final Button equals = (Button) findViewById(R.id.equals);
		equals.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// Perform action on click
				if (addition == true) {
					mTextView.setText(Long.toString(m + i));
				}
				if (subtraction == true) {
					mTextView.setText(Long.toString(m - i));
				}
				if (multiplication == true) {
					mTextView.setText(Long.toString(m * i));
				}
				try {
					if (division == true) {
						mTextView.setText(Long.toString(m / i));
					}
				} catch (ArithmeticException e) {
					mTextView.setText("You can't divide by zero");
				}
			}
				
			});
		final Button one = (Button) findViewById(R.id.one);
		one.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+1;
				mTextView.setText(Long.toString(i));}
				// Perform action on click

			}
		});
		final Button two = (Button) findViewById(R.id.two);
		two.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+2;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button three = (Button) findViewById(R.id.three);
		three.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+3;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button four = (Button) findViewById(R.id.four);
		four.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+4;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button five = (Button) findViewById(R.id.five);
		five.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+5;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button six = (Button) findViewById(R.id.six);
		six.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+6;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button seven = (Button) findViewById(R.id.seven);
		seven.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+7;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button eight = (Button) findViewById(R.id.eight);
		eight.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+8;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button nine = (Button) findViewById(R.id.nine);
		nine.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+9;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
		final Button zero = (Button) findViewById(R.id.zero);
		zero.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (i<1000000){i=i*10;
				i=i+0;
				mTextView.setText(Long.toString(i));}
				// Perform action on click
			}
		});
	final Button clear = (Button) findViewById(R.id.clear);
	clear.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {
			i=0;
			mTextView.setText(Long.toString(i));
			// Perform action on click
		}
	});
	final Button multiply = (Button) findViewById(R.id.multiply);
	multiply.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {
			m = i;
			i=0;
			setOperations(false, false, true, false);
			mTextView.setText(Long.toString(i));
			// Perform action on click
		}
	});
	final Button plus = (Button) findViewById(R.id.plus);
	plus.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {
			m = i;
			i=0;
			setOperations(true, false, false, false);
			mTextView.setText(Long.toString(i));
			// Perform action on click
		}
	});
	final Button minus = (Button) findViewById(R.id.minus);
	minus.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {
			m = i;
			i=0;
			setOperations(false, true, false, false);
			mTextView.setText(Long.toString(i));
			// Perform action on click
		}
	});
	final Button divide = (Button) findViewById(R.id.divide);
	divide.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {
			m = i;
			i=0;
			addition = false;
			subtraction =  false;
			multiplication = false;
			division = true;
			setOperations(false, false, false, true);
			mTextView.setText(Long.toString(i));
			// Perform action on click
		}
		
		


	});
}
	private void setOperations(boolean additionL 
			, boolean subtractionL
			, boolean multiplicationL
			, boolean divisionL
			) {
		addition = additionL;
		subtraction =  subtractionL;
		multiplication = multiplicationL;
		division = divisionL;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
