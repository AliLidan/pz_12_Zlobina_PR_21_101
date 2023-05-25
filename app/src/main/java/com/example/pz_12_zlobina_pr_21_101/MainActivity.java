package com.example.pz_12_zlobina_pr_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;

    TextView tvResult;

    String oper = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        etNum2 = (EditText) findViewById(R.id.editTextNumberDecimal3);

        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnSub = (Button) findViewById(R.id.buttonMulti);
        btnMult = (Button) findViewById(R.id.buttonMin);
        btnDiv = (Button) findViewById(R.id.buttonDEL);

        b1 = (Button) findViewById(R.id.button9);
        b2 = (Button) findViewById(R.id.button10);
        b3 = (Button) findViewById(R.id.button11);
        b4 = (Button) findViewById(R.id.button5);
        b5 = (Button) findViewById(R.id.button6);
        b6 = (Button) findViewById(R.id.button7);
        b7 = (Button) findViewById(R.id.button);
        b8 = (Button) findViewById(R.id.button2);
        b9 = (Button) findViewById(R.id.button4);
        b0 = (Button) findViewById(R.id.button17);


        tvResult = (TextView) findViewById(R.id.textView);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String st1;

        if (etNum1.isFocused()) {
            if (v.getId() == R.id.button17) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "0");
            }
            if (v.getId() == R.id.button9) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "1");
            }
            if (v.getId() == R.id.button10) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "2");
            }
            if (v.getId() == R.id.button11) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "3");
            }
            if (v.getId() == R.id.button5) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "4");
            }
            if (v.getId() == R.id.button6) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "5");
            }
            if (v.getId() == R.id.button7) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "6");
            }
            if (v.getId() == R.id.button) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "7");
            }
            if (v.getId() == R.id.button2) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "8");
            }
            if (v.getId() == R.id.button4) {
                String st11 = (etNum1.getText()).toString();
                etNum1.setText(st11 + "9");
            }

            if (v.getId() == R.id.button18) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + ".");
            }
        }
        else if (etNum2.isFocused())
        {
            if (v.getId() == R.id.button17) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "0");
            }
            if (v.getId() == R.id.button9) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "1");
            }
            if (v.getId() == R.id.button10) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "2");
            }
            if (v.getId() == R.id.button11) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "3");
            }
            if (v.getId() == R.id.button5) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "4");
            }
            if (v.getId() == R.id.button6) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "5");
            }
            if (v.getId() == R.id.button7) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "6");
            }
            if (v.getId() == R.id.button) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "7");
            }
            if (v.getId() == R.id.button2) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "8");
            }
            if (v.getId() == R.id.button4) {
                String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "9");
            }

        }

        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString()) || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        // читаем EditText и заполняем переменные числами
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        switch (v.getId()) {
            case R.id.buttonAdd:
                oper = "+";
                result = num1 + num2;
                st1 = (num1 + " " + oper + " " + num2 + " = " + result).toString();
                tvResult.setText(st1);

                break;
            case R.id.buttonMin:
                oper = "-";
                result = num1 - num2;
                st1 = (num1 + " " + oper + " " + num2 + " = " + result).toString();
                tvResult.setText(st1);

                break;
            case R.id.buttonMulti:
                oper = "*";
                result = num1 * num2;
                st1 = (num1 + " " + oper + " " + num2 + " = " + result).toString();
                tvResult.setText(st1);

                break;
            case R.id.buttonDEL:
                oper = "/";
                if(num2==0){
                    result = -0;}
                result = num1 / num2;
                st1 = (num1 + " " + oper + " " + num2 + " = " + result).toString();
                tvResult.setText(st1);

                break;

            case R.id.button14:
                oper = "+/-";
                result = num1 * (-1);
                st1 = (num1 + " " + oper + " " + num2 + " = " + result).toString();
                tvResult.setText(st1);
                break;

            case R.id.button15:
                oper = "%";
                result = num1 / (100);
                st1 = (num1 + " " + oper +  " = " + result).toString();
                tvResult.setText(st1);
                break;

            case R.id.buttonRavno:
                st1 = (num1 + " " + oper + " " + num2 + " = " + result).toString();
                tvResult.setText(st1);
                break;

            case R.id.button13:
                etNum1.getText().clear();
                etNum2.getText().clear();
                num1 = 0;
                num2 = 0;
                result = 0;
                oper = "";
                st1 = ("");
                tvResult.setText(st1);
                break;
            default:
                break;

        }


    }
}

/*4
 @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        // читаем EditText и заполняем переменные числами
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        switch (v.getId()) {
            case R.id.buttonAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.buttonMin:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.buttonMulti:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.buttonDEL:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }
        String st1 = (num1 + " " + oper + " " + num2 + " = " + result).toString();
        tvResult.setText(st1);
    }
 */
 /*  if(etNum1.isActivated() == true)
            { String st11 = (etNum1.getText()).toString();
            etNum1.setText(st11 + "0");}
            else if (etNum2.isActivated() == true)
            { String st11 = (etNum2.getText()).toString();
                etNum2.setText(st11 + "0");}
            else{
                String st11 = (etNum1.getText()).toString();
                etNum1.setText("No");
            }*/