package com.example.ourcafe;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StaffActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser == null) {
            // Redirect to LoginActivity if user is not logged in
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        // If logged in, show the staff page content
        WebView webViewer = findViewById(R.id.web);
        webViewer.loadUrl("file:///android_asset/www/index.html");
    }
}
