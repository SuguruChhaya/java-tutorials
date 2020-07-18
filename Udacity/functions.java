public class functions {

    public static void main(String[] args){
        System.out.println("Hello");
        //*Just like python, if I want to print the result of a function, I need to print it.
        System.out.println(ageinfiveyears(6));


    }

    //*Writing the function
    //*if function is public, anyone can access it.
    //*void means that the function isn't returning any data, but it could still print something.
    //*I still have to specify the parameter type
    //!Apparantly, to call a function from the main class,
    //!My function has to be a static function
    public static void introduction(String string){
        System.out.println("Hi!!");
        System.out.println("My name is Suguru");
    }
    //introduction("Hi");
    //*Retruning something
    //!To return output, I have to replace void to return type
    public static int ageinfiveyears(int age){
        return age + 5;
    }

    
}