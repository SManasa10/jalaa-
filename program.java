class program {
    static class Car {
        String color;
        int speed;

       
        void drive() {              
            System.out.println("Car is driving");
        }

        
        void setSpeed(int s) {       
            speed = s;
        }
    }

    public static void main(String[] args) {

        
        Car myCar = new Car();

        
        myCar.setSpeed(80);
        myCar.drive();
    }
}
