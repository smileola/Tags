package toto.tags.Factory;

import android.content.Context;
import android.content.Intent;

import toto.tags.Tags.TagLocation;
import toto.tags.Tags.TagNote;

/**
 * Created by Agent on 1/9/2017.
 */

public class ConTagFactory extends AbsTagFactory {

    @Override
    public TagNote createTagNote() {
        return null;
    }

    @Override
    public TagLocation createTagLocation(String location, Context c, Intent i) {
        // ABILITY TO OVERRIDE
        return new TagLocation(location,c,i);
    }
}
