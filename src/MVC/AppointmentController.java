package MVC;

public class AppointmentController {
    final private Appointment model;
    final private AppointmentView view;

    public AppointmentController(Appointment model, AppointmentView view){
        this.model = model;
        this.view = view;
    }

    public String getAppointmentId() {
        return model.getAppointmentId();
    }

    public void setAppointmentId(String id) {
        model.setAppointmentId(id);
    }

    public String getDoctor() {
        return model.getDoctor();
    }

    public void setDoctor(String name) {
        model.setDoctor(name);
    }

    public String getPatient() {
        return model.getPatient();
    }

    public void setPatient(String name) {
        model.setPatient(name);
    }

    public String getDisease(){
        return model.getDisease();
    }

    public void setDisease(String name){
        model.setDisease(name);
    }

    public void updateView(){
        view.printAppointmentDetails(model.getAppointmentId(), model.getDoctor(), model.getPatient(), model.getDisease());
    }
}
