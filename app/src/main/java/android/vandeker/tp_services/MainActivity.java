package android.vandeker.tp_services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button startBtn;
    private Button getBtn;
    private Button stopBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Demarrage du service
        startBtn = (Button) findViewById(R.id.button_start);

        startBtn.setOnClickListener( new View.OnClickListener()
        {

            @Override
            public void onClick(View v){
                MonService.shouldContinue = true;
                //TODO 4: Demarrer le service
                Intent intent = new Intent(MainActivity.this, MonService.class);
                startService(intent);
            }
        });

        //Affichage du compteur
        getBtn = (Button) findViewById(R.id.button_get);

        getBtn.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), MonService.cpt +"", Toast.LENGTH_SHORT).show();

            }
        });

        //Arret du service
        stopBtn = (Button) findViewById(R.id.button_stop);

        stopBtn.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                MonService.shouldContinue = false;
                //TODO 5: Arreter le service
                Intent intent = new Intent(MainActivity.this, MonService.class);
                stopService(intent);

            }
        });
    }
}