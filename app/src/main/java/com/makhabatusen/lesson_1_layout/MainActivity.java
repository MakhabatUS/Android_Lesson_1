package com.makhabatusen.lesson_1_layout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private TextView tv1;
    private EditText et1;
    private ImageView iv1;
    private Button btnChange ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {

        tv1 = findViewById(R.id.tv_text);
        et1 = findViewById(R.id.et_text);
        iv1 = findViewById(R.id.iv_smoke_free);
        btnChange = findViewById(R.id.btn_btn);

        btnChange.setOnClickListener(view -> {

            String newText =  et1.getText().toString();
            tv1.setText(newText);
            iv1.setImageResource(R.drawable.ic_launcher_foreground);
        });


        iv1.setOnClickListener(view -> {
            tv1.setText("");
            et1.setText("");
            iv1.setImageResource(R.drawable.ic_baseline_smoke_free_24);
        });

    }
}