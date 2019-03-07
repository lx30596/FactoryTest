package FactoryMethod;

import Model.IMobilePhone;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactoryMethod factory = new ApplyMobilePhoneFactory();
        IMobilePhone mobilePhone = factory.getPhone();
        mobilePhone.call();
        mobilePhone.sendMessage();
    }
}
