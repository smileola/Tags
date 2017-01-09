package toto.tags;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import toto.tags.Tags.Tag;

import static android.graphics.Color.parseColor;

/**
 * Created by Toto on 2016-09-21.
 */
public class CustomAdapter extends ArrayAdapter <Tag> {

    private final Context context;
    private  List<Tag> values = new ArrayList<Tag>();

    public CustomAdapter(Context context, List<Tag> values) {
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

        Tag item = getItem(position);
        if (item != null){
        String[] colorArray ={"#167676", "#51657E","#BF7793","#F1E8E8"};
            Random rand = new Random();
            int randomNum = rand.nextInt(4);
            rowView.setBackgroundColor(parseColor(colorArray[randomNum]));
            firstLine.setText(item.getTitre());
            secondLine.setText(item.getContenu());
        }
        return rowView;
    }
}
