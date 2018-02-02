package au.com.smedia.baseproject.ui.presenter;

import android.content.Context;

import au.com.smedia.baseproject.ui.contract.LoginContract;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by puzhao on 2/2/18.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View mView;
    private Context mContext;

    public LoginPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void subscribe(LoginContract.View view) {
        mView = view;
    }

    @Override
    public void unsubscribe() {
        mView = null;
    }

    @Override
    public void login() {

    }
}
