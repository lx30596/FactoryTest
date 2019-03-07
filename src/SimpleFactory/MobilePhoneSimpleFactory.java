package SimpleFactory;

import Model.IMobilePhone;

public class MobilePhoneSimpleFactory {
    public IMobilePhone getPhone(String className){
        IMobilePhone mobilePhone = null;
        try {
            mobilePhone = (IMobilePhone)Class.forName(className).newInstance();
            if(mobilePhone == null){
                System.out.println("未发现该款式手机！请检查");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return  mobilePhone;
    }
}
