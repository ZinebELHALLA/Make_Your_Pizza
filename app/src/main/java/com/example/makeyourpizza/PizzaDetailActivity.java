package com.example.makeyourpizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.makeyourpizza.R;

public class PizzaDetailActivity extends AppCompatActivity {
    private ImageView pizzaImage;
    private TextView pizzaName;
    private TextView ingredientsContent;
    private TextView pizzaDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Find views
        pizzaImage = findViewById(R.id.pizzaImage);
        pizzaName = findViewById(R.id.pizzaName);
        ingredientsContent = findViewById(R.id.ingredientsContent);
        pizzaDescription = findViewById(R.id.pizzaDescription);

        // Get data from intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("Nom de la recette");
        int imageResId = intent.getIntExtra("image", 0);
        String preparationMethod = intent.getStringExtra("description");

        // Set data to views
        pizzaImage.setImageResource(imageResId);
        pizzaName.setText(name);
        ingredientsContent.setText(getIngredients(preparationMethod));
        pizzaDescription.setText(getSteps(preparationMethod));
    }

    // Helper methods to parse the preparation method
    private String getIngredients(String preparationMethod) {
        String[] lines = preparationMethod.split("\n\n"); // Split into ingredients and steps
        return lines[0]; // First part is ingredients
    }

    private String getSteps(String preparationMethod) {
        String[] lines = preparationMethod.split("\n\n");
        return lines[1]; // Second part is steps
    }
}
