package com.example.lab2_matvii_sovhirenko_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spOptions;
    private EditText edInput;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edInput = findViewById(R.id.edInput);

        this.spOptions = (Spinner) findViewById(R.id.spOptions);

        this.tvResult = findViewById(R.id.tvResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.count_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptions.setAdapter(adapter);
    }

    public void onClickCount(View view) {
        String inputText = edInput.getText().toString().trim();
        String selectedOption = this.spOptions.getSelectedItem().toString();
        if(selectedOption.equals(getResources().getString(R.string.chars_selection))){
            this.tvResult.setText(countCharacters(inputText));
        }
        if(selectedOption.equals(getResources().getString(R.string.words_selection))){
            this.tvResult.setText(countWords(inputText));
        }
    }

    public static String countCharacters(String inputText) {
        if (TextUtils.isEmpty(inputText.trim())){
            return "Result: The input line is empty!";
        }
        else{
            return "The number of chars is: " + inputText.length();
        }
    }

    public static String countWords(String inputText) {
        if (TextUtils.isEmpty(inputText.trim())){
            return "Result: The input line is empty!";
        }
        else {
            String[] words = inputText.split("\\s+");
            return "The number of words is: "+ words.length;
        }
    }
}