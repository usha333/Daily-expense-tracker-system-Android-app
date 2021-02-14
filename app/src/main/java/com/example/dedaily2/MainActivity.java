package com.example.dedaily2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

import com.example.dedaily2.R;
    public class MainActivity extends AppCompatActivity {




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Thread thread=new Thread()
            {
                @Override
                public void run() {
                    try
                    {
                        sleep(500);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    finally
                    {
                        Intent welcomeIntent = new Intent(MainActivity.this,loginpage.class);
                        startActivity(welcomeIntent);
                    }

                }
            };
            thread.start();
        }

        @Override

    protected void onPause() {
        super.onPause();
        finish();
    }


}
