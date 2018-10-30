package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;


/**
 * Created by acer on 2017/11/16.
 */

public  abstract class MvpBaseActivity<V,T extends BasePersenter<V>> extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         if (createPersenter()!=null){

         }
         setContentView(getLayoutView());
        ButterKnife.inject(this);
    }
    public  abstract int getLayoutView();
    /**
     * 过去到Persenter
     * @return
     */
     public abstract  T createPersenter();
}
