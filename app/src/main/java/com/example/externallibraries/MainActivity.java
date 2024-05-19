package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    /* =============== VARIABLES =============== */
    private ImageView imageView;
    // Returns a random image every time the linked is accessed
    private String randomImage = "https://picsum.photos/600/900";
    /* ========================================= */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to image
        imageView = findViewById(R.id.imageView);
        // Using Picasso, update the image
        Picasso.with(this).load(randomImage).into(imageView);
    }
}
