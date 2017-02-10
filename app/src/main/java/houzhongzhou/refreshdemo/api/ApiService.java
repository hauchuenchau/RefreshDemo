package houzhongzhou.refreshdemo.api;

import java.util.List;

import rx.Observer;

/**
 * Created by Mr.hou on 2017/2/10.
 */

public interface  ApiService <T extends List>{
    /**
     * @param page 页数
     * @param limit 每页多少条
     * @param observer
     */
    void getData(int page,int limit, Observer<T> observer);
}
