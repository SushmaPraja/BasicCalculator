package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMulti,btnDiv,btnEqual,btnCls;
    EditText btnedt;
    float res1, res2;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnCls = (Button) findViewById(R.id.btnCls);
        btnedt = (EditText) findViewById(R.id.rslt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText(btnedt.getText() + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnedt == null){
                    btnedt.setText("");
                }
                else{

                    res1 = Float.parseFloat(btnedt.getText() + "");
                    Addition = true;
                    btnedt.setText(null);

                }
            }});

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnedt == null){
                    btnedt.setText("");
                }
                else{

                    res1 = Float.parseFloat(btnedt.getText() + "");
                    Subtract = true;
                    btnedt.setText(null);

                }
            }});

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnedt == null){
                    btnedt.setText("");
                }
                else{

                    res1 = Float.parseFloat(btnedt.getText() + "");
                    Multiplication = true;
                    btnedt.setText(null);

                }
            }});

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnedt == null){
                    btnedt.setText("");
                }
                else{

                    res1 = Float.parseFloat(btnedt.getText() + "");
                    Division = true;
                    btnedt.setText(null);

                }
            }});


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(btnedt.getText() + "");
                if (Addition == true) {
                    btnedt.setText(res1 + res2 + "");
                    Addition = false;

                }


                if (Subtract == true) {
                    btnedt.setText(res1 - res2 + "");
                    Subtract = false;
                }



                if (Multiplication == true) {
                    btnedt.setText(res1 * res2 + "");

                    Multiplication = false;
                }



                if (Division == true) {
                    btnedt.setText(res1 / res2 + "");
                    Division = false;
                }
            }});


        btnCls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnedt.setText("");
            }
        });




    }
}
