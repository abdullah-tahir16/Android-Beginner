package company.starbuzzapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Abdullah Tahir on 7/30/2017.
 */

public class DrinkCategoryActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);
        ArrayList<items> i = new ArrayList<items>();
        i.add(new items(R.drawable.black , "Black Coffee"));
        i.add(new items(R.drawable.cap , "Cappuccino"));
        i.add(new items(R.drawable.latte , "Latte"));
        i.add(new items(R.drawable.exp , "Expresso"));



        WordAdapter itemsAdapter = new WordAdapter(this, i);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);









    }

}
