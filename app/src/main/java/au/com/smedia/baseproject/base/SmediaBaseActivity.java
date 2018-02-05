package au.com.smedia.baseproject.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by puzhao on 2/2/18.
 */

public abstract class SmediaBaseActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    public abstract int getContainerId();
    public void openFragment(Fragment in){
        fragmentManager = getSupportFragmentManager();
        String fragmentName = in.getClass().getSimpleName();
        fragmentManager.beginTransaction().replace(getContainerId(), in, fragmentName).addToBackStack(fragmentName).commit();
    }
}
