package ru.phantomer.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        EditText firstInput = findViewById(R.id.editText);
        EditText secondInput = findViewById(R.id.editText2);
        TextView output = findViewById(R.id.textView);
        output.setText(
                Integer.parseInt(
                        firstInput.getText().toString(),
                        Integer.parseInt(secondInput.getText().toString())) + ""
        );

    }

}
