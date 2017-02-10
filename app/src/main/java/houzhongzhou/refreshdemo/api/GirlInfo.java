package houzhongzhou.refreshdemo.api;

import java.util.List;

import houzhongzhou.refreshdemo.bean.GirlBean;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Mr.hou on 2017/2/10.
 */

public interface GirlInfo {
    @GET("福利/{pageSize}/{currentPage}")
    Observable<List<GirlBean>> getWelfareImg(@Path("pageSize") int pageSize, @Path("currentPage") int currentPage);
}
