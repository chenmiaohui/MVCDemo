package mvc.hanwei.com.model;

/**
 * 请求网络接口
 * Created by cmh on 2017/3/7.
 */
public interface realModel {
    //接口  其实可把onrealModel写在一起  根据接口需求来写接口所需要的数据以及监听
    void getReal(onRealModel onRealModel);
}
