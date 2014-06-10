package com.delta.task0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button click = (Button) findViewById(R.id.bJumble);
		final TextView print = (TextView) findViewById(R.id.tvDisplay);
		
		click.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				
				String s = "HELLO WORLD!";
				String shuffled = "";
				
				while(s.length()!=0)
				{
					int index = (int) Math.floor(Math.random() * s.length());// to get a random number for the index of the string array
		            char c = s.charAt(index);// to get the character stored for that index in the array
		            shuffled += c;// this character is added to the initially empty string- shuffled
		            s = s.substring(0,index)+s.substring(index+1);// the character added to the string- shuffled is removed from the origional string- s
		            
				}
				
				print.setText("" + shuffled);
				print.setTextSize(35);
				
			}
		});
	}

}

