package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    	System.out.println(args[0]+" "+args[1]);
//    	Scanner input = new Scanner(System.in);
//        
//        int sum = 0;
//        
//        while(true) {
//        	String test = input.nextLine();
//        	if(test.equals("")) break;
//        	try {
//                sum += Integer.parseInt(test);
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Suma numerelor este "+sum);
    	
    	Test t = new Test();
    	Test t2 = new Test(1, "test");
    	System.out.println(t+" "+t2);
    	System.out.println(Test.PI);
    }
}
