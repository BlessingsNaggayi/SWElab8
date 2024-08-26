package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

public class CodingProblems {


    public static void main(String[] args) {

        int[] arr = {12,5,7,51,70,55,54,74};
       // printHelloWorld(arr);

        System.out.println(findSecondBiggest(arr));

    }


    //	Write a function (or method) named, printHelloWorld, that takes as input, an array of integers and
    //	iterates through them, and it prints the text, "Hello", if the integer is a multiple of 5. It prints the text,
    //	"World", if the integer is a multiple of 7. And when it encounters an integer that is a multiple of both 5 and 7,
    //	it prints the text, "HelloWorld".



    public static  void printHelloWorld(int [] arr){

        if(arr.length == 0){
            System.out.println("The array is empty");
            return;
        }

        for(int i =0;i<arr.length;i++){

            if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {

                System.out.println("HelloWorld");

            } else if (arr[i] % 7 == 0) {

                System.out.println("World");

            }else if(arr[i] % 5 == 0){

                System.out.println("Hello");
            }



        }

    }




    public  static int findSecondBiggest(int[] arr){

        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        int max = arr[0];
        int secondMax = arr[0];

        for(int i =1;i<arr.length;i++){

            if(arr[i] > max){
                max = arr[i];
            }

        }

        for(int i =0;i<arr.length;i++){

            if((arr[i]>secondMax) && (arr[i]!= max)){
                secondMax = arr[i];
            }
        }

//        System.out.println(max);
//        System.out.println(secondMax);
        return secondMax;

    }

}

