package jp.techacademy.shun.hachiya.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        // 前画面の計算結果をdouble型に変換
        double value1 = intent.getDoubleExtra("VALUE1", 0);

        TextView textView = (TextView) findViewById(R.id.resultNumber);
        textView.setText(String.valueOf(value1));
    }

}
