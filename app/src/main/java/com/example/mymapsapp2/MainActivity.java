package com.example.mymapsapp2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main); // Plus nécessaire si aucun UI spécifique dans MainActivity

        // Démarrer directement MapsActivity
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

        // Fermer MainActivity une fois que MapsActivity est lancée
        finish();
    }
}
