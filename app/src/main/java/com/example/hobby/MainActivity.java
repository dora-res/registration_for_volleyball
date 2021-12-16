package com.example.hobby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button sign;
    TextView nameT, surnameT, otchT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        sign = findViewById(R.id.sign);
        nameT = findViewById(R.id.nameT);
        surnameT = findViewById(R.id.surnameT);
        otchT = findViewById(R.id.otchT);

    }
    public void Sign(View view) {
        String a = surnameT.getText().toString();
        String b = nameT.getText().toString();
        String c = otchT.getText().toString();
        String nameFull = name.getText().toString();
        class Delit {
            String[] splitting(String a) {
                return a.split(" ");
            }
        }
        Delit d = new Delit();
        String[] arr = d.splitting(nameFull);
        a+=arr[0] + "\n";
        b+=arr[1] + "\n";
        c+=arr[2] + "\n";

        surnameT.setText(a);
        nameT.setText(b);
        otchT.setText(c);
    }
}
