import java.util.Date;

public class Appointment {
    public Appointment( int attendance_number, String comments){
        this.day = new Date();
        this.attendance_number = attendance_number;
        this.comments = comments;

    }
    Date day;
    int attendance_number;
    String comments;

    void  get_appointment(){
        System.out.println("Day appointment" +day);
        System.out.println("Attendance number: " +attendance_number);
        System.out.println("Comments: " +comments);

    }

}
