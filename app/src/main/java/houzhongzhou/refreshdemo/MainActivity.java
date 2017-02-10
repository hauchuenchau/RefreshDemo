package houzhongzhou.refreshdemo;

import android.support.v4.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;

import houzhongzhou.refreshdemo.api.GirlService;
import houzhongzhou.refreshdemo.base.BaseActivity;
import houzhongzhou.refreshdemo.bean.GirlBean;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeRefreshLayout mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.refresh_layout);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.list);
        startGetData(mRecyclerView, mSwipeRefreshLayout, new BaseQuickAdapter<GirlBean>(R.layout.item_layout,new ArrayList()){
            @Override
            protected void convert(BaseViewHolder baseViewHolder, GirlBean welfareEntity) {
                Glide.with(MainActivity.this)
                        .load(welfareEntity.getUrl())
                        .placeholder(R.mipmap.ic_launcher)
                        .into((ImageView) baseViewHolder.getView(R.id.iv));
            }
        },new GirlService());
    }
}
