package com.udacity.yogeshshrivastava.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.spotify_streamer_button).setOnClickListener(this);
        findViewById(R.id.scores_button).setOnClickListener(this);
        findViewById(R.id.library_button).setOnClickListener(this);
        findViewById(R.id.build_it_bigger_button).setOnClickListener(this);
        findViewById(R.id.xyz_button).setOnClickListener(this);
        findViewById(R.id.my_app_button).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify_streamer_button:
                Toast.makeText(this, getString(R.string.spotify_streamer_button_click_text), Toast.LENGTH_LONG).show();
                break;
            case R.id.scores_button:
                Toast.makeText(this, getString(R.string.score_button_click_text), Toast.LENGTH_LONG).show();
                break;
            case R.id.library_button:
                Toast.makeText(this, getString(R.string.library_button_click_text), Toast.LENGTH_LONG).show();
                break;
            case R.id.build_it_bigger_button:
                Toast.makeText(this, getString(R.string.build_bigger_button_click_text), Toast.LENGTH_LONG).show();
                break;
            case R.id.xyz_button:
                Toast.makeText(this, getString(R.string.xyz_button_click_text), Toast.LENGTH_LONG).show();
                break;
            case R.id.my_app_button:
                Toast.makeText(this, getString(R.string.capstone_button_clicked_text), Toast.LENGTH_LONG).show();
                break;
            default:

        }
    }
}
