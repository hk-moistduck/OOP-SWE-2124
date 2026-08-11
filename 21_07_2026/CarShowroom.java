public class CarShowroom {
    public static class Car{
        String name;
        String model;
        static int count;

        Car(String name, String model){
            this.name = name;
            this.model = model;
            System.out.println("You have created a car of model: " + model);
            count++;
        }
        static int GetCount(){
            return count;
        }
    }
    public static void main(String[] args) {
        System.out.println("count: " + Car.count);
        Car car1 = new Car("kabir_06", "bmw");
        System.out.println("count: " + Car.GetCount());
        Car car2 = new Car("muhib_28", "toyota");
        System.out.println("count: " + Car.GetCount());
    }
}
