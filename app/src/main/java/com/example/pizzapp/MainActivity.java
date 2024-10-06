package com.example.pizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.pizzapp.adapter.PizzaAdapter;
import com.example.pizzapp.beans.PizzaBeans;
import com.example.pizzapp.services.PizzaService;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private PizzaService ps = null;
    private PizzaAdapter adapter;
    private ListView list;
    private List<PizzaBeans> pizzaList;
    private Button themeToggleButton;
    private boolean isDarkTheme = true; // Démarrer avec le thème sombre

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Trouver les vues
        themeToggleButton = findViewById(R.id.theme_toggle_button);
        list = findViewById(R.id.list);

        // Initialiser PizzaService et charger les données des pizzas
        ps = new PizzaService();
        loadPizzaData();

        // Configurer l'adaptateur pour la ListView
        pizzaList = ps.findAll();
        adapter = new PizzaAdapter(pizzaList, this);
        list.setAdapter(adapter);

        // Écouteur de clic pour les éléments de la ListView
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                PizzaBeans pizza = (PizzaBeans) adapter.getItem(position);
                Intent intent = new Intent(MainActivity.this, PizzaDetailActivity.class);
                intent.putExtra("Nom de la recette", pizza.getNom());
                intent.putExtra("prix", pizza.getPrix());
                intent.putExtra("image", pizza.getImage());
                intent.putExtra("Temps de préparation", pizza.getTemps());
                intent.putExtra("description", pizza.getPreparationMethod());
                startActivity(intent);
            }
        });

        // Écouteur de clic pour le bouton de changement de thème
        themeToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleTheme();
            }
        });
    }

    // Méthode pour charger les données des pizzas
    private void loadPizzaData() {
        ps.create(new PizzaBeans("Pizza Margherita", 20, R.drawable.margherita, "15",
                "- Sauce tomate\n- Mozzarella\n- Basilic\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et le basilic.\n4. Cuire au four pendant 10-15 minutes."));

        ps.create(new PizzaBeans("Pizza Végétarienne", 30, R.drawable.veggie, "18","- Sauce tomate\n- Mozzarella\n- Légumes variés (poivrons, oignons, champignons)\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et les légumes variés.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Pepperoni", 30, R.drawable.pepperroni, "20",
                "- Sauce tomate\n- Mozzarella\n- Pepperoni\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et le pepperoni.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza à la viande", 40, R.drawable.meat, "22",
                "- Sauce tomate\n- Mozzarella\n- Viande hachée\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et la viande hachée cuite.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza au poulet", 35, R.drawable.chicken, "18",
                "- Sauce tomate\n- Mozzarella\n- Poulet rôti\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et le poulet rôti.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Hawaïenne", 45, R.drawable.hawaiin, "20",
                "- Sauce tomate\n- Mozzarella\n- Jambon\n- Ananas\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella, le jambon et l'ananas.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Buffalo", 40, R.drawable.buffalo, "25",
                "- Sauce tomate\n- Mozzarella\n- Poulet sauce Buffalo\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et le poulet Buffalo.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Suprême", 30, R.drawable.supreme, "25",
                "- Sauce tomate\n- Mozzarella\n- Viande hachée, pepperoni, légumes\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella, la viande, le pepperoni et les légumes.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Californienne", 35, R.drawable.california, "18",
                "- Sauce tomate\n- Mozzarella\n- Avocat, légumes variés\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et les légumes variés.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Grecque", 35, R.drawable.greek, "22",
                "- Sauce tomate\n- Mozzarella\n- Feta, olives, oignons\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella, la feta, les olives et les oignons.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Marinara", 40, R.drawable.marinara, "12",
                "- Sauce tomate\n- Ail, origan, huile d'olive\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter l'ail, l'origan et arroser d'huile d'olive.\n4. Cuire au four pendant 15-20 minutes."));

        ps.create(new PizzaBeans("Pizza Diavola", 40, R.drawable.diavola, "20",
                "- Sauce tomate\n- Mozzarella\n- Salami épicé\n\n1. Préchauffer le four à 220°C (425°F).\n2. Étaler la sauce tomate sur la base de la pizza.\n3. Ajouter la mozzarella et le salami épicé.\n4. Cuire au four pendant 15-20 minutes."));
    }

    // Méthode pour changer de thème
    private void toggleTheme() {
        if (isDarkTheme) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            isDarkTheme = false; // Maintenant c'est le thème clair
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            isDarkTheme = true; // Maintenant c'est le thème sombre
        }
    }
}
