class Animal
{
    void animals()
    {
        System.out.println("It is an animal");
    }
}
class Mammal extends Animal
{
    void animals()
    {
        super.animals();
        System.out.println("It is is a mammal");
    }
}
class Dog extends Mammal
{
    void animals()
    {
        super.animals();
        System.out.println("It is a dog and they bark...");
    }
}
class AnimalOverRide
{
    public static void main(String args[])
    {
        Dog dog1 = new Dog();
        dog1.animals();
    }
}