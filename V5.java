
import java.util.*;

import java.util.Vector;

public class V5 

{

       public static void main(String[] args) 
       
       {
              
                 // creating an empty vector class

                 Vector<String> vc= new Vector<String>();

                 vc.add("JAVA");

                                  vc.add("PYTHON");

                                                   vc.add("JAVASCRIPT");

                                                                    vc.add("HTML");

                                                                                     vc.add("CSS");

                                                                                                      vc.add("C++");


                         // displaying the vector
                         
                         System.out.println("The vectors are " + ">>" + vc);

                         // verifying if the vector is empty or not 


                         System.out.println("Is the vector empty" + ">>" + vc.isEmpty());

                         // clearing all elements of the vector

                         vc.clear();

                         System.out.println("Now the elements are "+ " "+ vc);

                         System.out.println("Is the list empty now ");

                         System.out.print(vc.isEmpty());

                         // creating an empty vector class for integers

                 Vector<Integer> vc1= new Vector<Integer>();

                 vc1.add(190);

                                  vc1.add(290);

                                                   vc1.add(390);

                                                                    vc1.add(490);

                                                                                     vc1.add(590);

                                                                                                      vc1.add(690);
                    // printing elements  by advance for loop

                    System.out.println("The elements are ");

                   for(Integer im:vc1)                                                                                   

                   {
                              System.out.println(im);
                   }

                   // checking if the vector is empty or not

                   System.out.println("Is the list is empty? ");

                   System.out.println(vc1.isEmpty());

                   // removing all elements 

                   vc1.removeAll(vc1);

                     System.out.println("Is the list is empty now ?");

                       System.out.print(vc1.isEmpty());



                   


       }

}
