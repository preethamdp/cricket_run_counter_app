package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int runA=0,runB=0;
    int wickA=0,wickB=0;
    int ballsA=0,ballsB=0;
    public void displayForTeamARuns(int score) {
        TextView scoreView = (TextView) findViewById(R.id.runsA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAWickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wicketsA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamABalls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ballsA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamBRuns(int score) {
        TextView scoreView = (TextView) findViewById(R.id.runsB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamBWickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wicketsB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamBBalls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ballsB);
        scoreView.setText(String.valueOf(score));
    }
    public void wicketsA(View view){
        if(wickA<10){
            wickA+=1;
        }
        else{
            wickA=10;
        }
        displayForTeamAWickets(wickA);
    }
    public void ballsA(View view){
        ballsA+=1;
        displayForTeamABalls(ballsA);
    }
    public void runsA1(View view){
        if(wickA<10){
            runA+=1;
        }
        else{
            runA=runA;
        }
        displayForTeamARuns(runA);
    }
    public void runsA2(View view){
        if(wickA<10){
            runA+=2;
        }
        else{
            runA=runA;
        }
        displayForTeamARuns(runA);
    }
    public void runsA3(View view){
        if(wickA<10){
            runA+=3;
        }
        else{
            runA=runA;
        }
        displayForTeamARuns(runA);
    }
    public void runsAFour(View view){
        if(wickA<10){
            runA+=4;
        }
        else{
            runA=runA;
        }
        displayForTeamARuns(runA);
    }
    public void runsASix(View view){
        if(wickA<10){
            runA+=6;
        }
        else{
            runA=runA;
        }
        displayForTeamARuns(runA);
    }




    public void wicketsB(View view){
        if(wickB<10){
            wickB+=1;
        }
        else{
            wickB=10;
        }
        displayForTeamBWickets(wickB);
    }
    public void ballsB(View view){
        ballsB+=1;
        displayForTeamBBalls(ballsB);
    }
    public void runsB1(View view){
        if(wickB<10){
            runB+=1;
        }
        else{
            runB=runB;
        }
        displayForTeamBRuns(runB);
    }
    public void runsB2(View view){
        if(wickB<10){
            runB+=2;
        }
        else{
            runB=runB;
        }
        displayForTeamBRuns(runB);
    }
    public void runsB3(View view){
        if(wickB<10){
            runB+=3;
        }
        else{
            runB=runB;
        }
        displayForTeamBRuns(runB);
    }
    public void runsBFour(View view){
        if(wickB<10){
            runB+=4;
        }
        else{
            runB=runB;
        }
        displayForTeamBRuns(runB);
    }
    public void runsBSix(View view){
        if(wickB<10){
            runB+=6;
        }
        else{
            runB=runB;
        }
        displayForTeamBRuns(runB);
    }
    public void reset(View view){
        runA=runB=wickB=wickA=ballsA=ballsB=0;
        displayForTeamBBalls(ballsB);
        displayForTeamBRuns(runB);
        displayForTeamBWickets(wickB);
        displayForTeamAWickets(wickA);
        displayForTeamABalls(ballsA);
        displayForTeamARuns(runA);
    }
}
