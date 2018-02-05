package au.com.smedia.baseproject.ui.presenter;

import android.content.Context;
import android.util.Log;

import java.util.List;

import au.com.smedia.baseproject.bean.SmediaIssue;
import au.com.smedia.baseproject.manager.DBManager;
import au.com.smedia.baseproject.restfulapi.MagazineApi;
import au.com.smedia.baseproject.restfulresponse.HttpResult;
import au.com.smedia.baseproject.restfulresponse.SmediaResponseTitle;
import au.com.smedia.baseproject.ui.contract.MainFragmentContract;
import au.com.smedia.baseproject.ui.fragment.MainFragment;
import au.com.smedia.baseproject.url.SampleUrlFactory;
import au.com.smedia.baseproject.util.HttpUtil;
import au.com.smedia.baseproject.util.SmediaUtil;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by puzhao on 2/2/18.
 */

public class MainPresenter implements MainFragmentContract.Presenter {

    private static final String TAG = MainPresenter.class.getSimpleName();
    private MainFragmentContract.View mView;
    private MagazineApi mMagazineApi;
    private Context mContext;

    public MainPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void subscribe(MainFragmentContract.View view) {
        mView = view;
        retriveLatestMagazines();
    }

    @Override
    public void unsubscribe() {
        mView = null;
    }

    @Override
    public void retriveLatestMagazines() {
        if (mMagazineApi == null){
            mMagazineApi = HttpUtil.createService(mContext, MagazineApi.class, new SampleUrlFactory().getBaseUrl());
        }
        Observable<HttpResult<SmediaResponseTitle>> observable = mMagazineApi.retrieveLatest("4353453453453453", "demo@smedia.com.au");
        Observer<HttpResult<SmediaResponseTitle>> observer = new Observer<HttpResult<SmediaResponseTitle>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(HttpResult<SmediaResponseTitle> smediaResponseTitleHttpResult) {
                Log.i(TAG, "onNext: ");
                SmediaResponseTitle title = smediaResponseTitleHttpResult.getTitles()[0];
                String production = title.getProduction();
                List<SmediaResponseTitle.SmediaIssues> issueList = title.getMagazines();
                SmediaIssue issue = issueList.get(0).getIssue();
                Log.i(TAG, "onNext: ");

//                List<SmediaResponseTitle.SmediaIssues> magazineList = title.getMagazines();
                DBManager.getInstance(mContext).saveOrReplaceMagazine(issue);
                SmediaIssue getIssue = DBManager.getInstance(mContext).getMagazine(issue.getId());
                if (mView!=null){
                    String bigThumbImage = SmediaUtil.thumbNailToBigImage(issue.getCover());
                    mView.updateMainIssueView(bigThumbImage, production, issue.getDescription());
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "onComplete: ");
            }
        };
        HttpUtil.subscribe(observable, observer);
    }
}
