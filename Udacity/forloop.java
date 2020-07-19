public class forloop{
    public static void main(String[] args){
        raiseAlarm(3);
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
}