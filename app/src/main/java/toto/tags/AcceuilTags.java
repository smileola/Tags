package toto.tags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class AcceuilTags extends AppCompatActivity {

    final ListView TagsView = (ListView) findViewById(R.id.listview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil_tags);
    }

    protected void prepareAdapter(){
        //Placeholder should access a list with a number of tags
        String [] values = new String[] {"Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };
        final CustomAdapter adapter = new CustomAdapter(this, values);
        TagsView.setAdapter(adapter);
    }
}
