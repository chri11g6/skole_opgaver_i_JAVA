public class BubbleSort {
    public static int[] sort(int[] data){
        boolean isSort = false;

        while(!isSort){
            isSort = true;
            for (int i = 0; i < data.length; i++) {
                if(i + 1 < data.length && data[i] > data[i+1]){
                    isSort = false;
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        }

        return data;
    }
}