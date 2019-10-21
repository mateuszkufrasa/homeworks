class Homework3 {
    byte x = 1;
    short y = 15000;
    int z = 100500;
    long w1 = 90003000;
    long w2 = 90003000L;

    boolean yes = true;
    char j = 'J';
    public static void main(String[] args){

        //boolean variable
        boolean value = true;
        if (value){
            System.out.println("Condition is true.");
        }

        //boolean literal
        if (true){
            System.out.println("Always is printed");
        }
        int age = 40;
        if (age >= 25){
            String message = "25 years or older";
        }


        if (age >= 40){
            System.out.println("I am not 20");
        }
        else {
            System.out.println("I am young");
        }

        age = 20;
        if (age < 13){
            System.out.println("Am I child?");
        }
        else if (age < 20) {
            System.out.println("I am teenager");
        } else if (age >= 40) {
            System.out.println("Maybe I am not so old yet");
        } else {
            System.out.println("I am always 20!");
        }
    }
}
