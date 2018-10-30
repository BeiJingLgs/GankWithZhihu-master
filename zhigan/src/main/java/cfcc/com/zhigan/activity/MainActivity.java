package cfcc.com.zhigan.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toolbar;

import base.BasePersenter;
import base.MvpBaseActivity;
import butterknife.InjectView;
import cfcc.com.zhigan.R;

public class MainActivity extends MvpBaseActivity {


    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.vp)
    ViewPager vp;

    @Override
    public int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    public BasePersenter createPersenter() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
