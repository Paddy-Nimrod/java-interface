package org.example;

public class Deskphone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, the deskphone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on the deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("phone ringing and has been received");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber ==  myNumber){
            isRinging = true;
            System.out.println("calling now");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
