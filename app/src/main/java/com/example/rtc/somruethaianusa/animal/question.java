package com.example.rtc.somruethaianusa.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class question extends AppCompatActivity {

    private ImageView imvAnimal;
    private RadioGroup radAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initialWidget();
    }
    private void initialWidget(){
        imvAnimal = (ImageView) findViewById(R.id.imvAnimal);
        radAnswer =(RadioGroup) findViewById(R.id.radAnswer);
    }
    public void  clickAnswer(View view){

    }
}
