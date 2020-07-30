public class twodarray{
    public static void main(String[] args){
        //Declare two dimensional array
        int [] [] numbers = {{1,2,3}, {4,5,6}};
        System.out.println(numbers[0][0]);
        System.out.println(average(numbers));
        System.out.println(access_all(numbers));
        //Iterate over a two dimensional array

    }
    //*I am going to loop over the first nested list to calculate the average
    public static double average(int [][] input){
        int total = 0;
        for (int i = 0; i < 3; i ++){
            total += input[0][i];

        }
        return total / 3;
    }
    //A function to access all items in a 2d array
    public static double access_all(int [][] input){
        int total = 0;
        int length_list = input.length;
        for (int i = 0; i < length_list; i++){
            int nested_length = input[i].length;
            for (int j =0; j < nested_length; j ++){
                total += input[i][j];
            }
        }
        return total;
    }
}