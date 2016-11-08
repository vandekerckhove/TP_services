package android.vandeker.tp_services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

//TODO 2: Creer le service
public class MonService extends IntentService {

    public static int cpt;
    public static volatile boolean shouldContinue = true;

    public MonService() {
        super("MonService");
        cpt= 0 ;
    }


    //TODO 3: Implementer la gestion de requete
    @Override
    protected void onHandleIntent(Intent intent) {

        while (shouldContinue) {
            try {
                Thread.sleep(1000);
                cpt++;
            } catch (InterruptedException e) {}


        }
    }
}

