package com.example.dedaily2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ActivityFR extends AppCompatActivity {
    ListView listView;
    FirebaseDatabase database;
    DatabaseReference reff;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Number number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_r);
        number=new Number();
        listView=(ListView) findViewById(R.id.futlist);
        database=FirebaseDatabase.getInstance();
        reff=database.getReference("Number");
        list=new ArrayList<>();
        adapter=new ArrayAdapter<String>(this,R.layout.info,R.id.in,list);
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren())
                {
                    number=ds.getValue(Number.class);
                    list.add(number.getName().toString()+"  "+number.getDate().toString());
                }
                listView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}

