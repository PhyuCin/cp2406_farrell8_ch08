public class TwelveInts {

    public static void main(String[] args){
        int[] numbers = {23, 2, 2016, 6, 24, 4, 1995, 25, 5, 2011, 15, 3, 1996};
        StringBuilder output = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        for (int number : numbers) {
            output.append(number).append(" ");
        }

        System.out.println(output);

        for (int number : numbers) {
            reverse.insert(0, number + " ");
        }

        System.out.println(reverse);
    }
}
