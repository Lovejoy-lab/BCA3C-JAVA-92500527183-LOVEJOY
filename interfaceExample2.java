interface animal{
    void makeSound();
    void eat();
    void run();
}

interface childanimal extends animal{
    void drink();
}

class puppy implements childanimal{
    public void drink(){
        System.out.println("puppy is drinking animal drink");
    }

    public void makeSound(){
        System.out.println("meow");
    }

    public void eat(){
        System.out.println("cat is eating");
    }

    public void run(){
        System.out.println("cat is running");
    }
}

class dog implements animal{
    public void makeSound(){
        System.out.println("meow");
    }

    public void eat(){
        System.out.println("cat is eating");
    }

    public void run(){
        System.out.println("cat is running");
    }
}

public class interfaceExample2{
    public static void main (String[] args){
        dog mydog = new dog();
        puppy mypuppy = new puppy();

        mydog.makeSound();
        mydog.eat();
        mydog.run();
        mypuppy.drink();
    }
}