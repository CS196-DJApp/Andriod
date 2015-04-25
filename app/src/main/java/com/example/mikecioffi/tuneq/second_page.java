package com.example.mikecioffi.tuneq;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class second_page extends ActionBarActivity implements View.OnClickListener {

    static Button redLion;
    static Button kams;
    static Button clys;
    static Button joes;
    static Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second_page);
        redLion = (Button) findViewById(R.id.redlion);


        redLion.setOnClickListener(this);

        kams = (Button) findViewById(R.id.kams);
        kams.setOnClickListener(this);

        clys = (Button) findViewById(R.id.clys);
        clys.setOnClickListener(this);

        joes = (Button) findViewById(R.id.joes);
        joes.setOnClickListener(this);

        back = (Button) findViewById(R.id.food_order_back);
        back.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_page, menu);
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
        if(v.equals(redLion) || v.equals(kams) || v.equals(joes) || v.equals(clys))
        {
            Intent intent2 = new Intent(second_page.this,BarMain.class);
            startActivity(intent2);
        }
        else if(v.equals(back))
        {
            Intent intent1 = new Intent(second_page.this, MainActivity.class);
            startActivity(intent1 );
        }
    }
}
