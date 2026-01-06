class Vehicle
{
    int wheel;
    int gears;
}
class Car extends Vehicle
{
    String model;
    double price;
}
class VehicleInheritance
{
    public static void main(String args[])
    {
        Car car1 = new Car();
        car1.wheel = 4;
        car1.gears = 6;
        car1.model = "Sedan";
        car1.price = 25000.50;
        System.out.println("Car Details: \nNumber of Vehicles: " + car1.wheel + "\nNumber of Gears: " + car1.gears + "\nModel: " + car1.model + "\nPrice: $" + car1.price);
    }
}
