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
        if(TextUtils.isEmpty(this.edInput.getText().toString())) {
            Toast.makeText(this, "The input line is empty!", Toast.LENGTH_SHORT).show();
            this.tvResult.setText("Result: The input line is empty!");
        }
        else {
            String selectedOption = this.spOptions.getSelectedItem().toString();
            if(selectedOption.equals(getResources().getString(R.string.chars_selection))){
                this.tvResult.setText("The number of chars is: " + TextCounter.getCharsCount(this.edInput.getText().toString()));
            }
            if(selectedOption.equals(getResources().getString(R.string.words_selection))){
                this.tvResult.setText("The number of words is: " + TextCounter.getWordsCount(this.edInput.getText().toString()));
            }
        }
    }
}