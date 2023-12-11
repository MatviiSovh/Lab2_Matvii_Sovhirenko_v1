package com.example.lab2_matvii_sovhirenko_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.lab2_matvii_sovhirenko_v1.utils.TextCounter;

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
        String inputText = edInput.getText().toString();
        String selectedOption = this.spOptions.getSelectedItem().toString();
        if(selectedOption.equals(getResources().getString(R.string.chars_selection))){
            this.tvResult.setText(TextCounter.getCharsCount(inputText));
        }
        if(selectedOption.equals(getResources().getString(R.string.words_selection))){
            this.tvResult.setText(TextCounter.getWordsCount(inputText));
        }
    }
}