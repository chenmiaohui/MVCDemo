package mvc.hanwei.com.entity;

/**
 * 封装实时数据
 * Created by cmh on 2017/3/7.
 */
public class realBean {


    /**
     * areaObj : {"PM25":24,"PM10":60,"WS":"","O3":87,"AQI":"55","TEMP":"","areaId":"C157","pollutant":"无","AQILevel":"1","HUM":"","SO2":18,"areaName":"郑州市","WD":"","recTime":"2017-03-07 13:00:00","NO2":24,"CO":0.958}
     */

    private DataBean data;
    /**
     * data : {"areaObj":{"PM25":24,"PM10":60,"WS":"","O3":87,"AQI":"55","TEMP":"","areaId":"C157","pollutant":"无","AQILevel":"1","HUM":"","SO2":18,"areaName":"郑州市","WD":"","recTime":"2017-03-07 13:00:00","NO2":24,"CO":0.958}}
     * message : 已查询出实时监测区域代表点位详细参数信息！
     * table : null
     * code : 1
     * count : 1
     */

    private String message;
    private Object table;
    private String code;
    private String count;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getTable() {
        return table;
    }

    public void setTable(Object table) {
        this.table = table;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public static class DataBean {
        /**
         * PM25 : 24
         * PM10 : 60
         * WS :
         * O3 : 87
         * AQI : 55
         * TEMP :
         * areaId : C157
         * pollutant : 无
         * AQILevel : 1
         * HUM :
         * SO2 : 18
         * areaName : 郑州市
         * WD :
         * recTime : 2017-03-07 13:00:00
         * NO2 : 24
         * CO : 0.958
         */

        private AreaObjBean areaObj;

        public AreaObjBean getAreaObj() {
            return areaObj;
        }

        public void setAreaObj(AreaObjBean areaObj) {
            this.areaObj = areaObj;
        }

        public static class AreaObjBean {
            private int PM25;
            private int PM10;
            private String WS;
            private int O3;
            private String AQI;
            private String TEMP;
            private String areaId;
            private String pollutant;
            private String AQILevel;
            private String HUM;
            private int SO2;
            private String areaName;
            private String WD;
            private String recTime;
            private int NO2;
            private double CO;

            public int getPM25() {
                return PM25;
            }

            public void setPM25(int PM25) {
                this.PM25 = PM25;
            }

            public int getPM10() {
                return PM10;
            }

            public void setPM10(int PM10) {
                this.PM10 = PM10;
            }

            public String getWS() {
                return WS;
            }

            public void setWS(String WS) {
                this.WS = WS;
            }

            public int getO3() {
                return O3;
            }

            public void setO3(int O3) {
                this.O3 = O3;
            }

            public String getAQI() {
                return AQI;
            }

            public void setAQI(String AQI) {
                this.AQI = AQI;
            }

            public String getTEMP() {
                return TEMP;
            }

            public void setTEMP(String TEMP) {
                this.TEMP = TEMP;
            }

            public String getAreaId() {
                return areaId;
            }

            public void setAreaId(String areaId) {
                this.areaId = areaId;
            }

            public String getPollutant() {
                return pollutant;
            }

            public void setPollutant(String pollutant) {
                this.pollutant = pollutant;
            }

            public String getAQILevel() {
                return AQILevel;
            }

            public void setAQILevel(String AQILevel) {
                this.AQILevel = AQILevel;
            }

            public String getHUM() {
                return HUM;
            }

            public void setHUM(String HUM) {
                this.HUM = HUM;
            }

            public int getSO2() {
                return SO2;
            }

            public void setSO2(int SO2) {
                this.SO2 = SO2;
            }

            public String getAreaName() {
                return areaName;
            }

            public void setAreaName(String areaName) {
                this.areaName = areaName;
            }

            public String getWD() {
                return WD;
            }

            public void setWD(String WD) {
                this.WD = WD;
            }

            public String getRecTime() {
                return recTime;
            }

            public void setRecTime(String recTime) {
                this.recTime = recTime;
            }

            public int getNO2() {
                return NO2;
            }

            public void setNO2(int NO2) {
                this.NO2 = NO2;
            }

            public double getCO() {
                return CO;
            }

            public void setCO(double CO) {
                this.CO = CO;
            }
        }
    }
}
