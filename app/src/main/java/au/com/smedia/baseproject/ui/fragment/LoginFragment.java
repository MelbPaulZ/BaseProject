package au.com.smedia.baseproject.ui.fragment;

import android.support.v4.app.Fragment;

import au.com.smedia.baseproject.base.BasePresenter;
import au.com.smedia.baseproject.ui.contract.LoginContract;

/**
 * Created by puzhao on 2/2/18.
 */

public class LoginFragment extends Fragment implements LoginContract.View {
    public static final String ARGUMENT_LOGIN_ID = "LOGIN_ID";
    private LoginContract.Presenter presenter;

    public static LoginFragment newInstance(){
        return new LoginFragment();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.unsubscribe();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.subscribe(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showInvalidError() {

    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
