package com.example.ourcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the main layout
    }

    // Method to open the RegisterActivity
    public void openRegister(View v) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    // Method to open the MenuActivity after successful login
    public void openLogin(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void openMenu(View v) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    // Method to open MapsActivity (for the "Show Location" button)
    public void openMapsActivity(View v) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }

    // Method to open StaffActivity (for the "staff" button)
    public void openStaffActivity(View v) {
        Intent intent = new Intent(MainActivity.this, StaffActivity.class);
        startActivity(intent);
    }


}

