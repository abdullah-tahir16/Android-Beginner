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



public class LoginForm extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_form);
        final EditText inputTxt = (EditText) findViewById(R.id.email);
        final EditText inputTxt2 = (EditText) findViewById(R.id.pwd);
        final Button button = (Button) findViewById(R.id.button);



        Context context = getApplicationContext();
        CharSequence text = "You have Successfully logged in";
        CharSequence text2 = "Incorrect Email or password";
        int duration = Toast.LENGTH_SHORT;

        final Toast toast = Toast.makeText(context,
                context.getResources().getString(R.string.toostMessage),
                Toast.LENGTH_SHORT);
        final Toast toast2 = Toast.makeText(context,
                context.getResources().getString(R.string.toostMessage2),
                Toast.LENGTH_SHORT);


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                 String str = inputTxt.getText().toString();
                 String str2 = inputTxt2.getText().toString();
                if (str.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches() || !(str2.length()>=8)) {

                    toast2.show();

                }
                else
                {
                    toast.show();
                }



            }
        });

        final TextView login = (TextView)findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Signup = new Intent(LoginForm.this, SignupActivity.class);
                startActivity(Signup);

            }
        });

    }
}


