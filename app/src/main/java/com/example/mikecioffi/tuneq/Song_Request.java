package com.example.mikecioffi.tuneq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Song_Request extends Activity implements View.OnClickListener {

    static Button submit;
    static Button food;
    static Button drink;
    static Button back;
    static Button que;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song__request);


        submit = (Button)   findViewById(R.id.submitbutton);
        submit.setOnClickListener(this);

        food = (Button) findViewById(R.id.requesttofood);
        food.setOnClickListener(this);

        drink = (Button) findViewById(R.id.requesttodrink);
        drink.setOnClickListener(this);

        back = (Button) findViewById(R.id.requesttobarmain);
        back.setOnClickListener(this);

        que = (Button) findViewById(R.id.requesttoqueue);
        que.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_song__request, menu);
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

        if(v.equals(submit))
        {
            Intent songSubmit = new Intent(Song_Request.this, submittedSong.class);
            startActivity(songSubmit);
        }
        else if(v.equals(food))
        {
            Intent requesttoFood = new Intent(Song_Request.this,Food_Order.class);
            startActivity(requesttoFood);

        }
        else if(v.equals(drink))
        {
            Intent requesttoDrink = new Intent(Song_Request.this,Drink_Order.class);
            startActivity(requesttoDrink);
        }
        else if(v.equals(back))
        {
            Intent requesttobarMain = new Intent(Song_Request.this, BarMain.class);
            startActivity(requesttobarMain);
        }
        else if (v.equals(que))
        {
            Intent requesttoqueue = new Intent(Song_Request.this, SongQue.class);
            startActivity(requesttoqueue);
        }

    }
}
