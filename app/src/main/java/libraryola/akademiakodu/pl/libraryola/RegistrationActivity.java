package libraryola.akademiakodu.pl.libraryola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistrationActivity extends AppCompatActivity {

    @BindView(R.id.buttonRegisterNewUser)
    Button buttonRegisterNewUser;
    @BindView(R.id.checkBoxModerator)
    CheckBox checkBoxModerator;
    @BindView(R.id.editLogingReg)
    EditText editLoginText;
    @BindView(R.id.editPasswordReg)
    EditText editPasswordReg;
    @BindView(R.id.editPasswordRepeat)
    EditText editPasswordRepeat;
    @BindView(R.id.editTextTelefon)
    EditText editTextTelefon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);







    }
    @OnClick(R.id.buttonRegisterNewUser)
    public void OnClickbuttonRegisterNewUser()
    {

        //TODO dowanie uzytkownia do bazy danych
        //TODO sprawdzenie czy podany login jest wolny w bd
        // TODO sprawdzenie czy hasla sie zgadzaja

    }
}
