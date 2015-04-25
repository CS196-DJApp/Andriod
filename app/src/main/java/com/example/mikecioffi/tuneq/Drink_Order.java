package com.example.mikecioffi.tuneq;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Drink_Order extends ActionBarActivity implements View.OnClickListener {

    static Button order;
    static Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink__order);

        order = (Button) findViewById(R.id.submit);
        order.setOnClickListener(this);

        back = (Button) findViewById(R.id.back3);
        back.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_drink__order, menu);
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
        if(v.equals(order))
        {
            Intent orderDrinks = new Intent(Drink_Order.this,ordered_drinks.class);
            startActivity(orderDrinks);
        }
        else if(v.equals(back))
        {
            Intent goback = new Intent(Drink_Order.this, BarMain.class );
            startActivity(goback);
        }


    }
}
