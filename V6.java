
import java.util.*;

import java.util.Vector;



public class V6

{

       public static void main(String[] args)
       
       {
       
              // use of equals to method 

              // creating an empty vector class  with object vc 

              Vector <String> vc= new Vector<String>();

              // adding elements to vc 

              vc.add("Subham");

                            vc.add("Sagar");

                                          vc.add("Saikat");

                                                        vc.add("Samrik");

                                                                      vc.add("Swarnodip");

                                                                                    vc.add("Sutam");
  

                        // printing the size of the vector 
                        
                        System.out.println("The size of the vector is ");

                        System.out.println(vc.size());

                        //printing the hashcode of the vector

                        System.out.println("The hashcode of the vector vc is ");

                        System.out.println(vc.hashCode());

                        // creating another empty vector class to compare 

                       
                        Vector <String> vc1= new Vector<String>();


                         vc1.add("Subham");

                            vc1.add("Sagar");

                                          vc1.add("Saikat");

                                                        vc1.add("Samrik");

                                                                      vc1.add("Swarnodip");



                                 // checking wheather two vectors are equal or not 
                                 
                                 System.out.println("Are two vectiors vc and vc1 Equal?");

                                 System.out.println(vc.equals(vc1));

                                 // the equal()  method is  boolean  so it will return true eitheer false 
                                 
                                 // now let us check the same for a vector integers 

                        Vector <Integer> vc2= new Vector<Integer>();

                        vc2.add(100);
                        
                                    vc2.add(200);

                                        vc2.add(300);

                                   vc2.add(400);

                                       vc2.add(500);

                                     vc2.add(600);

                                     
    System.out.println("The size of the vector is ");

                        System.out.println(vc2.size());

                        //printing the hashcode of the vector

                        System.out.println("The hashcode of the vector vc is ");

                        System.out.println(vc2.hashCode());



                        Vector <Integer> vc3= new Vector<Integer>();

                        vc3.add(145);

                                                vc3.add(245);

     System.out.println("Are two vectiors vc and vc1 Equal?");

                                 System.out.println(vc2.equals(vc3));                                            

       }

}
