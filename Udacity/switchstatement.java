public class switchstatement {
    public static void main(String[] args) {
        //*A switch statement can test whether a certain char, string, int etc is a certain thing. It can be called as an
        //*if statement alternative.
        /*
        int num = 7;
        //*Depending on the case, the choice string will have a different value
        String choice;
        switch(num){
            case 6:
                choice = "six";
                break;
            case 7:
                choice = "seven";
                //break;

            default:
                choice = "none";
        
        }
        System.out.println("You chose " + choice);
        */
        char grade = 'Y';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!"); 
                break;
            case 'B' :
                //System.out.println("Mediocre");
                //*In the original code at https://www.tutorialspoint.com/java/switch_statement_in_java.htm
                //*When a break is not performed, the next case is ran EVEN IF THE CASE DOES NOT APPLY
                //*keeps on running the following cases until it hits a break
                //*This is why both B and C prints "Well done."
            case 'C' :
                System.out.println("Well done");
                //break;
            case 'Z' :
                System.out.println("Checking if this statement is reached");
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            
            default :
                System.out.println("Invalid grade");
        }
        //*For a statement like the following, if grade is 100% defined because it was used as a test, there will be no error.
        //*But like the commented example on the top, if a new variable is initialized based on the test cases, I have to include a default
        //*just in case none of the test cases are passed.
        System.out.println("Your grade is " + grade);
    }
    
}