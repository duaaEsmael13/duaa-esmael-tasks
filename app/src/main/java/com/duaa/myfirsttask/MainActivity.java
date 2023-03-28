package com.duaa.myfirsttask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Toast;

import com.duaa.myfirsttask.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        //
        mainBinding.goToActivty2.setOnClickListener(v -> {
            Toast.makeText(this, "go to activity 2", Toast.LENGTH_LONG).show();
            mainBinding.editText.setText(R.string.app_name);
            mainBinding.textData.setText(R.string.app_name);
            Snackbar.make(v, R.string.app_name, -2).setAction("ok", v1 -> {
                Toast.makeText(this, "go to activty2", Toast.LENGTH_LONG).show();
            }).show();
            Intent intent = new Intent(this, Destination.class);
            startActivity(intent);
        });
//

    }
}
