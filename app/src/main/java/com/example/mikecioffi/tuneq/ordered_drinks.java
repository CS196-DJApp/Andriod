package com.example.mikecioffi.tuneq;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ordered_drinks extends ActionBarActivity implements View.OnClickListener {

    static Button anotherDrink;
    static Button orderFood;
    static Button requestASong;
    static Button songQueue;
    static Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordered_drinks);

        anotherDrink = (Button) findViewById(R.id.another2);
        anotherDrink.setOnClickListener(this);

        orderFood = (Button) findViewById(R.id.drinks);
        orderFood.setOnClickListener(this);

        requestASong = (Button) findViewById(R.id.requestasong2);
        requestASong.setOnClickListener(this);

        songQueue = (Button) findViewById(R.id.songqueue);
        songQueue.setOnClickListener(this);

        //   backbutton = (Button) findViewById(R.id.food_order_back);
        //  backbutton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ordered_drinks, menu);
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

        if(v.equals(anotherDrink))
        {
            Intent orderDrink = new Intent(ordered_drinks.this, Drink_Order.class);
            startActivity(orderDrink);
        }
        else if (v.equals(orderFood))
        {
            Intent orderFoods = new Intent(ordered_drinks.this, Food_Order.class);
            startActivity(orderFoods);

        }
        else if (v.equals(requestASong))
        {
            Intent request = new Intent(ordered_drinks.this, Song_Request.class);
            startActivity(request);
        }
        else if(v.equals(songQueue))
        {
            Intent songQ = new Intent(ordered_drinks.this, SongQue.class);
            startActivity(songQ);

        }
        //   else if(v.equals(backbutton))
        //  {
        //    Intent goBack = new Intent(ordered_drinks.this, Food_Order.class);
        //    startActivity(goBack);

        //   }
    }
}
