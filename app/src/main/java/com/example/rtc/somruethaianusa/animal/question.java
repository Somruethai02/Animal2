package com.example.rtc.somruethaianusa.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class question extends AppCompatActivity {

    private ImageView imvAnimal;
    private RadioGroup radAnswer;
    private MyAlertDialog objMyAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initialWidget();
        radAnswer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            @Override
         public void onCheckChanged(RadioGroup radioGroup, int i ){
            switch (i) {
                case R.id.rada:
                    strAnswer = "Parrot";
                    break;
                case R.id.radb:
                    strAnswer = "Serow";
                    break;
                case R.id.radc:
                    strAnswer = "Goral";
                    break;
                default:
                    strAnswer = null;
                    break;
            }
        }
    });
    private void initialWidget(){
        imvAnimal = (ImageView) findViewById(R.id.imvAnimal);
        radAnswer =(RadioGroup) findViewById(R.id.radAnswer);
    }
    public void  ClickAnswer(View view) {
        checkChooseAnswer();

    }
       private void checkChooseAnswer(){


        }
    private void checkChooseAnswer(){
        if (strAnswer ! = null){
            Log.d("somruethaianusa", "strAnswer = +strAnswer");
        } else {
            Log.d("somruethaianusa", "Please Choose Something");
        }
    }
}
