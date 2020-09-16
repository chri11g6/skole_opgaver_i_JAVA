public class App {
    public static void main(String[] args) throws Exception {
        int[] tal = {1,5,3,4,8,2,6,10,7,9};
        
        // int[] sortTal = BubbleSort.sort(tal);
        int[] sortTal = QuickSort.sort(tal, 0, tal.length-1);

        for (int i = 0; i < sortTal.length; i++) {
            System.out.println(sortTal[i]);            
        }
    }

}
