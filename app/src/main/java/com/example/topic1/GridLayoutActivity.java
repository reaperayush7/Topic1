package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridLayoutActivity extends AppCompatActivity {

    EditText txtExpression;

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnDivide, btnEqual, btnMultiply, btnPercent, btnBackspace;
    boolean boolAdd = false;
    boolean boolMultiply = false;
    boolean boolSub = false;
    boolean boolDivide = false;
    boolean boolPercent = false;

    int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnPercent = findViewById(R.id.btnPercent);
        txtExpression = findViewById(R.id.txtExpression);
        btnBackspace = findViewById(R.id.btnBackspace);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText(txtExpression.getText() + "9");
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpression.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtExpression != null) {
                    number1 = Integer.parseInt(txtExpression.getText().toString());
                    boolAdd = true;
                    txtExpression.setText(null);
                } else {
                    txtExpression.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtExpression != null) {
                    number1 = Integer.parseInt(txtExpression.getText().toString());
                    boolSub = true;
                    txtExpression.setText(null);
                } else {
                    txtExpression.setText("");
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtExpression != null) {
                    number1 = Integer.parseInt(txtExpression.getText().toString());
                    boolMultiply = true;
                    txtExpression.setText(null);
                } else {
                    txtExpression.setText("");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtExpression != null) {
                    number1 = Integer.parseInt(txtExpression.getText().toString());
                    boolDivide = true;
                    txtExpression.setText(null);
                } else {
                    txtExpression.setText("");
                }
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtExpression != null) {
                    number1 = Integer.parseInt(txtExpression.getText().toString());
                    boolPercent = true;
                    txtExpression.setText(null);
                } else {
                    txtExpression.setText("");
                }
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Integer.parseInt(txtExpression.getText().toString());

                if (boolAdd == true) {
                    txtExpression.setText(String.valueOf(number1 + number2));
                    boolAdd = false;
                } else if (boolSub == true) {
                    txtExpression.setText(String.valueOf(number1 - number2));
                    boolSub = false;
                } else if (boolMultiply == true) {
                    txtExpression.setText(String.valueOf(number1 * number2));
                    boolMultiply = false;
                } else if (boolDivide == true) {
                    txtExpression.setText(String.valueOf(number1 / number2));
                    boolDivide = false;
                } else if (boolPercent == true) {
                    txtExpression.setText(String.valueOf(number1 % number2));
                    boolPercent = false;
                }
            }
        });


    }
}
