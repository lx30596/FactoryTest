package Model;

public class HuaweiMobilePhone implements IMobilePhone {
    @Override
    public void call() {
        System.out.println("正在使用华为手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("正在使用华为手机发短信");
    }
}
