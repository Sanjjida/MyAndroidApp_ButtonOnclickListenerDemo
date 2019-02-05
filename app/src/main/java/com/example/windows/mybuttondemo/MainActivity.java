package com.example.windows.mybuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    private Button loginButton1, loginButton2, loginButton3,logoutButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton1=(Button)findViewById(R.id.button1Id);

        loginButton3= (Button)findViewById(R.id.button3Id);
        textView= (TextView) findViewById(R.id.textviewId);
        logoutButton= (Button)findViewById(R.id.LogOut);

        loginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText("Login Button is clicked"+ count + " times");
            }
        });
        loginButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Login Button is clicked");
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Logout Button is clicked");
            }
        });

    }
    public void showMessage(View V)
    {
        if(V.getId() == R.id.enter_name)
        {
           // textView.setText("You pressed Enter, thanks! :)");
            //Toast.makeText(MainActivity.this, "You pressed Enter,thanks! :)", Toast.LENGTH_SHORT).show();
            Toast toast= Toast.makeText(MainActivity.this, "You pressed Enter,thanks! :)", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,-5);
            toast.show();
        }
        else
        {
           // textView.setText("You quit!! :(");
           // Toast.makeText(MainActivity.this, "You quit!! :(", Toast.LENGTH_SHORT).show();
            Toast toast= Toast.makeText(MainActivity.this, "You quit!! :(", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,-5);
            toast.show();
        }
    }
}
