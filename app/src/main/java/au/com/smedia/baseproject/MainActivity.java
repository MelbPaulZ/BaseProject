package au.com.smedia.baseproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import au.com.smedia.baseproject.ui.presenter.LoginPresenter;
import au.com.smedia.baseproject.ui.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPresenter mainPresenter = new MainPresenter(getApplicationContext());
        mainPresenter.retriveLatestMagazines();

    }
}
