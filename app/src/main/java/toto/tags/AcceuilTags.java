package toto.tags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import toto.tags.Tags.Tag;
import toto.tags.Tags.TagNote;

public class AcceuilTags extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil_tags);

        final ListView TagsView = (ListView) findViewById(R.id.listview);
        TagsView.setAdapter(prepareAdapter());
    }

    private CustomAdapter prepareAdapter(){
        List<Tag> values = new ArrayList<Tag>();
        values.add(new TagNote("Salut","Premier Tag"));
        values.add(new TagNote("YO!","2nd Tag"));
        values.add(new TagNote("Hey","Troisieme Tag"));
        values.add(new TagNote("Coucou","4eme Tag"));
        final CustomAdapter adapter = new CustomAdapter(this, values);
        return adapter;
    }
}
