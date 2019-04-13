package com.example.calculator_new;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spr;
    EditText edt_Number1;
    EditText edt_Number2;
    TextView Result;
    Button btn;
    String selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spr = (Spinner) findViewById(R.id.SprOperator);
                edt_Number1 = (EditText) findViewById(R.id.edtNumber1);
                edt_Number2 = (EditText) findViewById(R.id.edtNumber2);
                Result = (EditText) findViewById(R.id.edtResult);


                selectedItem = (String) spr.getSelectedItem();

                if (selectedItem.trim().equals("+")){
                    float result = Float.parseFloat(edt_Number1.getText().toString())  + Float.parseFloat(edt_Number2.getText().toString());
                    Result.setText(Float.toString(result));
                }  else if ( selectedItem.trim().equals("-")){
                    float resuslt = Float.parseFloat(edt_Number1.getText().toString()) - Float.parseFloat(edt_Number2.getText().toString());
                    Result.setText(Float.toString(resuslt));
                } else if(selectedItem.trim().equals("X")) {
                    float result = Float.parseFloat(edt_Number1.getText().toString()) * Float.parseFloat(edt_Number2.getText().toString());
                    Result.setText(Float.toString(result));
                } else if (selectedItem.trim().equals("/")){
                    float result = Float.parseFloat(edt_Number1.getText().toString()) / Float.parseFloat(edt_Number2.getText().toString());
                    Result.setText(Float.toString(result));
                }

            }
        };

        btn = (Button) findViewById(R.id.btn_Result);
        btn.setOnClickListener(listener);
    }
}
