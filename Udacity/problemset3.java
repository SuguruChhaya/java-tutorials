public class problemset3 {
    public static void main(String[] args) {
        System.out.println(absoluteValue(-1.0));
        System.out.println(calculateTip(5.0));
        System.out.println(nametagText("Suguru"));
        double temp = fahrenheitToCelsius(80);
        printTemperature(80);
        System.out.println(monopolyRoll());

    }

    public static double absoluteValue(double a){
        if (a < 0){
            return -a;
        }
        else{
            return a;
        }
    }
    public static double calculateTip(double b){
        return b * 0.15;
    }

    public static String nametagText(String c){
        return "Hello, my name is " + c;
    }

    public static double fahrenheitToCelsius(double d){
        return (d - 32) * 5 / 9;
    }
    public static void printTemperature(double fahrenheittemp){
        System.out.println("F: " +  fahrenheittemp);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheittemp));
    }
    public static int rolldice(int sides){
        double random_int = Math.random();
        random_int = random_int * sides;
        random_int = random_int + 1;
        return (int) random_int;
    }

    public static int monopolyRoll(){
        int a = rolldice(6);
        System.out.println(a);
        int b = rolldice(6);
        System.out.println(b);
        int sum;
        if (a == b){
            int c = rolldice(6);
            System.out.println(c);
            int d = rolldice(6);
            System.out.println(d);
            return a + b + c + d;
        }
        else{
            return a + b;
        }
    }
}