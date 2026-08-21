// Define an interface for animals
interface Animal
{
    void makeSound();
    void eat();
}

class Dog implements Animal
{
    public void makeSound()
    {
        System.out.println("woof!");
    }
    public void eat()
    {
        System.out.println("Dog is eating dog food.");
    }
}
class Cat implements Animal
{
    public void makeSound()
    {
        System.out.println("Meow!");
    }
    public void eat()
    {
        System.out.println("Cat is eating cat food.");
    }
}
public class interfaceEx{
    public static void main(String[]args)
    {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Dog:");
        dog.makeSound();
        dog.eat();

        System.out.println("\n Cat:");
        cat.makeSound();
        cat.eat();
    }
}