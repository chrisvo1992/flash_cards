package com.example.cvoflashcardsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ID's for flashcards elements
        TextView flashcardQuestion = findViewById(R.id.flashcard_question_textview);
        TextView flashcardAnswer = findViewById(R.id.flashcard_answer_textview);
        TextView multipleChoice1 = findViewById(R.id.answer_box_1_textview);
        TextView multipleChoice2 = findViewById(R.id.answer_box_2_textview);
        TextView multipleChoice3 = findViewById(R.id.answer_box_3_textview);

        //OnClick listener for flashcard question
        flashcardQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.INVISIBLE);
                flashcardAnswer.setVisibility(View.VISIBLE);

            }

        });
        //OnClick listener for flashcard answer
        flashcardAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.VISIBLE);
                flashcardAnswer.setVisibility(View.INVISIBLE);

            }

        });
        //OnClick listener for multiple choice answer (correct answer)
        multipleChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multipleChoice1.setBackgroundColor(getResources().getColor(R.color.green, null));


            }

        });
        //OnClick listener for multiple choice answer (wrong answer)
        multipleChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multipleChoice1.setBackgroundColor(getResources().getColor(R.color.green, null));
                multipleChoice2.setBackgroundColor(getResources().getColor(R.color.red, null));


            }

        });
        //OnClick listener for multiple choice answer (wrong answer)
        multipleChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multipleChoice1.setBackgroundColor(getResources().getColor(R.color.green, null));
                multipleChoice3.setBackgroundColor(getResources().getColor(R.color.red, null));

            }

        });
    }
