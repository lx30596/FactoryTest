package Model;

public class AppleMobilePhone implements IMobilePhone {
    @Override
    public void call() {
        System.out.println("正在使用苹果手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("正在使用苹果手机发短信");
    }
}
