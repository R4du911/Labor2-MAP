package MVC;

public class AppointmentView {
    public void printAppointmentDetails(String AppointmentId, String Doctor, String Patient, String Disease){
        System.out.println("Appointment Details: ");
        System.out.println("Appointment ID: " + AppointmentId);
        System.out.println("Doctor: " + Doctor);
        System.out.println("Patient: " + Patient);
        System.out.println("Disease: " + Disease);
    }
}
