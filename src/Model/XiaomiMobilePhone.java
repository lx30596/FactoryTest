package Model;

public class XiaomiMobilePhone implements IMobilePhone {
    @Override
    public void call() {
        System.out.println("正在使用小米手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("正在使用小米手机发短信");
    }
}
