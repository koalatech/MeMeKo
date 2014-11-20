package com.koalatech.memeko;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int [] imgs = {
                R.drawable.astig,
                R.drawable.cry,
                R.drawable.haha,
                R.drawable.heavy,
                R.drawable.heehee,
                R.drawable.mad,
                R.drawable.meme,
                R.drawable.ok,
                R.drawable.omg,
                R.drawable.secret,
                R.drawable.teary,
                R.drawable.what,
                R.drawable.wonder,
                R.drawable.worried,
                R.drawable.yummy
        };

        Random rand = new Random();
        final int rndInt = rand.nextInt(imgs.length);
        //Button, opens Second when button is pressed
        Button b = (Button) findViewById(R.id.button1);
        final TextView TV = (TextView) findViewById(R.id.textView1);


        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent ShowDisplaymemIntent = new Intent(MainActivity.this,Displaymeme.class);
                ShowDisplaymemIntent.putExtra("rand", rndInt);
                startActivity(ShowDisplaymemIntent);
            }
        });
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
}
