package SimpleFactory;

import Model.IMobilePhone;
import Model.MobilePhoneType;

public class SimplyFactoryTest {
    public static void main(String[] args) {
        MobilePhoneSimpleFactory mobilePhoneSimpleFactory = new MobilePhoneSimpleFactory();
        IMobilePhone mobilePhone = mobilePhoneSimpleFactory.getPhone(MobilePhoneType.AppleMobilePhone);
        mobilePhone.call();
        mobilePhone.sendMessage();
    }
}
