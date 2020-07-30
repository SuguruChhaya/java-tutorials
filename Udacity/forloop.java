public class forloop{
    public static void main(String[] args){
        raiseAlarm(3);
        System.out.println(countblocks(3));
    }
    //!A forloop has three sections which are separated by semi-colons
    //*forloops work very similar to range in java
    //*First space: counter variable
    //*"item" eqivalent in for item in... in python
    //*Second space: limit 
    //*Equivalent of 2 in range(0, 2,1) 
    //*Third space: incriment
    //*Usually when the incriment is 1 and if the counter variable is h for example, it would written as h++

    public static void raiseAlarm(int i){
        for (int counter=1; counter <= i; counter++){
            System.out.println("Warning");
        }
    }
    public static int countblocks(int layers){
        int total = 0;
        //*Doesn't have to start at 1
        //*Change incriment
        //!The following has the incriment go down by 1 but returns the same value
        //both counter-- and counter-=1 works
        for (int counter=3; counter >= 1; counter-= 1){
        //for (int counter=1; counter <=layers; counter++){
            total += counter * counter;
        }
        return total;
    }
}