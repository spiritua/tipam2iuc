package com.example.arnaudbt.ques;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Pub3MainActivity extends AppCompatActivity {
    Animation animpub, transpub, btnanim;
    ImageView imageView;
    TextView textView2, textView3;
    Button btngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pub3_main);

        animpub = AnimationUtils.loadAnimation(this, R.anim.animpub);
        transpub = AnimationUtils.loadAnimation(this, R.anim.transpub);
        btnanim = AnimationUtils.loadAnimation(this, R.anim.btnanim);


        imageView = (ImageView) findViewById(R.id.imageView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        btngo = (Button) findViewById(R.id.btngo);

        imageView.startAnimation(animpub);
        textView2.startAnimation(transpub);
        textView3.startAnimation(transpub);
        btngo.startAnimation(btnanim);

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Pub3MainActivity.this, LoginMainActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }
}
