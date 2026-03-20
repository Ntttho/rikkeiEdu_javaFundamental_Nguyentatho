package assignment.session15.btth;

public class EmergencyPatient extends Patient {
    private int priorityLevel;

    public EmergencyPatient(String fullname, int age, String medicalCondition, int priorityLevel) {
        super(fullname, age, medicalCondition);
        this.priorityLevel = priorityLevel;
    }

    @Override
    int getPriority() {
        // TODO Auto-generated method stub
        return this.priorityLevel;
    }
    

}