/**
 * createarrays
 */
public class createarrays {

    public static void main(String[] args){
        System.out.println("Hi");
        //*To create an array of integers called numbers:
        //!We use curly brackets.
        int [] numbers = {1,2,3};
        System.out.println(numbers[1]);
        System.out.println(numbers[1] * numbers[2]);
        String [] whatever = {"a", "b", "c"};
        //*I am going to pick a random item from the list
        double chosen = Math.random();
        chosen *= 3;
        //*Since lists start from index 0, I don't need to add 1 to the double.
        int chosen_index = (int) chosen;
        System.out.println(whatever[chosen_index]);
        double [] temp_list = {1,2,3};
        System.out.println(average(temp_list));
        System.out.println(smallest(temp_list));


    }
    //*Creating a function that calculates the average of a list of a double

    public static double average(double [] temperatures){
        //No () for length of list
        int size_of_loop = temperatures.length;
        double total = 0;
        for (int i = 0; i < size_of_loop; i++){
            total += temperatures[i];
        }
        double average = total / size_of_loop;
        return average;
    }

    public static double smallest(double [] int_list){
        int size_of_list = int_list.length;
        double min = int_list[0];

        for (int i = 1; i < size_of_list; i++){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public String findLongestName(String [] names){
        int length_list = names.length;
        int longest = names[0];
        for (int i = 1; i < length_list; i++){
            if (names[i].length() > longest.length()){
                longest = names[i];
            }
            
        }
        return longest;


}
}