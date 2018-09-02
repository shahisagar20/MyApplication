package edu.shahisjsu.sagar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView helloTextView;
    private Button backgroundButton;
    private View mainViewColor;
    private Button changeText;
    private EditText writeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.clickme);
        helloTextView = findViewById(R.id.helloView);
        backgroundButton = findViewById(R.id.colorBackground);
        mainViewColor = findViewById(R.id.mainView);
        changeText = findViewById(R.id.changeText);
        writeText = findViewById(R.id.editText);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            helloTextView.setTextColor(getResources().getColor(R.color.cyan));
            }
        });

        backgroundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewColor.setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });
        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = writeText.getText().toString();
                if(TextUtils.isEmpty(userInput)){
                    helloTextView.setText(getResources().getText(R.string.Hello));
                } else {
                    helloTextView.setText(userInput);
                }

            }
        });

        mainViewColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloTextView.setText(getResources().getText(R.string.Hello));
                mainViewColor.setBackgroundColor(getResources().getColor(R.color.black));
                helloTextView.setTextColor(getResources().getColor(R.color.green));
            }
        });

    }
}
