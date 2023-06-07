/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asdfkljalksdfj;

/**
 *
 * @author armin
 */
public class slay {
    //bubble sort algorithm
    static void bubbleSort(int[] arr, String[] arr2, int length) {
        int n = length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swaps string elements whenever a comparison is made
                    String temp2 = arr2[j-1];
                    arr2[j-1] = arr2[j];
                    arr2[j] = temp2;
                    //swaps integer elements whenever a comparison is made
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }

            }
        }
    }

    public static int stringSearch(String []arr,String target, int length) {
        int n = length;
        for(int i = 0; i < n; i++) {
            if(arr[i].equalsIgnoreCase(target) ){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //array size of 64 means we can only add up to 64 products to array
            //use *INT* arr[] for the product amount input
        int arr[] = new int[64];
            //use *STRING* arr2[] for the product name input
        String arr2[] = new String[64];

        // n is length of array
        // increments for each product added to array
        int n = 0, addRun = 1;

        Scanner am = new Scanner(System.in);
        Scanner prod = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        while (addRun == 1) {
            System.out.print("Enter product: ");
            arr2[n] = prod.nextLine();

            System.out.print("Enter amount: ");
            arr[n] = am.nextInt();

            n++;

            System.out.println("Do you want to add another product?\n" +
                    "1. Yes.\n" +
                    "2. No.");
            addRun = sc.nextInt();

            while (!(addRun == 1) && !(addRun == 2)) {
                switch (addRun) {
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Please input a valid option!");
                        System.out.println("Do you want to add another product?\n" +
                                "1. Yes.\n" +
                                "2. No.");
                        addRun = sc.nextInt();
                }
            }

        }

        //add user input for ASCENDING, DESCENDING, and SEARCH
                /*
                Menu should look like:
                Hello! What would you like to do with the inventory?
                1. Search for specific product.
                2. Sort inventory in ascending order.
                3. Sort inventory in descending order.
                */


        System.out.println(" ");

        System.out.println("Unsorted Products");
        for(int i=0; i < n; i++){
            System.out.print("Product name: " + arr2[i] + " | " + "Product amount: "+ arr[i] + "\n");
            System.out.println("-----------");
        }
        System.out.println();

        bubbleSort(arr, arr2, n);//sorting array elements using bubble sort

        System.out.println("Sorted Products (Ascending)");
        for(int i=0; i < n; i++){
            System.out.println("Product name: " + arr2[i] + " " + "\nProduct amount: "+ arr[i]);
            System.out.println(" ");
        }
        System.out.println("Sorted Products (Descending)");
        for(int i = (n - 1); i > -1; i--){
            System.out.println("Product name: " + arr2[i] + " " + "\nProduct amount: "+ arr[i]);
            System.out.println(" ");
        }

    }
}
