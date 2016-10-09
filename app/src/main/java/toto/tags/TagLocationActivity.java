package toto.tags;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;


public class TagLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_location);

        Execute();
    }


    public void Affiche() {

    }


    public void Execute() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Uri location = Uri.parse("geo:0,0?q= " + message);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

        //verifier si l'intent est sure
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(mapIntent,PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;

        startActivity(mapIntent);
    }
}
