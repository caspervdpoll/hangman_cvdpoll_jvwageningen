package com.example.twisted_hangman;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {
	
	Button singleplayer;
	Button options;
	Button statistics;
	Button howToPlay;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonSingleplayer();
        addListenerOnButtonOptions();
        addListenerOnButtonStatistics();
        addListenerOnButtonHowToPlay();
        
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    public void addListenerOnButtonSingleplayer() {
		final Context context = this;
		singleplayer = (Button) findViewById(R.id.singleplayer);
		singleplayer.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, singleplayerActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}

    public void addListenerOnButtonOptions() {
		final Context context = this;
		options = (Button) findViewById(R.id.options);
		options.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, optionsActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}

    public void addListenerOnButtonStatistics() {
		final Context context = this;
		statistics = (Button) findViewById(R.id.statistics);
		statistics.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, statisticsActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}

    public void addListenerOnButtonHowToPlay() {
		final Context context = this;
		howToPlay = (Button) findViewById(R.id.howToPlay);
		howToPlay.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, howtoplayActivity.class);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
