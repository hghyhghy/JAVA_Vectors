
import java.util.*;

import java.util.Vector;



public class V7 

{

       public static void main(String[] args) 
       
       
       {
       
              // use of .firstelement ()  method 
              
              // creating an empty vector class  of string 
              
              Vector<String> vc= new Vector<String>();

              vc.add("Tiger");

                            vc.add("Lion");

                                          vc.add("Cheetah");

                                                        vc.add("Rabbit");

                                                                      vc.add("Eagle");

                                                                                    vc.add("Ostrich");

System.out.println("Size of the vector is ");

  System.out.println(vc.size());

  System.out.println("The hashcode of the vector is ");

  System.out.println(vc.hashCode());

  // method to get the first element from the vector

  System.out.println("The firts elemens of the vector is  '");

  System.out.println(vc.firstElement());


                // creating an empty vector class  of integer

               Vector<Integer> vc1= new Vector<Integer>();

               vc1.add(20);

                              vc1.add(30);

                                             vc1.add(40);

                                                            vc1.add(50);

                                                                           vc1.add(60);

                                                                                          vc1.add(70);

System.out.println("Size of the vector is ");

  System.out.println(vc1.size());

  System.out.println("The hashcode of the vector is ");

  System.out.println(vc1.hashCode());

  // method to get the first element from the vector

  System.out.println("The firts elemens of the vector is  '");

  System.out.println(vc1.firstElement());

       }

}
