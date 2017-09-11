package company.starbuzzapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this,
                                    DrinkCategoryActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setOnItemClickListener(itemClickListener);





    }
}
