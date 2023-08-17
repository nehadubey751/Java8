package programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors; 
import java.util.Arrays;

public class Stramfiltertest {
   public static void main(String[] args) {
		List<Emplyee> Emplyees=new ArrayList<Emplyee>();
		Emplyees.add(new Emplyee(11,"neha",new Address("pune",12)));
		Emplyees.add(new Emplyee(13,"vish",new Address("mumbai",122)));
		Emplyees.add(new Emplyee(14,"poojs",new Address("pune",124)));
		Emplyees.add(new Emplyee(12,"nisha",new Address("nagpur",142)));
		
        System.out.println("list of all element -----------------------");
	  
        for(Emplyee l:Emplyees) {
		 System.out.println(l);
	 }
		
	System.out.println("list of emps who are from pune (using stream using lamda):::=================================");
	Emplyees.stream().filter(emp ->emp.getEaddress().getCity().equals("pune"))
	.forEach(System.out::println);
	
	System.out.println("find list of emps whose name starts with 'A'");
	Emplyees.stream().filter(emp->emp.getEname().startsWith("n")).forEach(System.out::println);	
	
	System.out.println("whose emp is id greater than 12");
    Emplyees.stream().filter(s->s.getEid()>12).forEach(System.out::println);
    
    System.out.println("list of nums in descending order:");
    Emplyees.stream().sorted((e2,e1)->e1.getEname().compareTo(e2.getEname())).forEach(System.out::println);
  
    //convert all names of emps in upperCase.
    System.out.println("all names in capital letter is as follows.");
    Emplyees.stream().map(s->s.getEname().toUpperCase()).forEach(System.out::println);
    
	
    //sorted: The sorted method is used to sort the stream.
     List<Integer> nums=Arrays.asList(15,5,4,5,1,15,8,4,58,21);
     
     System.out.println("list of nums in ascending order:");
     nums.stream().sorted().forEach(System.out::println);
	
     System.out.println("list of square of sorted numbers");
     List<Integer> nums1=Arrays.asList(15,5,4,5,1,15,8,4,58,21);
     nums1.stream().map(n->n*n).forEach(System.out::println);
     
   

   
   }


}
