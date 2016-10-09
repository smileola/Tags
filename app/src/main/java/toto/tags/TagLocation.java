package toto.tags;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by Toto on 2016-09-21.
 */
public class TagLocation implements Tag {

    private  Context c;
    private String name;

    public TagLocation(String nom){

        this.name = nom;
        this.c = c;

    }
    @Override
    public void Affiche() {

    }

    @Override
    public void Execute(Context c, Intent intent) {

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Uri location = Uri.parse("geo:0,0?q= " + message);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        c.startActivity(mapIntent);

    }
}
