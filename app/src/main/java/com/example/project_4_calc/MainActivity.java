package com.example.project_4_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0 ,
            btn1 ,
            btn2 ,
            btn3 ,
            btn4 ,
            btn5 ,
            btn6 ,
            btn7 ,
            btn8 ,
            btn9 ,
            btn_add ,
            btn_sub ,
            btn_div ,
            btn_times ,
            btn_coma ,
            btn_clear ,
            btn_res ;
    EditText number_txt ;

    float val1, val2, val3;

    boolean add,
            sub,
            times,
            div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn_add = (Button) findViewById(R.id.button_add);
        btn_sub = (Button) findViewById(R.id.button_sub);
        btn_div = (Button) findViewById(R.id.button_div);
        btn_times = (Button) findViewById(R.id.button_times);
        btn_coma = (Button) findViewById(R.id.button_coma);
        btn_clear = (Button) findViewById(R.id.button_clear);
        btn_res = (Button) findViewById(R.id.button_res);
        number_txt = (EditText) findViewById(R.id.editText);

        add = false;
        div = false;
        sub = false;
        times = false;


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + "0");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number_txt == null){
                    number_txt.setText("");
                }
                else{
                    val1 = Float.parseFloat(number_txt.getText() + "");
                    add = true;
                    number_txt.setText(null);
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(number_txt.getText() + "");
                sub = true;
                number_txt.setText(null);
            }
        });

        btn_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(number_txt.getText() + "");
                times = true;
                number_txt.setText(null);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(number_txt.getText() + "");
                div = true;
                number_txt.setText(null);
            }
        });

        btn_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(number_txt.getText() + "");

                if(add == true){
                    number_txt.setText(val1 + val2 + "");
                    add = false;
                }

                else if (sub == true){
                    number_txt.setText(val1 - val2 + "");
                    sub = false;
                }

                else if(times == true){
                    number_txt.setText(val1 * val2 + "");
                    times = false;
                }

                else if(div == true) {
                    number_txt.setText(val1 / val2 + "");
                    div = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText("");
            }
        });

        btn_coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_txt.setText(number_txt.getText() + ".");
            }
        });
    }
}
