
import java.util.*;


public class V9 

{

       public static void main(String[] args) 
       
       
       {
       
              // use of subList()  method 

              Vector<Integer> vc1= new Vector<Integer>();

               vc1.add(20);

                              vc1.add(80);

                                             vc1.add(40);

                                                            vc1.add(50);

                                                                           vc1.add(60);

                                                                                          vc1.add(70);

            System.out.println("The vector elements are  " + ">>" + vc1);
            
            // use the subList()  method to get the sublist()


            List<Integer> subList= vc1.subList(2, 5);

            System.out.println("Sublist elements are ");

            // iterating through the lopp advance for loop 


            for(Integer in:subList)

            {

              System.out.println(in);
            }

              // creating an empty vector class of string 


             Vector<String> vc = new Vector<String>();

                vc.add("Tiger");

                            vc.add("Lion");

                                          vc.add("Cheetah");

                                                        vc.add("Rabbit");

                                                                      vc.add("Eagle");

                                                                                    vc.add("Ostrich");

         System.out.println("The components of the  vectors are ");

         System.out.println(vc);

                  List<String> subList1= vc.subList(2, 5);
   

                  System.out.println("Sublist elements are ");

   for(int i=0; i<subList1.size();i++)

   {

       System.out.println(subList1.get(i));
   }

       }

}
