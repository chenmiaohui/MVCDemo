package mvc.hanwei.com.model;

import mvc.hanwei.com.entity.realBean;

/**
 * 得到网络请求得结果接口一般都是成功和失败 或者有Progerss时有加载完成和隐藏加载
 * Created by cmh on 2017/3/7.
 */
public interface onRealModel {
    //成功
    void OnSuccess(realBean s);
    //失败
    void OnError(String e);

}
