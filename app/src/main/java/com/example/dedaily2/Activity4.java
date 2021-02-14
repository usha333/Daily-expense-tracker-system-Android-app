
package com.example.dedaily2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Activity4 extends AppCompatActivity {
    EditText amount,date;
    ImageView image;
    Button save;
    DatabaseReference refe;
    Number number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        image=(ImageView)findViewById(R.id.ima) ;
        amount=(EditText)findViewById(R.id.amount);
        date=(EditText)findViewById(R.id.purpose);
        save=(Button)findViewById(R.id.fix);
        number=new Number();
        refe= FirebaseDatabase.getInstance().getReference().child("Number");
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity10();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setName(amount.getText().toString().trim());
                number.setDate(date.getText().toString().trim());
                refe.push().setValue(number);
                Toast.makeText(Activity4.this,"successful", Toast.LENGTH_LONG).show();

            }
        });

    }
    public void openActivity10()
    {
        Intent intent = new Intent(Activity4.this, ActivityFR.class);
        startActivity(intent);
    }

}
