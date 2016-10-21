package toto.tags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ActivityListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_list_view);

        final ListView listView = (ListView) findViewById(R.id.listview);
        String [] values = new String[] {"Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" } ;

        //creation et remplissage de la liste
        /*final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i< values.length; i++){
            list.add(values[i]);
        }*/

        final CustomAdapter adapter = new CustomAdapter(this, values);
        listView.setAdapter(adapter);
    }
}
