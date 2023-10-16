package com.example.wordcounterramezkameljava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wordcounterramezkameljava.TextUtilis;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private TextView characterCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);
        characterCountTextView = findViewById(R.id.characterCountTextView);
    }

    public void countCharacters(View view) {
        String inputText = inputEditText.getText().toString();
        int charCount = TextCounter.getCharsCount(inputText);
        characterCountTextView.setText("Character count: " + charCount);
    }
}
