package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SecondPage extends AppCompatActivity {
    TextView name;
    private Button btn;

    List<String> names = Arrays.asList("Gargi", "jinal", "Tushar", "Dhruv", "Shikha");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        name = (TextView) findViewById(R.id.rand_name);
        Random rand = new Random();
        String randomName = names.get(rand.nextInt(names.size()));
        name.setText(randomName);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}