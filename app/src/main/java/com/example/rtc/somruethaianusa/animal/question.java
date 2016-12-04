package com.example.rtc.somruethaianusa.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                case R.id.rad1:
                    strAnswer = "Parrot";
                    break;
                case R.id.rad2:
                    strAnswer = "Burmese python";
                    break;
                case R.id.rad3:
                    strAnswer = "Green turtle";
                    break;
                case R.id.rad4:
                    strAnswer = "curve-toed gecko";
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
    public void  clickAnswer(View view){
        checkChooseAnswer(){

        }
    private void ch
    }
}
