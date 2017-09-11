package mycook.dell.example.com.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import mycook.dell.example.com.myrecyclerview.adapter.CustomAdapter;
import mycook.dell.example.com.myrecyclerview.model.Student;

public class MainActivity extends AppCompatActivity {
RecyclerView mRecyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Student> mStudents=new ArrayList<>();
        mStudents.add(new Student("stu1","course1"));
        mStudents.add(new Student("stu2","course2"));
        mStudents.add(new Student("stu3","course3"));
        mStudents.add(new Student("stu4","course4"));
        mStudents.add(new Student("stu5","course5"));
        mStudents.add(new Student("stu6","course6"));
        mStudents.add(new Student("stu7","course7"));
        mStudents.add(new Student("stu8","course8"));
        mStudents.add(new Student("stu9","course9"));
        mStudents.add(new Student("stu10","course10"));
        mStudents.add(new Student("stu11","course11"));
        mStudents.add(new Student("stu12","course12"));
        mStudents.add(new Student("stu13","course13"));
        mStudents.add(new Student("stu14","course14"));
        mStudents.add(new Student("stu15","course15"));
        mStudents.add(new Student("stu16","course16"));

        mRecyclerView=(RecyclerView)findViewById(R.id.rv);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        CustomAdapter customAdapter=new CustomAdapter(mStudents);
        mRecyclerView.setAdapter(customAdapter);
        
    }
}
