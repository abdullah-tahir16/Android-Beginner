package company.coffeeorderapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    double white = 6.50;
    double black= 6.25;
    int WhiteQty= 0;
    int BlackQty= 0;
    double WhiteTotal=0;
    double BlackTotal=0;
    EditText name;
    TextView blackcheck;
    String whip= "";
    String chocolates = "";
    TextView whitecheck;
    String whips= "";
    String chocolatess = "";
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    
public void calculate(View v){

switch (v.getId()){
    case R.id.whiteInc:
        if (WhiteTotal>=0 && WhiteQty>=0){
        WhiteTotal+=white;
        WhiteQty++;}
        else {
            WhiteTotal=0;
            WhiteQty=0;
            DisplayWhite(WhiteTotal, WhiteQty);
        }
    break;

    case R.id.whiteDec:
        if (WhiteTotal>=0 && WhiteQty>=0){
        WhiteTotal-=white;
        WhiteQty--;
        }
        else {
            WhiteTotal=0;
            WhiteQty=0;
            DisplayWhite(WhiteTotal, WhiteQty);
        }
        break;
    case R.id.blackInc:
        if (BlackTotal>=0 && BlackQty>=0) {
            BlackTotal += black;
            BlackQty++;
        }
        else{
            BlackQty= 0;
            BlackTotal=0;
            DisplayBlack(BlackTotal, BlackQty);
        }
        break;
    case R.id.blackDec:
        if (BlackTotal>=0 && BlackQty>=0) {
            BlackTotal -= black;
            BlackQty--;
        }
        else{
        BlackQty= 0;
        BlackTotal=0;
        DisplayBlack(BlackTotal, BlackQty);
    }
        break;

    default:
        break;


}
    DisplayWhite(WhiteTotal, WhiteQty);
    DisplayBlack(BlackTotal, BlackQty);
}
    public void DisplayWhite(double a , int b) {
        TextView Cost = (TextView) findViewById(R.id.whiteQty);
        Cost.setText(String.valueOf(b));
        TextView Quantity = (TextView) findViewById(R.id.whiteCost);
        Quantity.setText(String.valueOf(a));
    }

    public void DisplayBlack(double a , int b) {
        TextView Cost = (TextView) findViewById(R.id.blackQty);
        Cost.setText(String.valueOf(b));
        TextView Quantity = (TextView) findViewById(R.id.blackCost);
        Quantity.setText(String.valueOf(a));
    }
    public void bill(View view){
        name= (EditText)findViewById(R.id.Name);
        String Name = name.getText().toString();
        TextView Username = (TextView)findViewById(R.id.printname);
        TextView TotalBill= (TextView)findViewById(R.id.Total);
        double total = WhiteTotal+BlackTotal;
        b = (Button)findViewById(R.id.button);
        whitecheck = (TextView)findViewById(R.id.whitecheck);
        blackcheck = (TextView)findViewById(R.id.blackCheck);
        switch (view.getId()){
            case R.id.button:
            {
                Username.setText("Customer Name: "+Name);
                TotalBill.setText("Black Coffee: "+BlackQty+" White Coffee: "+WhiteQty+" Total Cost: "+total);
                blackcheck.setText("Black Coffee: "+whip+" "+chocolates);
                whitecheck.setText("White Coffee: "+whips+" "+chocolatess);
            }

        }


    }

    public void ForBlack(View v) {
        // Is the view now checked?
        boolean whipped = ((CheckBox) v).isChecked();
        boolean chocolate = ((CheckBox) v).isChecked();



        // Check which checkbox was clicked
        switch(v.getId()) {
            case R.id.checkBox4:
                if (whipped) {
                    whip = "Whipped Topping is Added";
                } else
                    whip = "Whipped Topping is  Not Added";
                break;
        }
        switch(v.getId()) {
            case R.id.checkBox5:
                if (chocolate) {
                    chocolates = "Chocolate is Added ";
                } else
                    chocolates = "Chocolate is Not Added ";
                break;

        }


    }

    public void ForWhite(View v) {
        // Is the view now checked?
        boolean whipped = ((CheckBox) v).isChecked();
        boolean chocolate = ((CheckBox) v).isChecked();
        whitecheck = (TextView)findViewById(R.id.whitecheck);


        // Check which checkbox was clicked
        switch(v.getId()) {
            case R.id.checkBox:
                if (whipped) {
                    whips = "Whipped Topping is Added";
                } else
                    whips = "Whipped Topping is  Not Added";
                break;
        }
        switch(v.getId()) {
            case R.id.checkBox2:
                if (chocolate) {
                    chocolatess = "Chocolate is Added ";
                } else
                    chocolatess = "Chocolate is Not Added ";
                break;

        }

    }
}
