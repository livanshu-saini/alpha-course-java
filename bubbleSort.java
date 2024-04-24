public class bubbleSort {

    public static void bubSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                // upar wali satement mein - i hata bhi dene pr result same aata
                //toh fir kyu zaroori hai yeh...time complexity?
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){

        int arr[] = {5, 4, 1, 3, 2};
        bubSort(arr);
        printarr(arr);
    }
}
