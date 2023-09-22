
import java.util.*;

import java.util.Vector;

// import javax.swing.plaf.synth.SynthOptionPaneUI;

public class V3 


{

       
public static void main(String[] args)

{


       // determining the capacity of the vector


       // creating an class in vector


       Vector<Integer> vc2= new Vector<Integer>();

       vc2.add(78);

              vc2.add(58);

                     vc2.add(68);

                            vc2.add(98);

                                   vc2.add(18);

                                          vc2.add(38);

                               printing the capacity of the vector
                               
                               
                             System.out.println("The capacity of the vector is " + ">>" + vc2.capacity());

            Vector<String> vc3= new Vector<String>();

            vc3.add("A");

                        vc3.add("B");

                                vc3.add("C");

                                            vc3.add("R");


                              System.out.println("The capacity of the vector is " + ">>" + vc3.capacity());  

                        



       
// creating an object in class vector 

  Vector <String> vc= new Vector<String>();

  // adding new elements to the vector
  
  vc.add("Subham");

    vc.add("Saikat");

      vc.add("Swarnodip");

        vc.add("Tonmoy");

          vc.add("Sutam");

            vc.add("Soumyadeep");

            System.out.println("The original vectors are " + ">>" +  vc);

            // cloning the vector 

            System.out.println("The cloned vector is" + ">>" + vc.clone());


            // creating a new object in class vector


            Vector<Integer> vc1= new Vector<Integer>();

            vc1.add(56);

                        vc1.add(46);

                                    vc1.add(36);

                                                vc1.add(26);

                                                            vc1.add(86);

                                                                        vc1.add(96);

// printing all  the available elements in the lopp using advance for loop

for(Integer num:vc1)

{

  System.out.println("Numbers are " + ">>" + num);
}


cloning the vector

 vecclone =vc1.clone();

System.out.println("Elements ion vecclone vectors are ");

for(Integer num:vecclone)

{
       System.out.println("Numbers=" + ">>" + num);
}





}

}
