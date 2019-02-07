package com.example.animation1;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button sub;
    Animation frombottom,fromtop,slide;

    ImageView image,image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sub=findViewById(R.id.sub);
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        sub.setAnimation(frombottom);

        image=findViewById(R.id.image);
        fromtop=AnimationUtils.loadAnimation(this,R.anim.fromtop);
        image.setAnimation(fromtop);


        image1=findViewById(R.id.image1);
        slide=AnimationUtils.loadAnimation(this,R.anim.slide);
        image1.startAnimation(slide);

    }

}
