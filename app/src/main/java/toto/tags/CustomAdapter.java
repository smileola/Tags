package toto.tags;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Toto on 2016-09-21.
 */
public class CustomAdapter extends ArrayAdapter <String> {

    private final Context context;
    private final String[] values;

    public CustomAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // on cree un inflater a partir de notre contexte
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Linking Elements with parts of the view
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
        TextView firstLine = (TextView) rowView.findViewById(R.id.first_line_row);
        TextView secondLine = (TextView) rowView.findViewById(R.id.second_line_row);

        firstLine.setText("LOL");
        secondLine.setText("MDR");

        return rowView;
    }
}
