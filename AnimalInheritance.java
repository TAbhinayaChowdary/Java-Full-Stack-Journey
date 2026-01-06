class Animal
{
    void animals()
    {
        System.out.println("It is an animal");
    }
}
class Mammal extends Animal
{
    void mammals()
    {
        System.out.println("It is is a mammal");
    }
}
class Dog extends Mammal
{
    void dogs()
    {
        System.out.println("It is a dog and they bark...");
    }
}
class AnimalInheritance
{
    public static void main(String args[])
    {
        Dog dog1 = new Dog();
        dog1.animals();
        dog1.mammals();
        dog1.dogs();
    }
}