package MVC;

public class Appointment {
    private String AppointmentId;
    private String Doctor;
    private String Patient;
    private String Disease;
    

    public String getAppointmentId() {
        return AppointmentId;
    }

    public void setAppointmentId(String id) {
        this.AppointmentId = id;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String name) {
        this.Doctor = name;
    }

    public String getPatient() {
        return Patient;
    }

    public void setPatient(String name) {
        this.Patient = name;
    }
    
    public String getDisease(){return this.Disease;}

    public void setDisease(String name){
        this.Disease = name;
    }

}
