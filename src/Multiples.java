public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        int i = 0;
        while (i<1001) {
            if ((i % 3 == 0) || (i % 5 == 0)){
                counter++;
            }
            i++;
        }
        System.out.println(counter);
    }


}

