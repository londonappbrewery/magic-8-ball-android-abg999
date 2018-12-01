package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button button_ask=(Button) findViewById(R.id.button_ask);

       final ImageView image_ball=(ImageView)findViewById(R.id.image_ball);

       final int[] imageArray={R.drawable.ball1,
                               R.drawable.ball2,
                               R.drawable.ball3,
                               R.drawable.ball4,
                               R.drawable.ball5};

       button_ask.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Random randomnumber=new Random();
               int number=randomnumber.nextInt(5);

               image_ball.setImageResource(imageArray[number]);
           }
       });

  
    }
}
