package com.arghya.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    TextView output;
    public void hintFunction(View view){
        Toast.makeText(this, "The number is between 1 and 50", Toast.LENGTH_SHORT).show();
    }
    public void checkFunction(View view) {
        EditText input = (EditText) findViewById(R.id.userInput);
        int x = Integer.parseInt(input.getText().toString());
        output = (TextView) findViewById(R.id.output);

        if (x > randomNumber) {
            output.setText("It is greater than the number I thought !!");
        }
        else if (x < randomNumber) {
            output.setText("It is lesser than the number I thought !!");
        }

        else if(x==randomNumber) {
            output.setText("Wow!! You got it correct!! Try again!!");
            Random r = new Random();
            randomNumber = r.nextInt(50) + 1;
        }

        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        randomNumber = r.nextInt(50)+1;
    }
}
