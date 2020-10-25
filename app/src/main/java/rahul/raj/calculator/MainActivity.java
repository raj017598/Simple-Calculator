package rahul.raj.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, zero, decimal, back, equalTo, plus, minus, multiply, divide, percent, plusminus, she;
    private String str0, str1, str2;
    private double de;
    private TextView enterData, onGoing_Operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#232D36"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setTitle("Calculator");
        enterData = (TextView) findViewById(R.id.enterData);
        onGoing_Operation = (TextView) findViewById(R.id.onGoing);
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPreferences",MODE_PRIVATE);
        boolean first = sharedPreferences.getBoolean("firstCalculator",true);
        if(first)
            showdialogOnStart();
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        zero = (Button) findViewById(R.id.zero);
        decimal = (Button) findViewById(R.id.decimal);
        back = (Button) findViewById(R.id.back);
        equalTo = (Button) findViewById(R.id.equalTo);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiple);
        divide = (Button) findViewById(R.id.divide);
        percent = (Button) findViewById(R.id.percent);
        plusminus = (Button) findViewById(R.id.plusminus);
        she = (Button) findViewById(R.id.she);
        str0 = str1 = str2 = "";
        try {
            num1.setOnClickListener(this);
            num2.setOnClickListener(this);
            num3.setOnClickListener(this);
            num4.setOnClickListener(this);
            num5.setOnClickListener(this);
            num6.setOnClickListener(this);
            num7.setOnClickListener(this);
            num8.setOnClickListener(this);
            num9.setOnClickListener(this);
            zero.setOnClickListener(this);
            decimal.setOnClickListener(this);
            plusminus.setOnClickListener(this);
            plus.setOnClickListener(this);
            minus.setOnClickListener(this);
            multiply.setOnClickListener(this);
            divide.setOnClickListener(this);
            she.setOnClickListener(this);
            equalTo.setOnClickListener(this);
            percent.setOnClickListener(this);
            back.setOnClickListener(this); }
        catch (Exception e) { }
    }
    @Override
    public void onClick(View v) {
        onGoing_Operation.setTextSize(50);
        enterData.setTextSize(25);
        enterData.setTextColor(Color.BLACK);
        switch (v.getId()) {
            case R.id.plus: { str0 = enterData.getText().toString();
                str2 = ""; str1 = "+";
                onGoing_Operation.setText(str0 + str1 + str2);
                enterData.setText(str0);
                break; }
            case R.id.minus: {
                str0 = enterData.getText().toString(); str2 = ""; str1 = "-";
                onGoing_Operation.setText(str0 + str1 + str2);
                enterData.setText(str0);
                break;  }
            case R.id.multiple: {  str0 = enterData.getText().toString();
                str2 = ""; str1 = "×";
                onGoing_Operation.setText(str0 + str1 + str2);
                enterData.setText(str0);
                break; }
            case R.id.divide: { str0 = enterData.getText().toString();
                str2 = ""; str1 = "÷";
                onGoing_Operation.setText(str0 + str1 + str2);
                enterData.setText(str0);
                break; }
            case R.id.num1: { String str = num1.getText().toString();
                if (!str1.isEmpty()) {
                    str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else {
                    str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText());  }
                break;  }
            case R.id.num2: { String str = num2.getText().toString();
                if (!str1.isEmpty()) { str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.num3: { String str = num3.getText().toString();
                if (!str1.isEmpty()) { str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.num4: { String str = num4.getText().toString();
                if (!str1.isEmpty()) { str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.num5: { String str = num5.getText().toString();
                if (!str1.isEmpty()) {
                    str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.num6: { String str = num6.getText().toString();
                if (!str1.isEmpty()) { str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.num7: { String str = num7.getText().toString();
                if (!str1.isEmpty()) {
                    str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.num8: { String str = num8.getText().toString();
                if (!str1.isEmpty()) { str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.num9: { String str = num9.getText().toString();
                if (!str1.isEmpty()) { str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.zero: { String str = zero.getText().toString();
                if (!str1.isEmpty()) { str2 = str2 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(String.valueOf(operation(str1))); }
                else { str0 = str0 + str;
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText()); }
                break; }
            case R.id.decimal: { String str = decimal.getText().toString();
                if (!str1.isEmpty()) {
                    if (!str2.isEmpty())
                        str2 = str2 + str;
                    else { str2 = "0";
                        str2 = str2 + str; } }
                else { str0 = enterData.getText().toString();
                    str0 = str0 + str; }
                onGoing_Operation.setText(str0 + str1 + str2);
                enterData.setText(onGoing_Operation.getText());
                break; }
            case R.id.she: { str0 = str1 = str2 = "";
                onGoing_Operation.setText("0");
                enterData.setText("0");
                break; }
            case R.id.percent: {
                if (!str1.isEmpty()) { str1 = "";
                    enterData.setText(String.valueOf(Double.parseDouble(enterData.getText().toString()) / 100));
                    onGoing_Operation.setText(enterData.getText());
                    str0 = enterData.getText().toString(); } else {
                    enterData.setText(String.valueOf(Double.parseDouble(enterData.getText().toString()) / 100));
                    onGoing_Operation.setText(enterData.getText()); }
                break; }
            case R.id.equalTo: { enterData.setTextSize(50);
                onGoing_Operation.setTextSize(25);
                enterData.setTextColor(Color.WHITE);
                str0 = enterData.getText().toString();str1 = "";str2 = "";
                break;
            }
            case R.id.plusminus: {
                plusminus_operation();
                break;
            }
            case R.id.back: {
                if (!str2.isEmpty()) {
                    str2 = str2.substring(0, str2.length() - 1);
                    onGoing_Operation.setText(str0 + str1 + str2);
                    enterData.setText(onGoing_Operation.getText());
                } else {
                    if (!str1.isEmpty()) {
                        str1 = "";
                        onGoing_Operation.setText(str0 + str1 + str2);
                        enterData.setText(onGoing_Operation.getText());
                    } else {
                        if (!str0.isEmpty() && str0.length() != 1) {
                            str0 = str0.substring(0, str0.length() - 1);
                            onGoing_Operation.setText(str0 + str1 + str2);
                            enterData.setText(onGoing_Operation.getText());
                        } else {
                            str0 = str1 = str2 = "";
                            onGoing_Operation.setText("0");
                            enterData.setText("0");
                        }


                    }
                }
                break;
            }
        }
    }

    public double operation(String str) {
        if (str.equals("+")) {
            de = (Double.parseDouble(str0) + Double.parseDouble(str2));
        } else if (str.equals("-")) {
            de = (Double.parseDouble(str0) - Double.parseDouble(str2));
        } else if (str.equals("×")) {
            de = (Double.parseDouble(str0) * Double.parseDouble(str2));
        } else if (str.equals("÷")) {
            if(!str2.equalsIgnoreCase("0"))
                de = (Double.parseDouble(str0) / Double.parseDouble(str2));
            else
                de = 0.0;
        }
        return de;
    }

    public double back_operation() {
        if (!str2.isEmpty()) {
            str2 = str2.substring(0, str2.length() - 1);
            onGoing_Operation.setText(str0 + str1 + str2);
            enterData.setText(onGoing_Operation.getText());
        }
        else {
            if (!str1.isEmpty()) {
                str1 = "";
            }
            else{
                str0 = str0.substring(0, str0.length() - 1);
            }
        }
        return Double.parseDouble(str0 + str1 + str2);
    }

    public void plusminus_operation() {
        if (!str2.isEmpty()) {
            str2 = String.valueOf(Double.parseDouble(str2) - (2 * Double.parseDouble(str2)));
            operation(str1);
            onGoing_Operation.setText(str0 + str1 + "(" + str2 + ")");
            enterData.setText(String.valueOf(operation(str1)));
        } else {
            str0 = enterData.getText().toString();
            if(!str0.equalsIgnoreCase("0"))
                str0 = String.valueOf(Double.parseDouble(str0) - (2 * Double.parseDouble(str0)));
            else
                str0 = "-";
            onGoing_Operation.setText(str0 + str1 + str2);
            enterData.setText(onGoing_Operation.getText());
        }
    }

    public  void showdialogOnStart()
    {
        new AlertDialog.Builder(MainActivity.this).setTitle("Welcome !")
                .setMessage("Calculator is designed by Rahul Raj.")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("firstCalculator",false);
        editor.apply();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Do you want to exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).show();
    }
}