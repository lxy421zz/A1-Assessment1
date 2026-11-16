public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("大黄", 3);
        Animal cat = new Cat("橘橘", 2);
        Animal bird = new Bird("小麻雀", 1);
        Duck duck = new Duck("小黄鸭", 1);

        System.out.println("===== 动物1 =====");
        dog.showInfo();
        dog.makeSound();
        dog.eat();

        System.out.println("===== 动物2 =====");
        cat.showInfo();
        cat.makeSound();
        cat.eat();

        System.out.println("===== 动物3 =====");
        bird.showInfo();
        bird.makeSound();
        bird.eat();

        System.out.println("===== 动物4 =====");
        duck.showInfo();
        duck.makeSound();
        duck.eat();
    }
}
