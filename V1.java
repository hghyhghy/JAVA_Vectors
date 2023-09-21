
import java.util.*;


public class V1 

{
       
   public static void main(String[] args)
   
   {
   
       // creating an object vc in class vector

       Vector<Integer> vc= new Vector<Integer>();

       // by add() method

       vc.add(50);

              vc.add(30);

                     vc.add(20);

                            vc.add(40);

                                   vc.add(60);


                       // printing the size of the vector
                       
                   System.out.println("The Length of the vector is ");    

                   System.out.print(vc.size());

                   // by  adElement()  method

              vc.addElement(98);


              Iterator <Integer> itr= vc.iterator();

              while(itr.hasNext())

              {

                     System.out.println(itr.next());
              }

              // cheacking wheather an element is present in vector or not



                 if (vc.contains(40))

                 {
                     System.out.println("The Element is present ");
                 }

                 else

                 {
                     System.out.println("The element is not present ");
                 }


   }

}
