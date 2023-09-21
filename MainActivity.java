package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAdd,buttonSub,buttonMul,buttonDiv;
    EditText editText1,editText2;
    TextView textView;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.add);
        buttonSub = findViewById(R.id.subtract);
        buttonMul = findViewById(R.id.multiply);
        buttonDiv = findViewById(R.id.divide);
        editText1 = findViewById(R.id.Number1);
        editText2 = findViewById(R.id.Number2);
        textView = findViewById(R.id.textView);

        buttonAdd.setOnClickListener(this );
        buttonSub.setOnClickListener(this );
        buttonMul.setOnClickListener(this );
        buttonDiv.setOnClickListener(this );

    }


    public int getIntFromEditText(EditText editText){
        if (editText.getText().toString().equals(" ")){
            Toast.makeText(this,"Enter number",Toast.LENGTH_SHORT).show();
            return 0 ;
        }else
            return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view){
        int num1 = getIntFromEditText(editText1);
        int num2 = getIntFromEditText(editText2);

        if (view.getId() == R.id.btn_add) {
            textView.setText("Answer = " + num1 + num2);
        }
        if (view.getId() == R.id.subtract) {
            textView.setText("Answer = " + (num1 - num2));
        }
        if (view.getId() == R.id.btn_mul) {
            textView.setText("Answer = " + (num1 * num2));
        }
        if (view.getId() == R.id.divide) {
            textView.setText("Answer = " + (num1 /  num2));
        }
    }
}