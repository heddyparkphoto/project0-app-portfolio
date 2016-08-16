package com.learn.heddy.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when user touches the button */
    public void sendMessage(View view){
        // Initially display a Toast with the button name
        Button button = null;
        StringBuilder builder = new StringBuilder("This button will launch my ");

        try {
            if (null != view) {
                button = (Button) view;
                builder.append(button.getText()).append(" app!");
            }
        } catch (ClassCastException e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }

        Toast.makeText(this, builder.toString(), Toast.LENGTH_SHORT).show();
    }
}
