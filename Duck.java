public class Duck extends Animal {
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "：嘎嘎嘎！");
    }

    public void eat() {
        System.out.println(name + "正在吃稻谷！");
    }
}
