
import java.sql.Array;
import java.util.*;

import java.util.Vector;


public class V4 

{

       public static void main(String[] args) 
       
       {
       
              // copying the elements of an vector

              // creating an empty vector class

              Vector<String> vc= new Vector<String>();

              vc.add("Tiger");

                            vc.add("Lion");

                                          vc.add("Buffalo");

                                                        vc.add("Cow");

                                                                      vc.add("Antelope");

                                                                                    vc.add("wildebeest");

                 // creating an new array
                 
                 
                 String tempArray[] = new String[6];


                 // copying the vector elements to an array

                 vc.copyInto(tempArray);

                 System.out.println("The elements of the array are ");

                 // using advance for loop

                 for(String temp:tempArray)

                 {

                     System.out.println(temp);
                 }
                 

                 // copying integer items to an array 


                 Vector<Integer> vc1= new Vector<Integer>();

                 vc1.add(45);

                                  vc1.add(95);

                                                   vc1.add(25);

                                                                    vc1.add(35);

                                                                                     vc1.add(65);

                                                                                                      vc1.add(105);

                    // creating a new array for inetegrs 

                    


                    Integer inArray[] = new Integer[6];

                    vc1.copyInto(inArray);

                    // printing all elements by using advance for loop

                    System.out.println("Now the elements of the integer array are ");

                    for(Integer im:inArray)

                    {

                     System.out.println(im);
                    }



       }

}
