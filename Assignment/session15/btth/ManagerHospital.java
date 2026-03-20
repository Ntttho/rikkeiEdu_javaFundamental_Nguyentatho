package assignment.session15.btth;

import java.util.PriorityQueue;
import java.util.Queue;

public class ManagerHospital implements IManagement {

    static final Queue<Patient> queuePatient = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.getPriority(), p1.getPriority()));
    public ManagerHospital() {
        super();
    }

    @Override
    public void add(Patient p) {
        // TODO Auto-generated method stub
        queuePatient.add(p);
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        if(queuePatient.isEmpty()){
            System.out.println("Danh sach hang doi rong!!!");
            return;
        }else{
            for (Patient patient : queuePatient) {
                patient.showInfo();
            }
        }
    }
    @Override
    public void search() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void sort() {
        // TODO Auto-generated method stub
        
    }
    
}
