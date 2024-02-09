import java.util.ArrayList;


public class Doctor {
    private  String __doctor_name;
    private float __doctor_experience;
    ArrayList<Appointment> appointments_array = new ArrayList<>();

    public  Doctor(String name, float experience ){
        __doctor_name = name;
        __doctor_experience = experience;
    }


    void  get_data(){
        System.out.println("Doctor name: " +__doctor_name);
        System.out.println("Doctor experience: " +__doctor_experience);
        for(Appointment app: appointments_array) {
            app.get_appointment();
        }

    }
    void add_appointment(int attendance_number, String comments){
        Appointment appointment = new Appointment(attendance_number,comments);
        appointments_array.add(appointment);
    }
    float  average_attendance(){
        float Sum = 0;
        for(Appointment app: appointments_array) {
            Sum += app.attendance_number;
        }
        float average = Sum / appointments_array.size();
        return average;
    }
    int min_count_attendance(){
        int min_num = appointments_array.get(0).attendance_number;
        for(Appointment app: appointments_array){
            if(app.attendance_number < min_num) {
                min_num = app.attendance_number;
            }
        }
        return min_num;
    }
    String the_longest_comment(){
        int max_comment = 0;
        String coment = "";
        for (Appointment app: appointments_array){
            if(app.comments.length() > max_comment){
                max_comment = app.comments.length();
                coment = app.comments;
            }
        }
        return coment;
    }
}
