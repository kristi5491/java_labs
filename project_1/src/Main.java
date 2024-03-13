public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Miguel", 3);
        doctor.addAppointment(6, "Good doctor");
        doctor.addAppointment(7, "bad doctor");
        doctor.addAppointment(9, "cool doctor!");
        doctor.getData();
        System.out.println("Average attendance: " + doctor.averageAttendance());
        System.out.println("Minimal count of attendance: " + doctor.minCountAttendance());
        System.out.println("The longest comment: " + doctor.theLongestComment());
    }

}