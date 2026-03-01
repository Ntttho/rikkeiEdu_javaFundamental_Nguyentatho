package assignment.session13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class EmergencyRoom {
    private List<String> listPatient = new LinkedList<>();

    EmergencyRoom(){};
     
    void patientCheckIn(String name){
        // them vao cuoi linked list
        this.listPatient.addLast(name);
    };

    void emergencyCheckIn(String name){
        // them vao cuoi linked list
        this.listPatient.addFirst(name);
    };

    void treatPatient(){
        Iterator<String> it = this.listPatient.iterator();
        // goi thang dau tien
        if(it.hasNext()){
            System.out.println("goi benh nhan: " + it.next() + " vao chua tri" );
            it.remove();
        }else{
            System.out.println("listPatient is none");
        }
    };
}

public class Bt04 {
    public static void main(String[] args) {
        EmergencyRoom hospoital = new EmergencyRoom();
        hospoital.patientCheckIn("Hanh");
        hospoital.patientCheckIn("Nhan");
        hospoital.patientCheckIn("Thuong");

        hospoital.emergencyCheckIn("tay");
        hospoital.emergencyCheckIn("nguyen");

        hospoital.treatPatient();
        hospoital.treatPatient();
    }
}
