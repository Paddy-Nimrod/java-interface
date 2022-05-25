package org.example;

public class Main {
    public static void main(String[] args) {

        ITelephone nimrodsPhone;
        nimrodsPhone = new Deskphone(506842);
        nimrodsPhone.powerOn();
        nimrodsPhone.callPhone(506842);


        nimrodsPhone = new Mobilephone(752959);
        nimrodsPhone.powerOn();
        nimrodsPhone.callPhone(752959);
        nimrodsPhone.answer();
    }
}