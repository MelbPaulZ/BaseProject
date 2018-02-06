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

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentByTag(MainFragment.class.getSimpleName());
        if (mainFragment == null) {
            mainFragment = new MainFragment();
            mainFragment.setPresenter(new MainPresenter(getApplicationContext()));
            getSupportFragmentManager().beginTransaction().add(getContainerId(),mainFragment, MainFragment.class.getSimpleName()).commit();
        }


    }

    @Override
    public int getContainerId() {
        return R.id.smedia_fragment_container;
    }
}
