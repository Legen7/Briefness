package com.aliletter.demo_briefness;


import android.view.View;
import android.widget.TextView;


import com.aliletter.briefness.BindClick;

import com.aliletter.briefness.BindLayout;
import com.aliletter.briefness.BindView;
import com.aliletter.briefness.BindViews;


@BindLayout(id = R.layout.activity_main, name = "activity_main")
public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_test)
    TextView tv_test;

    @BindView(R.id.tv_test1)
    TextView tv_test1;

    @BindViews({R.id.tv_test, R.id.tv_test1})
    TextView[] textViews;

    @BindClick({R.id.tv_test, R.id.tv_test1})
    public void onClick(View v) {

    }


}
