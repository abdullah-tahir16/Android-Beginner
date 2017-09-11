package mycook.dell.example.com.myrecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mycook.dell.example.com.myrecyclerview.R;
import mycook.dell.example.com.myrecyclerview.model.Student;

/**
 * Created by DELL on 8/6/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<customviewholder> {
ArrayList<Student> mStudents;

    public CustomAdapter(ArrayList<Student> students) {
        mStudents = students;
    }

    @Override
    public customviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false);
        customviewholder customviewholder=new customviewholder(itemview);
        return customviewholder;
    }

    @Override
    public void onBindViewHolder(customviewholder holder, int position) {
Student student=mStudents.get(position);
        holder.mTextView.setText(student.getUsername());
        holder.mCourse.setText(student.getCourse());
        holder.mImageView.setImageResource(R.drawable.latte);
    }

    @Override
    public int getItemCount() {
        return mStudents.size();
    }
}
