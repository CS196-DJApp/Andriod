package com.example.mikecioffi.tuneq;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class submittedSong extends ActionBarActivity implements View.OnClickListener {

    static Button back;
    static Button songque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submitted_song);

        back = (Button) findViewById(R.id.backbutton);
        back.setOnClickListener(this);

        songque = (Button) findViewById(R.id.songque);
        songque.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_submitted_song, menu);
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


        if(v.equals(back))
        {
            Intent intent2 = new Intent(submittedSong.this,Song_Request.class);
            startActivity(intent2);
        }
        if(v.equals(songque))
        {
            Intent intent3 = new Intent(submittedSong.this,SongQue.class);
            startActivity(intent3);

        }
    }
}
