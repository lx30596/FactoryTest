package FactoryMethod;

import Model.XiaomiMobilePhone;
import Model.IMobilePhone;

public class XiaomiMobilePhoneFactory implements IFactoryMethod {
    @Override
    public IMobilePhone getPhone() {
        return new XiaomiMobilePhone();
    }
}