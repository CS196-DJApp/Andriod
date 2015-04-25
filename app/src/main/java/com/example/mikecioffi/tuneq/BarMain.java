package com.example.mikecioffi.tuneq;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class BarMain extends ActionBarActivity implements View.OnClickListener {

    static Button back;
    static Button request;
    static Button songque2;
    static Button specialRequest;
    static Button pastDJ;
    static Button drinks;
    static Button food;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_main);

        back = (Button) findViewById(R.id.food_order_back);
        back.setOnClickListener(this);

        request = (Button) findViewById(R.id.request);
        request.setOnClickListener(this);

        songque2 = (Button) findViewById(R.id.songQue2);
        songque2.setOnClickListener(this);

        specialRequest = (Button) findViewById(R.id.spcReq);
        specialRequest.setOnClickListener(this);

        pastDJ = (Button) findViewById(R.id.pastDJ);
        pastDJ.setOnClickListener(this);

        drinks = (Button) findViewById(R.id.orderdrinks);
        drinks.setOnClickListener(this);

        food = (Button) findViewById(R.id.drinks);
        food.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar_main, menu);
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
            Intent intent2 = new Intent(BarMain.this,second_page.class);
            startActivity(intent2);
        }
        else if(v.equals(songque2))
        {
            Intent intent3 = new Intent(BarMain.this, SongQue.class);
            startActivity(intent3);
        }
        else if(v.equals(request))
        {
            Intent intent1 = new Intent(BarMain.this,Song_Request.class);
            startActivity(intent1);
        }
        else if(v.equals(specialRequest))
        {
            Intent specialRequestPage = new Intent(BarMain.this,Special_Request.class);
            startActivity(specialRequestPage);
        }
        else if(v.equals(pastDJ))
        {
            Intent pastDJ = new Intent(BarMain.this, PastDjs.class);
            startActivity(pastDJ);
        }
        else if(v.equals(drinks))
        {
            Intent orderDrinks = new Intent(BarMain.this, Drink_Order.class);
            startActivity(orderDrinks);
        }
        else if(v.equals(food))
        {
            Intent orderFood = new Intent(BarMain.this, Food_Order.class);
            startActivity(orderFood);
        }
    }
}
