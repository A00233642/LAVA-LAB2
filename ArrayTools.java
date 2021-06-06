   //TAIWO AKINTUNDE
   //A00233642
   //Application development
   //This program allows a user input + a key to be encrpted returing the encrpted string, and decrypted,
  //Also a method to find the average in an array, to search for a value in an array and reversing an array

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayTools{

     public static void main(String[]args){

          //use Scanner to collect input from user
          Scanner input = new Scanner(System.in);
          String Text;
          int Key;

       	  System.out.println("Please enter message to be encrypted: ");
       	  Text = input.nextLine();

          System.out.println("Please enter key ");
       	  Key = input.nextInt();
       	  String encryptedText = EncryptText(Text, Key);
       	  System.out.println("The Encrypted Text: "+encryptedText);
          System.out.println("The Decrypted Text: "+DecryptText(encryptedText,Key));
          System.out.println();

          int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
          int n = arr.length;
          System.out.println("10, 2, 3, 4, 5, 6, 7, 8, 9");
          System.out.println(average(arr, n));
          System.out.println();

          int [] array1 = {10, 2, 3, 4, 5, 6, 7, 8, 9};
          reverse(array1, array1.length);
          System.out.println();

          int[] num = {10, 2, 3, 4, 5, 6, 7, 8, 9};
          int findvalue;
          System.out.println("Enter the search value: ");
          findvalue = input.nextInt();
          arraycontains(num, findvalue);

}

          //Method for encrypt
          public static String EncryptText(String message, int Key) {

       		final String ALPAHABETS = "abcdefghijklmnopqrstuvwxyz";
       		message = message.toLowerCase();

       		StringBuilder cyperText = new StringBuilder();

       		for(int counter = 0;counter < message.length();counter++) {
       			if(!Character.isLetter(message.charAt(counter))) {
       				cyperText.append(message.charAt(counter));
       			}
       			else {
       				int charPosition = ALPAHABETS.indexOf(message.charAt(counter));
       				int keyValue = (charPosition + Key) % 26;

       				char cyperValue = ALPAHABETS.charAt(keyValue);

       				cyperText.append(cyperValue);
       			}
          }

       		return cyperText.toString();
}
      //Method for decrypt
         public static String DecryptText(String message, int Key) {

         final String ALPAHABETS = "abcdefghijklmnopqrstuvwxyz";

         message = message.toLowerCase();

         StringBuilder Text = new StringBuilder();

         for(int counter = 0;counter < message.length();counter++) {

         if(!Character.isLetter(message.charAt(counter))) {
         Text.append(message.charAt(counter));
         }

           else {
                 int charPosition = ALPAHABETS.indexOf(message.charAt(counter));
                 int keyValue = (charPosition - Key) % 26;

         if (keyValue < 0) {

                 keyValue = ALPAHABETS.length() + keyValue;
          }

                 char plainValue = ALPAHABETS.charAt(keyValue);

                 Text.append(plainValue);
}
}

                return Text.toString();

}

               //Method for the average of an array
               public static double average(int a[], int n)
                    {

               // Find sum of array element
                    int sum = 0;

                    for (int i = 0; i < n; i++)
                    sum += a[i];

                    return (double)sum / n;
}
          //Method for the reverse of an array
              public static void reverse(int a[], int n)
                    {
                     int[] b = new int[n];
                     int j = n;
                     for (int i = 0; i < n; i++) {
                    b[j - 1] = a[i];
                    j = j - 1;
                   }
                   //printing the reversed array
                   System.out.println("Reversed array is: ");
                   System.out.println();
                   for (int k = 0; k < n; k++) {
                   System.out.println(b[k]);
                  
}
}           //Method to search and array
              public static void arraycontains(int arr[], int toFind){

                  boolean found = false;

                  for(int n : arr){
                  if(n == toFind){
                  found = true;
                  break;
                    }
                 }
                    if(found)
                    System.out.println(toFind + " is found");
                    else{
                    System.out.println(toFind +  " is not found");

}
}
}
