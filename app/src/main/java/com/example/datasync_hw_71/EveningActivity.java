package com.example.datasync_hw_71;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class EveningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        final TextView mtv_time_evening = findViewById(R.id.tv_time_evening);

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY HH:mm", Locale.getDefault());
        String date = sdf.format(Calendar.getInstance().getTime());
        mtv_time_evening.setText(date);

        SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String time = currentTime.format(Calendar.getInstance().getTime());

        Toast.makeText(this, "текущее время " + time, Toast.LENGTH_LONG).show();
    }
}
