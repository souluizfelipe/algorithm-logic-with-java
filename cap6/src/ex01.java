public class ex01 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for(int i = 0; i < numbers.length; i++){
            Integer num = numbers[i];

            if(num % 3 == 0){
                System.out.print( num + ", ");
            }
        }

        System.out.println("");

        for(int i = 0; i <= 60; i++){

            if(i % 3 == 0 && i != 0){
                System.out.print( i + ", ");
            }
        }
    }
}
