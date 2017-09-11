package company.starbuzzapplication;

/**
 * Created by Abdullah Tahir on 7/30/2017.
 */

public class items {


    private String name;
    private int mImageResourceId;


    public items(int mImageResourceId, String name) {
        this.name = name;
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != -1;
    }
}
