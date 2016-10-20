package toto.tags;

/**
 * Created by Toto on 2016-09-19.
 */
public abstract class Condition {
    //en faire une classe abstraite
    private boolean state = false;
	public void setState(boolean state){
        this.state = state;
    }
    public boolean getState(){
        return state;
    }
}
