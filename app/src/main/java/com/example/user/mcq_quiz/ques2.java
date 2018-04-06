package com.example.user.mcq_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.user.mcq_quiz.R.id.nextbtn;

public class ques2 extends AppCompatActivity {
    Button nextbtn1;
Button prevbtn1;
//public String ques="Quartz crystals normally used in quartz clocks etc. is chemically";
  //  public String mchoice[]={"silicon oxide","germanium oxide","mixture of germanium and silicon oxide","sodium silicate"};
    //private String corrans="silicon oxide";
    int score;

RadioButton choice1,choice2,choice3,choice4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        choice1=(RadioButton)findViewById(R.id.choice1);
        choice2=(RadioButton)findViewById(R.id.choice2);
        choice3=(RadioButton)findViewById(R.id.choice3);
        choice4=(RadioButton)findViewById(R.id.choice4);
        Bundle bundle = getIntent().getExtras();
         score = bundle.getInt("score");
        Toast.makeText(this, score+"", Toast.LENGTH_SHORT).show();
        nextbtn1=(Button)findViewById(R.id.nextbtn1);
        nextbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice1.isChecked())
                {
                    score=score+1;
                    Bundle bundle =new Bundle();
                    bundle.putInt("score",score);
                    Intent intent=new Intent(ques2.this,ques3.class);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
                else
                {
                    Intent intent = new Intent(ques2.this, ques3.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("score",score);
                    //   Intent intent = new Intent(MainActivity.this, ques2.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }



                    }
        });
        prevbtn1=(Button)findViewById(R.id.prevbtn1);
        prevbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ques2.this,MainActivity.class);
                startActivity(i);


            }
        });
    }
}
