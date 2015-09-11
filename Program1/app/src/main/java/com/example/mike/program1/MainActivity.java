package com.example.mike.program1;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    public EditText editText;
    public Button btn;
    Context myContext;

    public MainActivity() {
        // Required empty public constructor
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Allows myContext to have some context in order to hit the button
        myContext = getApplicationContext();

        // These  match the editText and the btn to the id names in the activity_main.xml
        editText = (EditText)findViewById(R.id.name);
        btn = (Button)findViewById(R.id.button);

        // Sets a onClickListener to the button. Toast will appear on if button is tapped.
        btn.setOnClickListener(this);

    }


    public void onClick(View v) {

        // Sets the toast to be whatever the user inputs in the EditText
        Toast.makeText(myContext, "Hi " + editText.getText(), Toast.LENGTH_LONG).show();

        // Clears the editText box after hitting Toast button.
        editText.setText("");

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
