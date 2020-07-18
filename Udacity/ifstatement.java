/**
 * ifstatement
 */
public class ifstatement {

    public static void main(String[] args)
    {
        //*Booleans are used for decision making
        boolean price = true;
        //*Basic if statements
        if (price){
            System.out.println("Price value is true!");
        }
        else{
            System.out.println("Pirce value is false!!");
        }
        boolean greenLight = true;
        if (greenLight){
            System.out.println("Go!!");
        }

        else{
            System.out.println("Stop!!");

        //*Of course, if a variable is declared inside an if statement, it can no longer be used in other if statements

        }

        String colour = "yellow";
        if (colour == "green"){
            System.out.println("Go!!");
        }
        else if (colour == "yellow"){
            System.out.println("Slow down");
        
        }
        else{
            System.out.println("Stop!!");
        }

        //*Like python, there are three main logical operators: or(||), and(&&), and not(!)

        if (3 < 5 && 2<1){
            System.out.println("Passed!!");
        }

        else if (3 < 5 && !(2<1)){
            System.out.println("Next");

        }

        //!Order of operation is 1. parenthesis, 2. not, 3. and 4. or

        //*For nested if statements, the nested if must be surrounded by the first if statement curly brackets
        if (3 < 5 || 4 < 2){
            if (7<6){
                System.out.println("Lol");}
            System.out.println("Haha");
            }
        
    }


        
}

