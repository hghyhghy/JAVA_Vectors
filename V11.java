
import java.util.*;



public class V11 

{

       public static void main(String[] args) 
       
       {
       
              // use of hashcode() method

              // creating an empty vector class 


              Vector<String> vc = new Vector<String>();

                vc.add("Tiger");

                            vc.add("Lion");

                                          vc.add("Cheetah");

                                                        vc.add("Rabbit");

                                                                      vc.add("Eagle");

                                                                                    vc.add("Ostrich");









                     System.out.println("The size of the vector is ");                                                                    
                                                                    
        System.out.println(vc.size());

        
                 if(vc.contains("Cat"))
                 {
                     System.out.println("Element is found");
                 }

                 else
                 {
                     System.out.println("Element is not found");
                 }



                // checking whather an elemenst is present or not

               Vector<Integer> vc1= new Vector<Integer>();

               vc1.add(20);

                              vc1.add(80);

                                             vc1.add(40);

                                                            vc1.add(50);

                                                                           vc1.add(60);

                                                                                          vc1.add(70);

                          if(vc1.contains(40))                                                                

                          {
                            System.out.println("Element is present");
                          }

                          else
                          {
                            System.out.println("Element is not present ");
                          }

       }

}
