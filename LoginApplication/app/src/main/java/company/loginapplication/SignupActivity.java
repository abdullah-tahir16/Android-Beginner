package company.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        final EditText inputTxt = (EditText) findViewById(R.id.email);
        final EditText inputTxt2 = (EditText) findViewById(R.id.pwd);
        final EditText inputTxt3 = (EditText) findViewById(R.id.name);
        final Button button = (Button) findViewById(R.id.sign);

        Context context = getApplicationContext();
        CharSequence text = "You have been signed up Successfully";
        int duration = Toast.LENGTH_SHORT;

        final Toast toast = Toast.makeText(context,
                context.getResources().getString(R.string.signup_message),
                Toast.LENGTH_SHORT);
        final Toast toast2 = Toast.makeText(context,
                context.getResources().getString(R.string.incorrect_sign),
                Toast.LENGTH_SHORT);


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String str = inputTxt.getText().toString();
                String str2 = inputTxt2.getText().toString();
                String str3 = inputTxt2.getText().toString();
                if (str.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches() || !(str2.length()>=8) || !(str3.length()>=4)) {

                    toast2.show();

                }
                else
                {
                    toast.show();
                }



            }
        });



        final TextView login = (TextView)findViewById(R.id.already);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(SignupActivity.this, LoginForm.class);
                startActivity(Login);

            }
        });

    }


}
