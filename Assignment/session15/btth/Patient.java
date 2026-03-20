package assignment.session15.btth;

import java.util.Stack;

public class Patient extends Person {
    private String medicalCondition;
    Stack<String> history;

    public Patient(String fullname, int age, String medicalCondition) {
        super(fullname, age);
        this.medicalCondition = medicalCondition;
        history = new Stack<>();
    }

    int getPriority() {
        return 0;
    }

    @Override
    void showInfo() {
        System.out.println(String.format("<<Name: %s - Age: %d - Medical Condition: %s - Priority Level: %d>>",
                super.getFullName(), super.getAge(),
                this.medicalCondition, this.getPriority()));
    }

    

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getHistory() {
        return history.toString();
    }

    public void setHistory(String status) {
        this.history.push(status);
    }

}