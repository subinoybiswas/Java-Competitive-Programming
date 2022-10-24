import java.util.Arrays;

class Code {
    static void bubblesort(int array[]){
        int len = array.length;
        for(int i = 0; i < len - 1; i++)
            for(int j = 0; j< len - i -1; j++)
                if (array[j]> array[j+1]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array [j+1]=temp;
                } 
    }


    public static void main(String args[]) {
        int[] data = {2,4234,542,53,1,3,56,55};
        Code.bubblesort(data);
        System.out.println(Arrays.toString(data));
    }}