package com.example.thinkpad.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.app_name, Toast.LENGTH_LONG);
        toast.show();

    }

    public void countUp(View view) {
        TextView count = (TextView) findViewById(R.id.teks);
        int value = Integer.parseInt(count.getText().toString());
        value++;
        count.setText(""+value);
    }
}
