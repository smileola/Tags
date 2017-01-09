package toto.tags.Tags;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toto on 2016-09-19.
 */
public interface Tag {
    public String nom = "les tags";
    public List conditions = new ArrayList();

    //public void Update();
    //Context c, Intent intent
    public void Affiche();
    public void Execute();
    public String getTitre();
    public String getContenu();
}
