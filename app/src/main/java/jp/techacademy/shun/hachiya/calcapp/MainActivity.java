package jp.techacademy.shun.hachiya.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.NaN;

public class MainActivity extends AppCompatActivity {

    private EditText mEditNumber1;
    private EditText mEditNumber2;
    private double editNumber1;
    private double editNumber2;
    private Intent intent;
    private String editString1;
    private String editString2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditNumber1 = findViewById(R.id.editNumber1);
        mEditNumber1.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_CLASS_NUMBER);


        mEditNumber2 = findViewById(R.id.editNumber2);
        mEditNumber2.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_CLASS_NUMBER);



        intent = new Intent(this, ResultActivity.class);

        Button plusButton = (Button) findViewById(R.id.plus_button);
        Button minusButton = (Button) findViewById(R.id.minus_button);
        Button kakeButton = (Button) findViewById(R.id.kake_button);
        Button wariButton = (Button) findViewById(R.id.wari_button);



            plusButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editString1 = mEditNumber1.getText().toString();
                    editString2 = mEditNumber2.getText().toString();
                    if(!editString1.isEmpty() && !editString2.isEmpty()) {
                        editNumber1 = Double.parseDouble(editString1);
                        editNumber2 = Double.parseDouble(editString2);
                        intent.putExtra("VALUE1", editNumber1 + editNumber2);
                        startActivity(intent);
                    }
                }

            });

            minusButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editString1 = mEditNumber1.getText().toString();
                    editString2 = mEditNumber2.getText().toString();
                    if(!editString1.isEmpty() && !editString2.isEmpty()) {
                        editNumber1 = Double.parseDouble(editString1);
                        editNumber2 = Double.parseDouble(editString2);
                        intent.putExtra("VALUE1", editNumber1 - editNumber2);
                        startActivity(intent);
                    }

                }
            });

            kakeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editString1 = mEditNumber1.getText().toString();
                    editString2 = mEditNumber2.getText().toString();
                    if(!editString1.isEmpty() && !editString2.isEmpty()) {
                        editNumber1 = Double.parseDouble(editString1);
                        editNumber2 = Double.parseDouble(editString2);
                        intent.putExtra("VALUE1", editNumber1 * editNumber2);
                        startActivity(intent);
                    }
                }
            });

            wariButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editString1 = mEditNumber1.getText().toString();
                    editString2 = mEditNumber2.getText().toString();
                    if(!editString1.isEmpty() && !editString2.isEmpty()) {
                        editNumber1 = Double.parseDouble(editString1);
                        editNumber2 = Double.parseDouble(editString2);
                        intent.putExtra("VALUE1", editNumber1 / editNumber2);
                        startActivity(intent);
                    }
                }
            });

    }


}
