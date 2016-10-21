package toto.tags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class AcceuilTags extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil_tags);

        final ListView TagsView = (ListView) findViewById(R.id.listview);
        TagsView.setAdapter(prepareAdapter());
    }

    private CustomAdapter prepareAdapter(){
        //Placeholder should access a list with a number of tags
        String [] values = new String[] {"Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };
        CustomAdapter adapter = new CustomAdapter(this, values);
        return adapter;
    }
}
