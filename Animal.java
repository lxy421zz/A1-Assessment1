public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void showInfo() {
        System.out.println("名字：" + name + "，年龄：" + age);
    }

    public void eat() {
        System.out.println(name + "正在吃东西！");
    }
}
