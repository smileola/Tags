package toto.tags.Tags;

import toto.tags.Tags.Tag;

/**
 * Created by Toto on 2016-09-21.
 */
public class TagNote implements Tag {
    private String  titre, contenu; //modifier contenu en fonction de l'utilite du tag

    public TagNote(String titre, String contenu){
        this.titre=titre;
        this.contenu = contenu;
    }
    @Override
    public void Affiche() {

    }

    @Override
    public void Execute() {

    }

    public String getContenu() {
        return contenu;
    }

    public String getTitre() {
        return titre;
    }
}
