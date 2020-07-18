/**
 * random
 */
public class random {

    public static void main(String[] args){
        //*To use the random module in java, I use the math.random method
        //*Math.random returns a random value between 0 and 1
        double random_number = Math.random();
    
        random_number = random_number *10;
        System.out.println(random_number);
        //*Convert into an int
        int random_int = (int) random_number;
        System.out.println(random_int);
        System.out.println(roll_dice(6));
    }

    public static int roll_dice(int num_of_sides){
        double random_integer = Math.random();
        random_integer = random_integer * num_of_sides;
        random_integer += 1;
        int random_integer2 = (int) random_integer;
        //Since it is not possible to roll a 6 and it is possible to role a 0 in this case, we have to shift the value by 1

        return random_integer2;
    }

}