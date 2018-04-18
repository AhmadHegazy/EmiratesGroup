package com.app.bowlingscorer.modules.main;

import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.bowlingscorer.R;
import dagger.android.support.DaggerAppCompatActivity;
import javax.inject.Inject;

public class MainActivity extends DaggerAppCompatActivity implements MainContract.View {

  @BindView(R.id.rv_playersList) RecyclerView rv_playersList;
  @BindView(R.id.pb_emptyList) ProgressBar pb_emptyList;
  @Inject MainPresenter mainPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    mainPresenter.loadMain();
  }

  @Override public void onMainLoaded() {
    Log.i("onMainLoaded", "Main page is loaded");
  }
}
