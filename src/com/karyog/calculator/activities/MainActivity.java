package com.karyog.calculator.activities;

import com.karyog.calculator.Calculator;
import com.karyog.calculator.activities.R;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	Calculator calc;

	@SuppressWarnings("deprecation")
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Display display = getWindowManager().getDefaultDisplay();
		Point size = new Point();

		try {
			display.getSize(size);
		} catch (java.lang.NoSuchMethodError ignore) { // Older device
			size.x = display.getWidth();
			size.y = display.getHeight();
		}

		int screen_width = size.x;
		int screen_height = size.y;

		// Prepare screen based on width and height of the display
		prepare_screen_default(screen_width, screen_height);

		calc = new Calculator();
	}

	@SuppressLint("InflateParams")
	private void prepare_screen_default(int screen_width, int screen_height) {
		LayoutInflater li = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		RelativeLayout v = (RelativeLayout) li.inflate(R.layout.activity_main,
				null);

		// Divide the space equally for the controls
		// width has the be divided into 5 as there are 5 columns.
		// height has to be diveded by 7.5 -> 6 for buttons, 1 for the display,
		// and .5 for the mini display that keeps track of operation sequence
		// equals symbol will have twice the height, zero will have twice the
		// width
		int width = screen_width;
		int height = screen_height - (screen_height % 15);

		System.out.println("width = " + width + " " + "height = " + height);

		TextView textView = (TextView) v.findViewById(R.id.display_result);
		textView.setMinHeight(height / 15 * 2 + (screen_height % 15));

		TextView textViewMini = (TextView) v
				.findViewById(R.id.display_result_mini);

		// this is mini display. actually height should be divided by 15
		// (7.5 * 2). but for whatever reasons the display of the last row is
		// not proper. adjustment is done here by reducing the height.
		
		textViewMini.setMinHeight(height / 30);

		Button zero = (Button) v.findViewById(R.id.zero);
		zero.setMinWidth(width / 5 * 2);
		zero.setMinHeight(height / 15 * 2);
		Button one = (Button) v.findViewById(R.id.one);
		one.setMinWidth(width / 5);
		one.setMinHeight(height / 15 * 2);
		Button two = (Button) v.findViewById(R.id.two);
		two.setMinWidth(width / 5);
		two.setMinHeight(height / 15 * 2);
		Button three = (Button) v.findViewById(R.id.three);
		three.setMinWidth(width / 5);
		three.setMinHeight(height / 15 * 2);
		Button four = (Button) v.findViewById(R.id.four);
		four.setMinWidth(width / 5);
		four.setMinHeight(height / 15 * 2);
		Button five = (Button) v.findViewById(R.id.five);
		five.setMinWidth(width / 5);
		five.setMinHeight(height / 15 * 2);
		Button six = (Button) v.findViewById(R.id.six);
		six.setMinWidth(width / 5);
		six.setMinHeight(height / 15 * 2);
		Button seven = (Button) v.findViewById(R.id.seven);
		seven.setMinWidth(width / 5);
		seven.setMinHeight(height / 15 * 2);
		Button eight = (Button) v.findViewById(R.id.eight);
		eight.setMinWidth(width / 5);
		eight.setMinHeight(height / 15 * 2);
		Button nine = (Button) v.findViewById(R.id.nine);
		nine.setMinWidth(width / 5);
		nine.setMinHeight(height / 15 * 2);
		Button Multiply = (Button) v.findViewById(R.id.Multiply);
		Multiply.setMinWidth(width / 5);
		Multiply.setMinHeight(height / 15 * 2);
		Button Divide = (Button) v.findViewById(R.id.Divide);
		Divide.setMinWidth(width / 5);
		Divide.setMinHeight(height / 15 * 2);
		Button Subtract = (Button) v.findViewById(R.id.Subtract);
		Subtract.setMinWidth(width / 5);
		Subtract.setMinHeight(height / 15 * 2);
		Button Add = (Button) v.findViewById(R.id.Add);
		Add.setMinWidth(width / 5);
		Add.setMinHeight(height / 15 * 2);
		Button Equals = (Button) v.findViewById(R.id.Equals);
		Equals.setMinWidth(width / 5);
		Equals.setMinHeight(height / 15 * 4);
		Button MC = (Button) v.findViewById(R.id.MC);
		MC.setMinWidth(width / 5);
		MC.setMinHeight(height / 15 * 2);
		Button MR = (Button) v.findViewById(R.id.MR);
		MR.setMinWidth(width / 5);
		MR.setMinHeight(height / 15 * 2);
		Button MS = (Button) v.findViewById(R.id.MS);
		MS.setMinWidth(width / 5);
		MS.setMinHeight(height / 15 * 2);
		Button MPlus = (Button) v.findViewById(R.id.MPlus);
		MPlus.setMinWidth(width / 5);
		MPlus.setMinHeight(height / 15 * 2);
		Button MMinus = (Button) v.findViewById(R.id.MMinus);
		MMinus.setMinWidth(width / 5);
		MMinus.setMinHeight(height / 15 * 2);
		Button BackSpace = (Button) v.findViewById(R.id.BackSpace);
		BackSpace.setMinWidth(width / 5);
		BackSpace.setMinHeight(height / 15 * 2);
		Button CE = (Button) v.findViewById(R.id.CE);
		CE.setMinWidth(width / 5);
		CE.setMinHeight(height / 15 * 2);
		Button Clear = (Button) v.findViewById(R.id.C);
		Clear.setMinWidth(width / 5);
		Clear.setMinHeight(height / 15 * 2);
		Button PlusMinus = (Button) v.findViewById(R.id.PlusMinus);
		PlusMinus.setMinWidth(width / 5);
		PlusMinus.setMinHeight(height / 15 * 2);
		Button Root = (Button) v.findViewById(R.id.Root);
		Root.setMinWidth(width / 5);
		Root.setMinHeight(height / 15 * 2);
		Button Mod = (Button) v.findViewById(R.id.Mod);
		Mod.setMinWidth(width / 5);
		Mod.setMinHeight(height / 15 * 2);
		Button OneByX = (Button) v.findViewById(R.id.OneByX);
		OneByX.setMinWidth(width / 5);
		OneByX.setMinHeight(height / 15 * 2);
		Button DecimalSeparator = (Button) v
				.findViewById(R.id.decimal_separator);
		DecimalSeparator.setMinWidth(width / 5);
		DecimalSeparator.setMinHeight(height / 15 * 2);

		setContentView(v);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void buttonClick(View v) {
		Button button = (Button) findViewById(v.getId());
		String button_text = (String) button.getText();
		calc.calculate(button_text);

		TextView textView = (TextView) findViewById(R.id.display_result);
		TextView textViewMini = (TextView) findViewById(R.id.display_result_mini);

		textView.setText(calc.getFinalDisplayText());
		textViewMini.setText(calc.getFinalDisplayMiniText());
	}

}