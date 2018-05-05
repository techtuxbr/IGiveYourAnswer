package com.vlware.victor.igiveyouranswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.ask_button);
        final TextView answer = findViewById(R.id.answer_txt);
        final int[] answerList = {R.string.a_yes,R.string.a_no,R.string.a_nah,R.string.a_ihnid,R.string.a_maybe};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(4);
                answer.setText(answerList[number]);
            }
        });

    }
}
