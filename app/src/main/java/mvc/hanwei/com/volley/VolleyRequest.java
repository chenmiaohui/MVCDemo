package mvc.hanwei.com.volley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * volley网络请求
 * Created by cmh on 2015/2/6.
 */
public class VolleyRequest {
    private static RequestQueue mRequestQueue;

    private VolleyRequest() {
    }

    /**
     * @param context ApplicationContext
     */
    public static void buildRequestQueue(Context context) {
        mRequestQueue = Volley.newRequestQueue(context);
        //... do something
    }

    public static VolleyRequest newInstance() {
        if (mRequestQueue == null) {
            throw new NullPointerException("Call buildRequestQueue method first.");
        }
        //...
        return new VolleyRequest();
    }

    /**
     * @param url
     * @param clazz
     * @param listener
     * @param errorListener
     * @return
     */
    public <T> GsonRequest<T> newGsonRequest(String url, Class<T> clazz, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        GsonRequest<T> request = new GsonRequest<T>(url, clazz, listener, errorListener);
        mRequestQueue.add(request);
        return request;
    }

    /**
     * @param post
     * @param url
     * @param clazz
     * @param listener
     * @param errorListener
     * @param <T>
     * @return
     */
    public <T> GsonRequest<T> newGsonRequest(int post, String url, Map<String, String> params, Class<T> clazz, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        GsonRequest<T> request = new GsonRequest<T>(post ,url, clazz, listener, errorListener);
        mRequestQueue.add(request);
        return request;
    }

}
