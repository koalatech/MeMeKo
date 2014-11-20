package com.koalatech.memeko;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;


public class Displaymeme extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymeme);

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

        final String [] react = {
                "Hala ka!",
                "Amppffff parehas2 gid kmu",
                "Wawa Man dutayan lng, dutayan lng kmu ngalainay",
                "Amu2 kamu ay?",
                "Kwa2 mo gid noy!",
                "Nan kay pala pulaw!",
                "Daw sa tikalon hu",
                "Damo pa kmu to?",
                "Wala gid ta da?",
                "Anu nlg kng ikaw pa gid b no?",
                "Yudiii, parehas sila!",
                "Lapit lng ba! Lapit lng kmu ng Anggid!",
                "Hala cnu na? Daw Napus-an!",
                "Minsaran mo gid kung sin-o ay?",
                "OOOOOPPPPSSSS daw ndi manami!!!"
        };

        Random rand = new Random();
        final int rndWords = rand.nextInt(imgs.length-1);


        ImageView MoodImageView = (ImageView) findViewById(R.id.imageView1);
        MoodImageView.setImageDrawable(getResources().getDrawable(imgs[getIntent().getExtras().getInt("rand")]));


        TextView moodTxt = (TextView) findViewById(R.id.textView1);
        moodTxt.setText(react[rndWords]);

        //Button, opens Second when button is pressed
        Button b = (Button) findViewById(R.id.button1);

        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                startActivity(new Intent(Displaymeme.this,MainActivity.class));
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_displaymeme, menu);
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
