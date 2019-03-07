package FactoryMethod;

import Model.HuaweiMobilePhone;
import Model.IMobilePhone;

public class HuaweiMobilePhoneFactory implements IFactoryMethod {
    @Override
    public IMobilePhone getPhone() {
        return new HuaweiMobilePhone();
    }
}
