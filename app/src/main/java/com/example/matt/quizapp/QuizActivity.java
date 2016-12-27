package com.example.matt.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    private TextView mQuestionTextView;
    private Button mAnswer1Button;
    private Button mAnswer2Button;
    private Button mAnswer3Button;
    private QuestionBank mQuestionBank;
    private String answer;
    Random randomGenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        RelativeLayout mRelativeLayout;
        mQuestionTextView = (TextView) findViewById(R.id.textView3);
        mAnswer1Button = (Button) findViewById(R.id.button);
        mAnswer2Button = (Button) findViewById(R.id.button2);
        mAnswer3Button = (Button) findViewById(R.id.button3);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_quiz);
        mQuestionBank = new QuestionBank();


        //TODO: Randomize the first question.

        int randomNumberInit = randomGenerator.nextInt(mQuestionBank.correctAnswers.length);
        String question = mQuestionBank.getLeftAdder(randomNumberInit ) + " + " + mQuestionBank.getRightAdder(randomNumberInit ) + " is?";
        String[] possibleAnswers = {mQuestionBank.secondIncorrectAnswers[randomNumberInit ] + "", mQuestionBank.firstIncorrectAnswers[randomNumberInit ] + "",
                mQuestionBank.correctAnswers[randomNumberInit] + ""};
        answer = mQuestionBank.correctAnswers[randomNumberInit]+"";
        UniqueRandomNumbers uniqueRN = new UniqueRandomNumbers();
        ArrayList<Integer> randomList = uniqueRN.getList();
        int a1 = randomList.get(0);
        int a2 = randomList.get(1);
        int a3 = randomList.get(2);

        mQuestionTextView.setText(question);
        mAnswer1Button.setText(possibleAnswers[a1]);
        mAnswer2Button.setText(possibleAnswers[a2]);
        mAnswer3Button.setText(possibleAnswers[a3]);









        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: determine whether the user picked the correct answer
                Button b = (Button) view;
                String buttonText = b.getText().toString();
                if (buttonText.equals(answer)) {
                    //the Correct answer is chosen do something
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    System.out.println("CORRECT!!!");
                } else {
                    //wrong answer do something
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    System.out.println("WRONG!!!!");
                }


                //TODO: generate a new question and corresponding choices

                int randomNumber = randomGenerator.nextInt(mQuestionBank.correctAnswers.length);
                String question = mQuestionBank.getLeftAdder(randomNumber) + " + " + mQuestionBank.getRightAdder(randomNumber) + " is?";
                String[] possibleAnswers = {mQuestionBank.secondIncorrectAnswers[randomNumber] + "", mQuestionBank.firstIncorrectAnswers[randomNumber] + "",
                        mQuestionBank.correctAnswers[randomNumber] + ""};
                answer = mQuestionBank.correctAnswers[randomNumber]+"";
                //TODO: generate three random numbers for random indexes for the answers...
                UniqueRandomNumbers uniqueRN = new UniqueRandomNumbers();
                ArrayList<Integer> randomList = uniqueRN.getList();
                int a1 = randomList.get(0);
                int a2 = randomList.get(1);
                int a3 = randomList.get(2);

                mQuestionTextView.setText(question);
                mAnswer1Button.setText(possibleAnswers[a1]);
                mAnswer2Button.setText(possibleAnswers[a2]);
                mAnswer3Button.setText(possibleAnswers[a3]);


            }



        };
        mAnswer1Button.setOnClickListener(listener);
        mAnswer2Button.setOnClickListener(listener);
        mAnswer3Button.setOnClickListener(listener);

    }
}
