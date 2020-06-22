package com.example.datasync_hw_71;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        Button mbutton_sync = findViewById(R.id.button_sync);

        mbutton_sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SimpleDateFormat hourFormat = new SimpleDateFormat("HH", Locale.getDefault());
                String hour = hourFormat.format(Calendar.getInstance().getTime());
                final int h = Integer.parseInt(hour);

                Intent intent = new Intent(Intent.ACTION_SYNC);

                if (h >= 6 && h < 14) {
                    intent.setData(Uri.parse("http://morning"));
                } else if (h == 14) {
                    intent.setData(Uri.parse("http://afternoon"));
                } else {
                    intent.setData(Uri.parse("http://evening"));
                }

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
