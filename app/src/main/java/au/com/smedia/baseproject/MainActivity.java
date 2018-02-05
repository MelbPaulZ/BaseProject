package au.com.smedia.baseproject;

import android.os.Bundle;

import au.com.smedia.baseproject.base.SmediaBaseActivity;
import au.com.smedia.baseproject.ui.fragment.MainFragment;
import au.com.smedia.baseproject.ui.presenter.MainPresenter;


public class MainActivity extends SmediaBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            MainFragment mainFragment = new MainFragment();
            mainFragment.setPresenter(new MainPresenter(getApplicationContext()));
            getSupportFragmentManager().beginTransaction().add(getContainerId(), mainFragment).commit();
        }


    }

    @Override
    public int getContainerId() {
        return R.id.smedia_fragment_container;
    }
}
