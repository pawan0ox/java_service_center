import Vehicles.four_wheeler;
import Vehicles.two_wheeler;
import Service_center.services;
import java.util.ArrayList;

public  class Main{
    public static void main(String[] args) {
        two_wheeler vehicle1 = new two_wheeler("two_wheeler","All","Available",true,true,"Honda_Bikes","Kalanki");
        four_wheeler vehicle2 = new four_wheeler("four_wheeler","All","Not available",true,true,"Automobilli","chabahil");
        ArrayList<services> services_bike = new ArrayList<>();
        services_bike.add(vehicle1);
        ArrayList<services> services_car = new ArrayList<>();
        services_car.add(vehicle2);
        System.out.printf("model: %s, paint: %s, pattern: %s, engine_maintainance: %b, total_servicing: %b, branch_name: %s, branch_location: %s", vehicle1.getModel() , vehicle1.getPaint_available(), vehicle1.getPattern(),vehicle1.getEngine_maintainance(), vehicle1.getTotal_servicing(), vehicle1.getBranch_name(), vehicle1.getBranch_location());
    }
}