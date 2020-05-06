public class Udemy2 {
    public static void main(String[] args) {
        double[] mylist = {1.2, 1.3, 2.5, 6.2};
        double total = 0;
        double max = mylist[0];
        for (double numbers : mylist) {
            if (max < numbers) {
                max = numbers;
            }
            total = total + numbers;
            System.out.println(numbers);
        }
        System.out.println("Toplam= " + total);
        System.out.println("En Büyük= " + max);
    }
}
