package com.example.dai.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        EventBus.getDefault().post(new MsgBean("标题", "内容"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event(String mgs) {
        btn.append("\nmgs");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event2(MsgBean msgBean) {
        btn.setText(msgBean.getTitle() + "\n" + msgBean.getContent());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}