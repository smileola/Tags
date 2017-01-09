package toto.tags.Tags;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import toto.tags.MainActivity;
import toto.tags.Tags.Tag;

/**
 * Created by Toto on 2016-09-21.
 */
public class TagLocation implements Tag {

    private  Context c;
    private Intent i;
    private String location;
    // think about the constructors
    public TagLocation(String location, Context c, Intent i){

        this.location = location;
        this.c = c;
        this.i = i;
    }
    @Override
    public void Affiche() {

    }

    @Override
    public String getTitre() {
        return null;
    }

    @Override
    public String getContenu() {
        return null;
    }


    public void Execute() {
        String message = i.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Uri location = Uri.parse("geo:0,0?q= " + this.location);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        c.startActivity(mapIntent);
    }
}
