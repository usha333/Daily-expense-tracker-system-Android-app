package com.example.dedaily2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityIn extends AppCompatActivity {

    private Button AddIncome;
    private Button AddExpense;
    private Button MovementList;
    private Button Futureschedule;
    private Button Help;
    private Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in);
        next=(Button)findViewById(R.id.next4);
        AddIncome=(Button)findViewById(R.id.buttonAddIncome);
        AddExpense=(Button)findViewById(R.id.buttonAddExpense);
        MovementList=(Button)findViewById(R.id.buttonMovementList);
        Futureschedule=(Button)findViewById(R.id.buttonReportsByDate);
        Help=(Button)findViewById(R.id.buttonFrequentRecords);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        AddIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityIn();
            }


        });

        AddExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEx();
            }
        });

        MovementList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityML();
            }
        });

        Futureschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRBD();
            }
        });

        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFR();
            }
        });
    }
    public void openActivity1()
    {
        Intent intent = new Intent(ActivityIn.this, Activitytemp.class);
        startActivity(intent);
    }
    public void openActivityIn(){
        Intent intent=new Intent(ActivityIn.this,Activity2.class);
        startActivity(intent);
    }

    public void openActivityEx() {
        Intent intent = new Intent(ActivityIn.this, ActivityML.class);
        startActivity(intent);
    }

    public void openActivityML() {
        Intent intent = new Intent(ActivityIn.this, Activity3.class);
        startActivity(intent);
    }

    public void openActivityRBD() {
        Intent intent = new Intent(ActivityIn.this, Activity4.class);
        startActivity(intent);
    }

    public void openActivityFR() {
        Intent intent = new Intent(ActivityIn.this, ActivityS.class);
        startActivity(intent);
    }



}