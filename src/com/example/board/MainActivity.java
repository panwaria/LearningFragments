package com.example.board;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onButtonClick(View v)
	{
		FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment_two);
		
		switch(v.getId())
		{
		case R.id.btn_one_create_new:
			
			if (fragmentTwo == null)	// PHONE!
			{
				// Need to launch another activity
				Intent i = new Intent(this, DrawingActivity.class);
				startActivity(i);
			}
			else	// TABLET!
			{
				// Let's do nothing right now, and just show up a toast.
				Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT).show();
			}
			
			break;
			
		case R.id.btn_one_open_existing:
			
			Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT).show();
			
			break;
			
		default:
		}
	}
}
