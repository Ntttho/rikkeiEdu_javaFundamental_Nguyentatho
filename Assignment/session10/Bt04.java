package assignment.session10;

import assignment.session10.Interface.RemoteControl;

public class Bt04 {
    public static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                // TODO Auto-generated method stub
                System.out.println("Bat den len");
            }
        };

        smartLight.checkBattery();
        smartLight.powerOn();
    }
}