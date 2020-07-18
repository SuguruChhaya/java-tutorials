
//!Packages seem like a difficult concept
//*For now, I know that they are used to organize different files
//*I can compile a java file in that package too.
//?This was confusing so I should come back later.
public class variables {


    public static void main(String[] args) 
    {
        //*Variables
        //*In java, variables have 3 attributes, type, name and value
        //*Declaring a variable follows the format, "Typename variablename"
        //?Doubles variable type are decimals
        //*Like python, I can't create two variables with the same name in a method

        //*Two formats to assign a value
        //1. separate line

        /*
        This is another type of comment.
        This is equivalent of ''' in python.
        */

        int a;
        a = 4;
        System.out.println(a);

        //*To modify a variable value, I don't need to specify its type anymore. Error when I reassign incorrect type.
        a = 5;
        System.out.println(a);

        //2. Same line (easier)
        int b = 4;
        System.out.println(b);

        int c = b/2;
        System.out.println(c);

        String d = "Hello" + "!!";
        System.out.println(d);

        //*The following are the upper case and lower case methods
        d = d.toUpperCase();
        System.out.println(d);

        d = d.toLowerCase();
        System.out.println(d);

        String e = "Suguru's age: ";
        int f = 15;

        System.out.println(e + f);
        //!Unlike python, adding a string with int doesn't spit out an error.
        //*The result will always be a string.

        //*Off topic: Compilers covert programming into machine code so that the computer can execute the command.
        //*For non-java languages, code is directly compiled into machine code. This makes it non-cross platform.
        //*In java, code is first compiled into bytecode, then into machine code, making the program cross-platform.

        //?The "char variable type"
        //*char is the keyword
        //*char stores one letter data
        char hello = 'I';
        System.out.println(hello);
        //*Since characters are just integers in the back of the computer, I can use ++ to increment by one.
        hello++;
        System.out.println(hello);
        //!I can assign int variables to the char type.
        //*It just prints the corresponding character for that int.
        //*Similar to int
        hello = 75;
        System.out.println(hello);

        int num = 75;
        //*I can find the character corresponding to the number by (char).
        char character = (char) num;
        System.out.println(character);

        //!IMPORTANT: Single quotes for char type, Double quotes for string type
        char character2 = 'k';
        //*Getnumeric value returns an int, but it doesn't seem right.
        //*I can create a forloop from now on after I learn that.
        System.out.println(Character.getNumericValue(character2));

        //*There is a different variable type called byte but I won't learn it.

        //?Double vs long vs float
        //*They are all numbers.
        //*Longs
        //*ints cannot store too long data, so we use longs
        //!Cannot have a decimal
        //?Somehow, I have to put a "L" at the end
        long long1 = 999999999999999999L;
        System.out.println(long1);

        //*float
        float float1 = 2.55555555555F;
        System.out.println(float1);

        //*When a float is too long, we can use a double
        //*Don't need "F"
        double double1 = 2.5555555555555666666;
        System.out.println(double1);

        //*boolean
        //!Unlike python, booleans are in lower case
        boolean boolean1 = true;


        

    }
    
}


