package com.example.user.mcq_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.user.mcq_quiz.R.id.nextbtn;

public class ques5 extends AppCompatActivity {
    Button nextbtn4;
    RadioButton choice1,choice2,choice3,choice4;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques5);
        choice1=(RadioButton)findViewById(R.id.choice1);
        choice2=(RadioButton)findViewById(R.id.choice2);
        choice3=(RadioButton)findViewById(R.id.choice3);
        choice4=(RadioButton)findViewById(R.id.choice4);
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("score");
        Toast.makeText(this, score+"", Toast.LENGTH_SHORT).show();
        nextbtn4 = (Button) findViewById(R.id.nextbtn4);
        nextbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice1.isChecked()) {

                    score = score + 1;
                    Bundle bundle = new Bundle();
                    bundle.putInt("score", score);
                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                  //  startActivity(intent);
                   // finish();
                    //System.exit(1);
                    //android.os.Process.killProcess(android.os.Process.myPid());
                }
                else
                {
                    finish();
                    //System.exit(1);
                    //System.exit(1);
                  // android.os.Process.killProcess(android.os.Process.myPid());
                }

            }
        });
        //Toast.makeText(this,score+"",Toast.LENGTH_SHORT).show();
    }
}
