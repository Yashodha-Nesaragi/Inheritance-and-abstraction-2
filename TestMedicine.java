package oopsassignment5;
import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine t1=new Tablet();
		Medicine s1=new Syrup();
		Medicine o1=new Ointment();
		
		t1.setExpiryDate(20/05/2010);
		t1.setPrice(20);
		//t1.getDetails();
		
		
		
		Random rand = new Random();
		int rand_int1 = rand.nextInt(3); 
		System.out.println("Random Integers: "+rand_int1);
		if(rand_int1==0) {
			t1.displayLabel();
		}
		else if(rand_int1==1)
		{
			s1.displayLabel();
		}
		else {
			o1.displayLabel();
		}

	}

}
