

/**
 * problemset4
 */
public class problemset4 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        String [] test = {"Java", "Python"};
        System.out.println(stringindex(test, "Java"));
        System.out.println(yearstilonemillion(950000));
        printinreverse(test);
        int [] int_array = {1,2,3, -1};
        System.out.println(findrange(int_array));
    }

    //*2. Create a factorial question using loop
    public static int factorial(int n){
        int total = 1;
        for (int i = 2; i <= n; i ++){
            total *= i;
        }
        return total;
    }

    //*3. Find lowest index
    public static int stringindex(String[] stringarray, String target){
        for (int i = 0; i < stringarray.length; i++){
            if (stringarray[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    //*4. Yearstilonemillion
    public static int yearstilonemillion(double initialbalance){
        int years = 0;
        while (initialbalance < 1000000){
            years += 1;
            initialbalance *= 1.05;
        }
        return years;
    }

    //*5. Printinreverse
    public static void printinreverse(String [] stringarray){
        for (int i = stringarray.length - 1; i >= 0; i--){
            System.out.println(stringarray[i]);
        }
    }

    //*6. Findrange
    public static int findrange(int[] intarray){
        if (intarray.length > 0){
            int min = intarray[0];
            int max = intarray[0];
            for (int i = 1; i < intarray.length; i++){
                if (intarray[i] < min){
                    min = intarray[i];
                }
                if (intarray[i] > max){
                    max = intarray[i];
                }
            }
            return max - min;
        }
        return -1;

    }

    //*8. Rolling dice
    public static int rolldice(){
        double a = Math.random() * 6;
        a += 1;
        int b = (int) a;
        return b;

    }



}