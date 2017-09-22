package company.pagetabstrip;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewpager = (ViewPager)findViewById(R.id.viewpager);

        ArrayList<Fragment> fragments = new ArrayList<>();
        Fragment firstFragment = new Fragment();
        fragments.add(firstFragment);
    }
}
