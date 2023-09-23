

import java.util.*;




public class V10 

{

       public static void main(String[] args)
       
       {
       
              // use of list iterator 


              // creating an emprty vector class of string 

               Vector<String> vc = new Vector<String>();

                vc.add("Tiger");

                            vc.add("Lion");

                                          vc.add("Cheetah");

                                                        vc.add("Rabbit");

                                                                      vc.add("Eagle");

                                                                                    vc.add("Ostrich");

                                                                                    
                                     // using listIterator()  mothod  with a return index 1
                                     
                                ListIterator<String> li= vc.listIterator(1);
                                
                 System.out.println("Iterated elements are ");               

                 // while loop

                 while(li.hasNext())

                 {

                     System.out.println(li.next());
                 }


              // creating an emprty vector class of Integer

Vector<Integer> vc1= new Vector<Integer>();

               vc1.add(20);

                              vc1.add(80);

                                             vc1.add(40);

                                                            vc1.add(50);

                                                                           vc1.add(60);

                                                                                          vc1.add(70);


          ListIterator<Integer> l1= vc1.listIterator(1);
          
          System.out.println("Iterated elemens are ");


          while(l1.hasNext())

          {

              System.out.println(l1.next());
          }

       }

}
