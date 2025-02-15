package com.example.ourcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ourcafe.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseUser user;
    TextView profileText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        auth = FirebaseAuth.getInstance();
        profileText = findViewById(R.id.textView);
        user = auth.getCurrentUser();

        if (user != null) {
            profileText.setText(user.getEmail());
        } else {
            profileText.setText("No user is logged in");
        }
    }

    public void signout(View v) {
        auth.signOut();
        finish();
        Intent i = new Intent(this, com.example.ourcafe.MainActivity.class);
        startActivity(i);
    }
}
