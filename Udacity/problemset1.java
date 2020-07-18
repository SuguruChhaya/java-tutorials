public class problemset1 {
    public static void main(String[] args) {
        int bankBalance = 500;
        bankBalance += 250;
        bankBalance -= 100;
        System.out.println(bankBalance);

        System.out.println(2.0 * (5/2));
        //*Since 5, 2 are both int, result is 2. Since 2.0 is double, result is 4.0

        //*Java's string formatting isn't as good as python's f"", but printf is good enough i guess.
        //?But printing on different lines is a hard task. I think .format is a much better option.

        String firstName = "Suguru";
        String lastName = "Chhaya";
        String fullName = firstName + " " + lastName;
        //*Use .length() to find length of a string
        int lengthName = firstName.length() + lastName.length();
        System.out.println(String.format("Hello, my name is %s.", fullName));
        System.out.println(String.format("There are %d letters in my name.", lengthName));

        double fahrenheight = 84.2;
        double celsius = (fahrenheight - 32) * 5 / 9;
        System.out.println(celsius);

    }
    
}