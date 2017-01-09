package toto.tags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import toto.tags.Tags.Tag;
import toto.tags.Tags.TagNote;

public class ActivityListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_list_view);

        final ListView listView = (ListView) findViewById(R.id.listview);
        List<Tag> values = new ArrayList<Tag>();
        values.add(new TagNote("Salut","Premier Tag"));
        values.add(new TagNote("YO!","2nd Tag"));
        values.add(new TagNote("Hey","Troisieme Tag"));
        values.add(new TagNote("Coucou","4eme Tag"));

        //creation et remplissage de la liste
        /*final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i< values.length; i++){
            list.add(values[i]);
        }*/
        final CustomAdapter adapter = new CustomAdapter(this, values);
        listView.setAdapter(adapter);
    }
}
