package Service_center;

import java.util.ArrayList;

public class services {
    String model;
    String Paint_available;
    String Pattern;
    Boolean Engine_maintainance;
    Boolean Total_servicing;

    public services(String model, String paint_available, String pattern, Boolean engine_maintainance, Boolean total_servicing) {
        this.model = model;
        Paint_available = paint_available;
        Pattern = pattern;
        Engine_maintainance = engine_maintainance;
        Total_servicing = total_servicing;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPaint_available() {
        return Paint_available;
    }

    public void setPaint_available(String paint_available) {
        Paint_available = paint_available;
    }

    public String getPattern() {
        return Pattern;
    }

    public void setPattern(String pattern) {
        Pattern = pattern;
    }

    public Boolean getEngine_maintainance() {
        return Engine_maintainance;
    }

    public void setEngine_maintainance(Boolean engine_maintainance) {
        Engine_maintainance = engine_maintainance;
    }

    public Boolean getTotal_servicing() {
        return Total_servicing;
    }

    public void setTotal_servicing(Boolean total_servicing) {
        Total_servicing = total_servicing;
    }
}

