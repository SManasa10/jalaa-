public class Variables {
    

    int number = 100; 

    void show() {
        int number = 50; 

        System.out.println("Local variable: " + number);          
        System.out.println("Global variable: " + this.number);    
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.show();
    }
}


