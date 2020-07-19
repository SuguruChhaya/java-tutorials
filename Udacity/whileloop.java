public class whileloop{
    public static void main(String[] args){
        System.out.println(yahtzee());
        System.out.println("roll1 count: " + roll1_count);
        System.out.println(efficient());
        System.out.println("roll2 count: " + roll2_count);

    }
    public static int roll1_count = 0;
    public static int roll2_count = 0;
    public static int roll1(){
        roll1_count += 1;
        double random_int = Math.random();
        random_int = random_int * 6;
        random_int += 1;
        return (int) random_int;
    }

    public static int roll2(){
        roll2_count += 1;
        double random_int = Math.random();
        random_int = random_int * 6;
        random_int += 1;
        return (int) random_int;
    }
    //*The easy way to find it is by rolling the dice five times and find if they are all equal
    public static int yahtzee(){
        int count = 0;
        int roll1 = roll1();
        int roll2 = roll1();
        int roll3 = roll1();
        int roll4 = roll1();
        int roll5 = roll1();
        while (!(roll1 == roll2 && roll2 == roll3 && roll3 == roll4 && roll4 == roll5)){
            roll1 = roll1();
            roll2 = roll1();
            roll3 = roll1();
            roll4 = roll1();
            roll5 = roll1();
            count += 1;


        }
        return count;
    //I am making a program which counts how many times I have to roll to get same side for six dices.

        
    }
    //*I think I should try to make this code more concise and readable, probalbly by creating another function.
    public static int efficient(){
        int count = 0;
        while (true){
            int roll1 = roll2();
            int roll2 = roll2();
            if (roll1 == roll2){
                int roll3 = roll2();
                if (roll2 == roll3){
                    int roll4 = roll2();
                    if (roll3 == roll4){
                        int roll5 = roll2();
                        if (roll4 == roll5){
                            return count;
                            }
                            else{
                                count+=1;
                            }
                    }
                    else{
                        count+=1;
                    }
                }
                else{
                    count+=1;
                }

            }
            else{
                count+=1;
            }
        }

    }
}