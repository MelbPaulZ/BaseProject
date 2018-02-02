package au.com.smedia.baseproject.ui.contract;

import au.com.smedia.baseproject.base.BasePresenter;
import au.com.smedia.baseproject.base.BaseView;

/**
 * Created by puzhao on 2/2/18.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter>{
        void showLoading();
        void hideLoading();
        void showInvalidError();

    }

    interface Presenter extends BasePresenter<View>{
        void login();
    }
}
