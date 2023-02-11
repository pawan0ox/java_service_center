package Service_center;

import java.util.ArrayList;

public class branches extends services{

    public branches(String model, String paint_available, String pattern, Boolean engine_maintainance, Boolean total_servicing) {
        super(model, paint_available, pattern, engine_maintainance, total_servicing);
    }
    String branch_name;
    String branch_location;

    public branches(String model, String paint_available, String pattern, Boolean engine_maintainance, Boolean total_servicing, String branch_name, String branch_location) {
        super(model, paint_available, pattern, engine_maintainance, total_servicing);
        this.branch_name = branch_name;
        this.branch_location = branch_location;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBranch_location() {
        return branch_location;
    }

    public void setBranch_location(String branch_location) {
        this.branch_location = branch_location;
    }
}
