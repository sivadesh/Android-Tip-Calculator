package codepath.apps.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {
	private double tipValue = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		setText(tipValue);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}
	
	public void calcTip(View view)	{
		double billValue = Double.valueOf(((EditText)findViewById(R.id.billAmount)).getText().toString());
		switch(view.getId()) {
		case R.id.ten:
			tipValue = 0.1 * billValue;
			break;
		case R.id.fifteen:
			tipValue = 0.15 * billValue;
			break;
		case R.id.twenty:
			tipValue = 0.2 * billValue;
			break;
		}
		setText(tipValue);
	}
	
	public void setText(double value) {
		TextView tip = (TextView)findViewById(R.id.tipValue);
		tip.setText("Tip is: $ "+value);
	}
}
