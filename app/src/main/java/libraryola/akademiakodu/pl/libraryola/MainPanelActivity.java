package libraryola.akademiakodu.pl.libraryola;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.support.*;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static libraryola.akademiakodu.pl.libraryola.R.id.fragemntLayout;


public class MainPanelActivity extends Activity
{

    @BindView(R.id.AddBook)
    Button buttonAddbook;
    @BindView(R.id.MainWindow)
    Button buttonMainWindow;
    @BindView(R.id.LoanBooks)
    Button buttonLoanBooks;
    @BindView(R.id.LoanStatus)
    Button buttonLoanStatus;
    @BindView(R.id.LogOut)
    Button buttonLogOut;
    @BindView(fragemntLayout)
    FrameLayout fragmentLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_panel);

        ButterKnife.bind(this);
       

      




    }

    @OnClick(R.id.LogOut)
    public void OnClickLogOut()
    {
        Intent n = new Intent(MainPanelActivity.this, MainActivity.class);
        startActivity(n);

    }

    @OnClick(R.id.MainWindow )
    public void OnClickMainWindow(View v)
    {
        //TODO ogarnac fragmenty
        FragmentActivity f= new FragmentActivity();
       // Intent i = new Intent(this,NewBook.class);


       // f.startActivity(i);

        FragmentManager fragmentManager = f.getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();

        ft.commit();



        f.getSupportFragmentManager().beginTransaction().add(fragemntLayout, new NewBook()).commit();




    }



}
