package mvc.hanwei.com.controller;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import mvc.hanwei.com.R;
import mvc.hanwei.com.entity.realBean;
import mvc.hanwei.com.model.onRealModel;
import mvc.hanwei.com.model.realModelImpl;
import mvc.hanwei.com.utils.TimeUtil;
import mvc.hanwei.com.utils.fallView;
import mvc.hanwei.com.utils.getPolluteColor;

public class MainActivity extends AppCompatActivity implements onRealModel {

    private realModelImpl realModelImpl;
    private TextView aqi;
    private TextView time;
    private TextView area;
    private TextView main_pollute;
    private LinearLayout color;
    private TextView quantity;
    private fallView fall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aqi = (TextView) findViewById(R.id.main_aqi);
        time = (TextView) findViewById(R.id.fbsj);
        area = (TextView) findViewById(R.id.main_area_name);
        main_pollute = (TextView) findViewById(R.id.main_major_pollute);
        color = (LinearLayout) findViewById(R.id.statte_color);
        quantity = (TextView) findViewById(R.id.main_air_quantity);
        fall = (fallView) findViewById(R.id.fallview);
        realModelImpl = new realModelImpl();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //把请求传送过去
        realModelImpl.getReal(this);
    }

    @Override
    public void OnSuccess(realBean s) {
        Message msg = new Message();
        msg.what = 1;
        msg.obj = s;
        handler.sendMessage(msg);
    }

    //展示数据
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                    realBean result = (realBean) msg.obj;
                    aqi.setText(result.getData().getAreaObj().getAQI());
                    time.setText(TimeUtil.getRealHour(result.getData().getAreaObj().getRecTime()));
                    area.setText(result.getData().getAreaObj().getAreaName());
                    main_pollute.setText(result.getData().getAreaObj().getPollutant());
                    color.setBackgroundResource(getPolluteColor.getAqiStateDrawable(result.getData().getAreaObj().getAQILevel()));
                    quantity.setText(getPolluteColor.getAqiState(result.getData().getAreaObj().getAQILevel()));
                    fall.setPollutant(getPolluteColor.getAqiState(result.getData().getAreaObj().getAQILevel()));
                    break;
            }

        }
    };


    @Override
    public void OnError(String e) {

    }
}
