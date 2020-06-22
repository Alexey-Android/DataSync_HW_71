package com.example.datasync_hw_71;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MorningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);

        final TextView mtv_time_morning = findViewById(R.id.tv_time_morning);

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY HH:mm", Locale.getDefault());
        String date = sdf.format(Calendar.getInstance().getTime());
        mtv_time_morning.setText(date);

        SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String time = currentTime.format(Calendar.getInstance().getTime());

        Toast.makeText(this, "текущее время " + time, Toast.LENGTH_LONG).show();
    }
}
