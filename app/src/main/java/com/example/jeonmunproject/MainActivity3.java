package com.example.jeonmunproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText editText1;
    Button btn1;
    Button btn2;
    RadioGroup Rg;
    RadioButton R_btn1;
    RadioButton R_btn2;
    ImageView Imgview;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText1=findViewById(R.id.editText1);
        btn1 = (Button) findViewById((R.id.btn1));
        btn2 = (Button) findViewById((R.id.btn2));
        Rg = findViewById(R.id.Rg);
        R_btn1 = findViewById(R.id.Rbtn1);
        R_btn2 = findViewById(R.id.Rbtn2);
        Imgview = findViewById(R.id.imgView);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=editText1.getText().toString();
                Toast.makeText(getApplicationContext(), value,
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText1.getText().toString();
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(mIntent);
            }
        });

        Rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String result;
                int id = Rg.getCheckedRadioButtonId();
                if(id == R.id.Rbtn1){
                    Imgview.setImageResource(R.drawable.winter);
                }
                else
                    Imgview.setImageResource(R.drawable.want);
            }
        });



    }

}