import java.util.ArrayList;

public class Doctor {
    private String doctor_name;
    private float doctor_experience;
    private ArrayList<Appointment> appointments_array = new ArrayList<>();

    public Doctor(String name, float experience) {
        doctor_name = name;
        doctor_experience = experience;
    }

    void getData() {
        System.out.println("Doctor name: " + doctor_name);
        System.out.println("Doctor experience: " + doctor_experience);
        for (Appointment app : appointments_array) {
            app.get_appointment();
        }

    }

    void addAppointment(int attendance_number, String comments) {
        Appointment appointment = new Appointment(attendance_number, comments);
        appointments_array.add(appointment);
    }

    float averageAttendance() {
        float Sum = 0;
        for (Appointment app : appointments_array) {
            Sum += app.attendance_number;
        }
        float average = Sum / appointments_array.size();
        return average;
    }

    int minCountAttendance() {
        int min_num = appointments_array.getFirst().attendance_number;
        for (Appointment app : appointments_array) {
            if (app.attendance_number < min_num) {
                min_num = app.attendance_number;
            }
        }
        return min_num;
    }

    String theLongestComment() {
        int max_comment = 0;
        String coment = "";
        for (Appointment app : appointments_array) {
            if (app.comments.length() > max_comment) {
                max_comment = app.comments.length();
                coment = app.comments;
            }
        }
        return coment;
    }
}
