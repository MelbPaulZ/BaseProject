package au.com.smedia.baseproject.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import au.com.smedia.baseproject.R;
import au.com.smedia.baseproject.base.BaseFragment;
import au.com.smedia.baseproject.base.BasePresenter;
import au.com.smedia.baseproject.ui.contract.MainFragmentContract;
import au.com.smedia.baseproject.ui.presenter.MainPresenter;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by puzhao on 2/2/18.
 */

public class MainFragment extends BaseFragment implements MainFragmentContract.View{

    @BindView(R.id.signin) TextView signin;
    @BindView(R.id.main_issue_image) ImageView issueView;
    @BindView(R.id.main_issue_name) TextView issueName;
    @BindView(R.id.main_issue_description) TextView issueDescription;

    private MainFragmentContract.Presenter mainPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        mainPresenter.subscribe(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        mainPresenter.unsubscribe();
    }

    @Override
    public void setPresenter(MainFragmentContract.Presenter presenter) {
        this.mainPresenter =  presenter;
    }

    @Override
    public void displayMagazineList() {

    }

    @Override
    public void updateMainIssueView(@NonNull String url, @NonNull String name, @NonNull String description) {
        Picasso.with(getContext()).load(url).into(issueView);
        issueName.setText(name);
        issueDescription.setText(description);
    }


}
