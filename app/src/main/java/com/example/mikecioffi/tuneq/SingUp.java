package com.example.mikecioffi.tuneq;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class SingUp extends ActionBarActivity implements View.OnClickListener {

    static Button backButton ;
    static Button signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        backButton = (Button) findViewById(R.id.Back);
        backButton.setOnClickListener(this);

        signUp = (Button) findViewById(R.id.signUp);
        signUp.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sing_up, menu);
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
        if(v.equals(backButton))
        {
            Intent intent2 = new Intent(SingUp.this,MainActivity.class);
            startActivity(intent2);
        }
        else if(v.equals(signUp))
        {
            Intent intent1 = new Intent(SingUp.this,second_page.class);
            startActivity(intent1);
        }

    }
}
