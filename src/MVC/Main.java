package MVC;

public class Main {
    public static void main(String[] args) {
        Appointment model  = retrieveAppointmentFromDatabase();

        AppointmentView view = new AppointmentView();

        AppointmentController controller = new AppointmentController(model, view);

        controller.updateView();

        controller.setDoctor("Beckham");
        System.out.println("\nAfter updating, Course Details are as follows:");

        controller.updateView();
    }

    private static Appointment retrieveAppointmentFromDatabase(){
        Appointment clinic = new Appointment();
        clinic.setAppointmentId("01");
        clinic.setDoctor("Owen");
        clinic.setPatient("Kane");
        clinic.setDisease("COVID");
        return clinic;
    }
}