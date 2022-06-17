package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String [] Q = {"Which of the following language is used for Android Development?",
                   "Which of the following data structure is based on FIFO 'First In First Out' principle?",
                   "Which of the following data structure is based on LIFO 'Last In First Out' principle?",
                   "Which of the following is not a linear data structure?",
                   };
    String [] A = {"Python", "Stack", "Stack", "Stack"};
    String [] B = {"C++", "Queue", "Queue", "Queue"};
    String [] C = {"Java", "Tree", "Tree", "Tree"};
    String [] D = {"JavaScript", "Graph", "Graph", "Array"};
    String [] Ans = {"Java", "Queue", "Stack", "Tree"};
    private int index=0;
    private int score=0;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    TextView textView;
    TextView scoreView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView2);
        scoreView=findViewById(R.id.textView);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        textView.setText(Q[0]);
        button2.setText(A[0]);
        button3.setText(B[0]);
        button4.setText(C[0]);
        button5.setText(D[0]);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=Q.length-1)
                {
                    if(A[index].equals(Ans[index]))
                    {
                        score++;
                    }
                    ++index;
                    if(index<=Q.length-1)
                    {
                        textView.setText(Q[index]);
                        button2.setText(A[index]);
                        button3.setText(B[index]);
                        button4.setText(C[index]);
                        button5.setText(D[index]);
                    }
                    else
                    {
                        scoreView.setText(" Final Score : " + score + " / " + Q.length);
                    }
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Thank You For Using App", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<Q.length)
                {
                    if(B[index].equals(Ans[index]))
                    {
                        score++;
                    }
                    index++;
                    if(index<Q.length)
                    {
                        textView.setText(Q[index]);
                        button2.setText(A[index]);
                        button3.setText(B[index]);
                        button4.setText(C[index]);
                        button5.setText(D[index]);
                    }
                    else
                    {
                        scoreView.setText(" Final Score : " + score + " / " + Q.length);
                    }
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Thank You For Using App", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=Q.length-1)
                {
                    if(C[index].equals(Ans[index]))
                    {
                        score++;
                    }
                    index++;
                    if(index<=Q.length-1)
                    {
                        textView.setText(Q[index]);
                        button2.setText(A[index]);
                        button3.setText(B[index]);
                        button4.setText(C[index]);
                        button5.setText(D[index]);
                    }
                    else
                    {
                        scoreView.setText(" Final Score : " + score + " / " + Q.length);
                    }
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Thank You For Using App", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=Q.length-1)
                {
                    if(D[index].equals(Ans[index]))
                    {
                        score++;
                    }
                    index++;
                    if(index<=Q.length-1)
                    {
                        textView.setText(Q[index]);
                        button2.setText(A[index]);
                        button3.setText(B[index]);
                        button4.setText(C[index]);
                        button5.setText(D[index]);
                    }
                    else
                    {
                         scoreView.setText(" Final Score : " + score + " / " + Q.length);
                    }
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Thank You For Using App", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}