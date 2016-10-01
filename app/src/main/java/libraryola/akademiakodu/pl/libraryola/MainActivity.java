package libraryola.akademiakodu.pl.libraryola;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    String login = "a";
    String password= "a";

    @BindView(R.id.buttonLogin)
    Button buttonLogin;
    @BindView(R.id.buttonRegister)
    Button buttonRegister;

    @BindView(R.id.LoginEditText)
    EditText LoginEditText;
    @BindView(R.id.PasswordEditText)
    EditText PasswordEditText;

    @BindView(R.id.checkBoxRemeber)
    CheckBox checkBoxRemember;

    @BindView(R.id.textPassword)
    TextView textPassword;
    @BindView(R.id.textViewLogin)
    TextView textViewLogin;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.buttonLogin)
    public void OnClickbuuttonLogin(){
        String localogin =LoginEditText.getText().toString();
        String localPassword= PasswordEditText.getText().toString();



        if(localogin.equals(login)&&localPassword.equals(password))
        {

            Toast.makeText(this, "Brawo, proces logowanie przebiegl pomyslnie", Toast.LENGTH_LONG).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent n = new Intent(MainActivity.this, MainPanelActivity.class);
                    startActivity(n);
                }
            }, 2000);


        }
        else
            Toast.makeText(this,"Niestety podane dane nie sa prawidlowe, sprobuj ponownie lub zarejestruj sie jako nowy uzytkownik",Toast.LENGTH_LONG).show();



    }

    @OnClick(R.id.buttonRegister)
    public void OnClickbuttonRegister()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(i);
            }
        }, 2000);
    }


}
