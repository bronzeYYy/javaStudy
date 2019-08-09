package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class FoodProxy implements InvocationHandler, Food {

    private Food food;

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void eat() {
        if (food == null) {
            throw new NullPointerException("please set food first!");
        }
        // 创建动态代理，代理的接口为第二个参数的接口
        Object o = Proxy.newProxyInstance(Food.class.getClassLoader(), food.getClass().getInterfaces(), this);
        // 执行代理的方法
        ((Food) o).eat();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("吃饭前：准备碗筷");
        Object res = method.invoke(food, args);
        System.out.println("吃饭后：刷洗碗筷");
        return res;
    }
}
