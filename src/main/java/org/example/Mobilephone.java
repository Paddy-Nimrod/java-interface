package org.example;

public class Mobilephone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobilephone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone turned on");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("dialing " + phoneNumber);
        }else {
            System.out.println("Phone off");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Phone has been answered");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("mobile calling ringing " + phoneNumber );
        }else {
            isRinging = false;
            System.out.println("check your power status or mobile number");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
