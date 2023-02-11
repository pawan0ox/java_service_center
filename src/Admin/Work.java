package Admin;

public class Work{
    String name;
    String contact_number;
    boolean work_done;

    public Work(String name, String contact_number, boolean work_done) {
        this.name = name;
        this.contact_number = contact_number;
        this.work_done = work_done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public boolean isWork_done() {
        return work_done;
    }

    public void setWork_done(boolean work_done) {
        this.work_done = work_done;
    }
}