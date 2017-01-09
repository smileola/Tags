package toto.tags.Factory;

import android.content.Context;
import android.content.Intent;

import toto.tags.Tags.*;

/**
 * Created by Agent on 1/9/2017.
 */

public abstract class AbsTagFactory {
    private static final ConTagFactory tagFactory = new ConTagFactory();

    static final AbsTagFactory getFactory(){
        return tagFactory;
    }
    public abstract TagNote createTagNote();
    public abstract TagLocation createTagLocation(String location, Context c, Intent i);
}
