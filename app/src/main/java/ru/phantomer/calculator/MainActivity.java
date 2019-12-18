package ru.phantomer.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstInput;
    private  EditText secondInput;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput = findViewById(R.id.editText);
        secondInput = findViewById(R.id.editText2);
        output = findViewById(R.id.textView);
    }


    public void minus(View view) {
        if (firstInput.getText().toString().isEmpty() || secondInput.getText().toString().isEmpty())
            return;
        output.setText((Double.parseDouble(firstInput.getText().toString()) - Double.parseDouble(secondInput.getText().toString())) + "");
    }

    public void plus(View view) {
        if (firstInput.getText().toString().isEmpty() || secondInput.getText().toString().isEmpty())
            return;
        output.setText((Double.parseDouble(firstInput.getText().toString()) + Double.parseDouble(secondInput.getText().toString())) + "");
    }

    public void multiplication(View view) {
        if (firstInput.getText().toString().isEmpty() || secondInput.getText().toString().isEmpty())
            return;
        output.setText((Double.parseDouble(firstInput.getText().toString()) * Double.parseDouble(secondInput.getText().toString())) + "");
    }

    public void divide(View view) {
        if (firstInput.getText().toString().isEmpty() || secondInput.getText().toString().isEmpty())
            return;
        double x = Double.parseDouble(secondInput.getText().toString());
        if (x == 0)
            output.setText("Деление на 0 невозможно");
        else
            output.setText((Double.parseDouble(firstInput.getText().toString()) / x) + "");
    }

    public void sqrt(View view) {
        if (firstInput.getText().toString().isEmpty() || secondInput.getText().toString().equals("0") || Double.parseDouble(firstInput.getText().toString()) < 1) {
            output.setText("Данные неверны");
            return;
        } else if (secondInput.getText().toString().isEmpty())
            output.setText(Math.sqrt(Double.parseDouble(firstInput.getText().toString())) + "");

        else
            output.setText(Math.pow(Double.parseDouble(firstInput.getText().toString()), (1 / Double.parseDouble(secondInput.getText().toString()))) + "");
    }

    public void exp(View view) {
        if (firstInput.getText().toString().isEmpty() || secondInput.getText().toString().isEmpty())
            return;
        else if (secondInput.getText().toString().isEmpty())
            output.setText(Math.pow(Double.parseDouble(firstInput.getText().toString()), 2) + "");
        else
            output.setText(Math.pow(Double.parseDouble(firstInput.getText().toString()), Double.parseDouble(secondInput.getText().toString())) + "");
    }
}
