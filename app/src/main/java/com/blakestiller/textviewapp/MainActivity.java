package com.blakestiller.textviewapp;
// Package Name

// Import Files (Classes) for the objects needed
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Setup the layout view
        setContentView(R.layout.activity_main);
        // Locate and Identify Controls
        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final EditText editText1 = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View textview) {
                // Get the user inputted text and display concatenated
                textView.setText(editText1.getText().toString() + editText2.getText().toString());
                // Setup the text for the toast
                CharSequence text = editText1.getText().toString() + editText2.getText().toString();

                Context context = getApplicationContext();
                // Toast Duration
                int duration = Toast.LENGTH_SHORT;
                // Create toast object with the text to display and it's duration
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

}
