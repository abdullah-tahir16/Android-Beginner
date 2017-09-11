package company.starbuzzapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abdullah Tahir on 7/30/2017.
 */

public class WordAdapter extends ArrayAdapter<items>{




    public WordAdapter( Context context, ArrayList<items> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.drink_layout, parent, false);
        }


        items currentWord = getItem(position);


        TextView mTextView = (TextView) listItemView.findViewById(R.id.textView);

        mTextView.setText(currentWord.getName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);

        imageView.setImageResource(currentWord.getmImageResourceId());

        if (currentWord.hasImage()) {

            imageView.setImageResource(currentWord.getmImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        } else {

            imageView.setVisibility(View.GONE);
        }




        return listItemView;
    }
}
