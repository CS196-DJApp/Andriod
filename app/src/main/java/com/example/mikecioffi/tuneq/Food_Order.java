package com.example.mikecioffi.tuneq;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Food_Order extends ActionBarActivity implements View.OnClickListener {

    static Button order;
    static Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__order);

        order = (Button) findViewById(R.id.submit);
        order.setOnClickListener(this);

        back = (Button) findViewById(R.id.food_order_back);
        back.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_food__order, menu);
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
            Intent odering = new Intent(Food_Order.this, ordered_food.class);
            startActivity(odering);

        }
        else if (v.equals(back))
        {
            Intent goback = new Intent(Food_Order.this, BarMain.class);
            startActivity(goback);
        }
    }
}
