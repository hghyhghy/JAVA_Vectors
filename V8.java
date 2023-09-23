
import java.util.*;


public class V8

{

       public static void main(String[] args)
       
       {
       
              // use of sort() method 

              // creating an empty vector class of string 

              Vector<String> vc = new Vector<String>();

                vc.add("Tiger");

                            vc.add("Lion");

                                          vc.add("Cheetah");

                                                        vc.add("Rabbit");

                                                                      vc.add("Eagle");

                                                                                    vc.add("Ostrich");




               System.out.println("The size of the vector is ");                                                                     

               System.out.println(vc.size());

               System.out.println("The hashcode of the vector is ");

  System.out.println(vc.hashCode());

  System.out.println("The components of the vectors are " + ">>" + vc);

  Collections.sort(vc);

  System.out.println("Now the sorted components of the vectors are" + ">>" + vc);




  Vector<Integer> vc1= new Vector<Integer>();

               vc1.add(20);

                              vc1.add(80);

                                             vc1.add(40);

                                                            vc1.add(50);

                                                                           vc1.add(60);

                                                                                          vc1.add(70);

         
System.out.println("Size of the vector is ");

  System.out.println(vc1.size());

  System.out.println("The hashcode of the vector is ");

  System.out.println(vc1.hashCode());
  
  // iterating through the vector using advance for loop

  System.out.println("The elements of the vector vc1 is ");

  for(Integer in:vc1)
  
  {

       System.out.println(in);
  }


//   sorting the elements of vector vc1

Collections.sort(vc1);

System.out.println("The  sorted elements of the vector vc1 is ");

  for(Integer in:vc1)
  
  {

       System.out.println(in);
  }
}

}
