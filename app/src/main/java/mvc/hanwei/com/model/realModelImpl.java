package mvc.hanwei.com.model;

import android.content.Context;

import com.google.gson.Gson;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import mvc.hanwei.com.entity.realBean;

/**
 * 从网络接口来获取数据(从服务器中获取的数据)
 * Created by cmh on 2017/3/7.
 */
public class realModelImpl implements realModel{

    private OkHttpClient client = new OkHttpClient();
    private Context mcontext;
    @Override
    public void getReal(final onRealModel onRealModel) {

        new Thread(){
            @Override
            public void run() {
                super.run();
                // TODO OKhttp请求网络  换成  volley请求网络
                FormEncodingBuilder builder = new FormEncodingBuilder();
                builder.add("areaId","C157");
                Request request = new Request.Builder()
                        .url("http://env.scsoft.com.cn:8023/dam/s/login/app/getRealtimeAreaPointInfo?format=json")
                        .post(builder.build())
                        .build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Request request, IOException e) {
                        onRealModel.OnError("网络请求异常...");
                    }

                    @Override
                    public void onResponse(Response response) throws IOException {
                        String result = response.body().string();
                        Gson gson = new Gson();
                        realBean realBean = gson.fromJson(result, realBean.class);
                        if (realBean!=null){
                            onRealModel.OnSuccess(realBean);
                        }else{
                            onRealModel.OnError("解析服务器出错...");
                        }
//                        Log.e("eee","-----"+response.body().string());


                    }
                });

//                Map<String,String> params = new HashMap<String, String>();
//                params.put("areaId","C157");
//                VolleyRequest.newInstance().newGsonRequest("http://env.scsoft.com.cn:8023/dam/s/login/app/getRealtimeAreaPointInfo?format=json"
//                ,realBean.class, new Response.Listener<realBean>() {
//                            @Override
//                            public void onResponse(realBean response) {
//
//                                Log.e("---------",response.getData().getAreaObj().getAQI()+"=====================");
//
//                            }
//                        }, new Response.ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError error) {
//
//                            }
//                        });

            }
        }.start();
    }
}
