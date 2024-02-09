import javax.print.Doc;

public class Main {
    public static void main(String[] args)
    {
        Doctor doctor = new Doctor("Miguel",3);
        doctor.add_appointment(6,"Good doctor");
        doctor.add_appointment(7,"bad doctor");
        doctor.add_appointment(9,"cool doctor!");
        doctor.get_data();
        System.out.println("Average attendance: "+ doctor.average_attendance());
        System.out.println("Minimal count of attendance: " +doctor.min_count_attendance());
        System.out.println("The longest comment: " +doctor.the_longest_comment());
    }

}