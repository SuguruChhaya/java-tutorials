public class mathstuff {
    public static void main(String[] args) {
        int a = 25;
        int b = 3;
        System.out.println(Math.pow(a, 2));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(a));

        //!When two ints are divided by each other, the answer becomes an int. This is called truncation
        //!Make sure at least one number is a double
        double c = 5/2.0;
        System.out.println(c);
        //*Converting double into an integer. Called casting
        double d = 2.5;
        System.out.println((int) d);
        int e = 2;
        System.out.println((double) e);

    }
}