package Arrays;

public class Pass_by_ref {
    //in java pass by reference only works for objects and arrays. when we pass an array to a function, we are passing the reference of the array. so any changes made to the array inside the function will reflect in the main function as well.
    public static void update(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*2;
        }
    }
    public static void update_value(int x){
        x = x*2;
        System.out.println("After updating x: "+x);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before updating the array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        update(arr);
        System.out.println("\nAfter updating the array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        //pass by value only works for primitive data types. when we pass a primitive data type to a function, we are passing the value of the variable. so any changes made to the variable inside the function will not reflect in the main function.
        int x = 10;
        System.out.println("\nBefore updating x: "+x);
        update_value(x);
        System.out.println("After updating x in main: "+x);
    }


}
