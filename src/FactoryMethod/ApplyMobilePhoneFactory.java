package FactoryMethod;

import Model.IMobilePhone;
import Model.AppleMobilePhone;

public class ApplyMobilePhoneFactory implements IFactoryMethod {
    @Override
    public IMobilePhone getPhone() {
        return new AppleMobilePhone();
    }
}
