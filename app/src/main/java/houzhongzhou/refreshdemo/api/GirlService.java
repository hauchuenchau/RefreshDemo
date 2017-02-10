package houzhongzhou.refreshdemo.api;

import java.util.List;

import houzhongzhou.refreshdemo.bean.GirlBean;
import houzhongzhou.refreshdemo.net.RetrofitManager;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Mr.hou on 2017/2/10.
 */

public class GirlService implements ApiService<List<GirlBean>>  {
    @Override
    public void getData(int page, int limit, Observer<List<GirlBean>> observer) {
        RetrofitManager.getInstance().createReq(GirlInfo.class)
                .getWelfareImg(limit, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
