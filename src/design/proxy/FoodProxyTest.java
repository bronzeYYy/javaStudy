package design.proxy;

public class FoodProxyTest {
    public static void main(String[] args) {
        FoodProxy foodProxy = new FoodProxy();
        foodProxy.setFood(new Rice());
        foodProxy.eat();
        System.out.println("----下一顿饭----");
        foodProxy.setFood(new Noodle());
        foodProxy.eat();
    }
}
