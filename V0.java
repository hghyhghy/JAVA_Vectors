
import java.util.*;

public class V0 

{
       
   public static void main(String[] args) 
   
   {
       
            // creating  vector

            Vector <String> vc= new Vector<String>();

            // adding elements by using add()  methods 

            vc.add("Tiger");

                        vc.add("Lion");

                                    vc.add("Cheetah");

                                                vc.add("Rat");

                                                            vc.add("Duck");


  // adding elements using addElements() methods 

  vc.addElement("Cat");

  Iterator <String> it= vc.iterator();

    while(it.hasNext())

    {

       System.out.println(it.next());
    }

            

   }

}
