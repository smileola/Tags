package toto.tags;

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

    public void Affiche();
    public void Execute(Context c, Intent intent);
}
