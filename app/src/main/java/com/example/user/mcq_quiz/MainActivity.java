package com.example.user.mcq_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button nextbtn;
    RadioButton choice1,choice2,choice3,choice4;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choice1=(RadioButton)findViewById(R.id.choice1);
        choice2=(RadioButton)findViewById(R.id.choice2);
        choice3=(RadioButton)findViewById(R.id.choice3);
        choice4=(RadioButton)findViewById(R.id.choice4);
        nextbtn=(Button)findViewById(R.id.nextbtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        //        Toast.makeText(MainActivity.this, "Clicked Next", Toast.LENGTH_SHORT).show();
                if (choice2.isChecked() )
                {
                    score =score+1;
                    Bundle bundle = new Bundle();
                    bundle.putInt("score",score);
                    Intent intent = new Intent(MainActivity.this, ques2.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else
                { Intent intent = new Intent(MainActivity.this, ques2.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("score",score);
                 //   Intent intent = new Intent(MainActivity.this, ques2.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}
