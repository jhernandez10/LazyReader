package com.example.lazyreader.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    ImageView one;
    ImageView two;
    ImageView three;
    RelativeLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initializing relevant variables
        one = new ImageView(this);
        two = new ImageView(this);
        three = new ImageView(this);
        main = (RelativeLayout) findViewById(R.layout.activity_main);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.MATCH_PARENT);

        //add necessary rules to the parameters
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        one.setImageDrawable(getResources().getDrawable(R.drawable.newsapp_one_transparent));
        two.setImageDrawable(getResources().getDrawable(R.drawable.two_transparent));
        three.setImageDrawable(getResources().getDrawable(R.drawable.three_transparent));


        //put images in the view
        main.addView(one,params);
        main.addView(two,params);
        main.addView(three,params);

        //change their alphas to produce effect
        one.setImageAlpha(0);
        two.setImageAlpha(0);
        three.setImageAlpha(0);
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

}
