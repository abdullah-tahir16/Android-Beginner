package mycook.dell.example.com.myrecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import mycook.dell.example.com.myrecyclerview.R;

/**
 * Created by DELL on 8/6/2017.
 */

public class customviewholder extends RecyclerView.ViewHolder {
    TextView mTextView;
    TextView mCourse;
    ImageView mImageView;
    public customviewholder(View itemView) {
        super(itemView);
        mTextView=(TextView)itemView.findViewById(R.id.name);
        mCourse=(TextView)itemView.findViewById(R.id.course);
        mImageView=(ImageView)itemView.findViewById(R.id.img);
    }
}
