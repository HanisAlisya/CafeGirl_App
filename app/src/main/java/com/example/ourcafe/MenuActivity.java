package com.example.ourcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the menu layout with the GridView
        setContentView(R.layout.activity_menu);

        // Initialize the GridView and set the adapter
        GridView gridView = findViewById(R.id.gridView);
        if (gridView != null) {
            // Set the adapter for the GridView (ensure ImageAdapter is correctly implemented)
            gridView.setAdapter(new ImageAdapter(this));
        }
        // Add click listener for the map button
        findViewById(R.id.map_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMapsActivity();
            }
        });
    }

    // Method to open MapActivity
    private void openMapsActivity() {
        Intent intent = new Intent(MenuActivity.this, MapsActivity.class);
        startActivity(intent);
    }

    // Method to open StaffActivity
    public void openStaffActivity(View view) {
        Intent intent = new Intent(this, StaffActivity.class);
        startActivity(intent);
    }

}

