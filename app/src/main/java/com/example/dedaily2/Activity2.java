package com.example.dedaily2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Activity2 extends AppCompatActivity {
    EditText amount,date;
    Button save;
    DatabaseReference ref;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
       amount=(EditText)findViewById(R.id.amount);
       date=(EditText)findViewById(R.id.purpose);
       save=(Button)findViewById(R.id.fix);

        member=new Member();
       ref= FirebaseDatabase.getInstance().getReference().child("Member");
       save.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               member.setName(amount.getText().toString().trim());
               member.setDate(date.getText().toString().trim());
               ref.push().setValue(member);
               Toast.makeText(Activity2.this,"successful",Toast.LENGTH_LONG).show();

           }
       });

    }
}
