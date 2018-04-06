package com.example.user.mcq_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ques3 extends AppCompatActivity {
    Button nextbtn2;
    Button prevbtn2;
    RadioButton choice1,choice2,choice3,choice4;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);
        choice1=(RadioButton)findViewById(R.id.choice1);
        choice2=(RadioButton)findViewById(R.id.choice2);
        choice3=(RadioButton)findViewById(R.id.choice3);
        choice4=(RadioButton)findViewById(R.id.choice4);
        Bundle bundle = getIntent().getExtras();
         score = bundle.getInt("score");
        Toast.makeText(this, score+"", Toast.LENGTH_SHORT).show();
        nextbtn2=(Button)findViewById(R.id.nextbtn2);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice2.isChecked()) {

                    score=score+1;
                    Bundle bundle =new Bundle();
                    bundle.putInt("score",score);
                    Intent intent=new Intent(ques3.this,ques4.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(ques3.this, ques4.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("score",score);
                    //   Intent intent = new Intent(MainActivity.this, ques2.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }
        });
        prevbtn2=(Button)findViewById(R.id.prevbtn2);
        prevbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ques3.this, ques2.class);
                startActivity(i);

            }
        });
    }
}
