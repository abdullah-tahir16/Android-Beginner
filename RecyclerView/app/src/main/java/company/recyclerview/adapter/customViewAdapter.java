package company.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import company.recyclerview.R;

/**
 * Created by Abdullah Tahir on 8/13/2017.
 */

public class customViewAdapter extends RecyclerView.ViewHolder {

    TextView mTextView;
    TextView age;

    public customViewAdapter(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.name);
        age = (TextView) itemView.findViewById(R.id.age);
    }
}

