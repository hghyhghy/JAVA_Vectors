
import java.util.*;

        

public class V2 

{

       public static void main(String[] args) {
              
                     // creating an object vc in class vector 

       
              Vector<Integer> in = new Vector<Integer>();
       
              in.add(56);
       
                     in.add(96);
       
                            in.add(86);
       
                                   in.add(65);
       
                                          in.add(109);

                                              in.add(39);

                                                  in.add(29);


                                          
       
       // display the elements of vectors 

       System.out.println("The elements of the vectors are " + ">>" + in);

       // to delete the first occurance of the vector 

       System.out.println("After removing the first occurance it will be " + ">>" + in.remove((Integer)96));

       // displaying the vector elements after removal 

       System.out.println("Now the vector list becomes " + " >>" + in);

       //removing the elements at index 4 

       System.out.println(in.remove(4));

       System.out.println("After deleting the index 4 node the list becomes " + " >>" + in);

       // removing an element by using removeElementAt method 

       in.removeElementAt(0);

       System.out.println("Now the list becomes" + " >>" + in);

       // printing the hashcode of the vector list

       System.out.println("The hashcode of the  vector list is " + ">>"+ in.hashCode());

       // printing an element of a specified index 

       System.out.println("The element of the index 2 is" + ">>"+ in.get(2));
       }

}
