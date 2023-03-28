package com.duaa.myfirsttask;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.duaa.myfirsttask.databinding.ActivityDestinationBinding;
import com.google.android.material.snackbar.Snackbar;

public class Destination extends AppCompatActivity {
    ActivityDestinationBinding destinationBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        destinationBinding = ActivityDestinationBinding.inflate(getLayoutInflater());
        setContentView(destinationBinding.getRoot());

        //
        destinationBinding.returnthedata.setOnClickListener(v -> {
            Toast.makeText(this, "back to activity 1", Toast.LENGTH_LONG).show();
            destinationBinding.data.setText(R.string.app_name);
            destinationBinding.dataSentFromactivity1.setText(R.string.app_name);
            Snackbar.make(v, R.string.app_name, 0).setAction("ok", v1 -> Toast.makeText(this, "back to activty1", Toast.LENGTH_LONG).show()).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}