package Vehicles;

import Service_center.branches;
import Service_center.services;

import java.util.ArrayList;

public class two_wheeler extends branches {

    public two_wheeler(String model, String paint_available, String pattern, Boolean engine_maintainance, Boolean total_servicing, String branch_name, String branch_location) {
        super(model, paint_available, pattern, engine_maintainance, total_servicing, branch_name, branch_location);
    }
}
