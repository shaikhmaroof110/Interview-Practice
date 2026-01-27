package optionalClass;

import java.util.Optional;
import java.util.Scanner;

public class MessageService {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id :: ");
		int userId = sc.nextInt();
		
//		User u = new User();
//		String UserNameById = u.getUserNameById(userId);
		
//		if(UserNameById != null)  // Null check 
//		{
//			String msg = UserNameById.toUpperCase() + ", Hello";
//			System.out.println(msg);
//		}
//		else 
//		{
//			System.out.println("Invalid input ...");
//		}
		
		
		// Approach - 02
		 
		User u = new User();
		Optional<String> userName = u.getUserName(userId);
		
		if(userName.isPresent()) 
		{
			String name = userName.get(); // getting data from Optional class and then performing operation on it.
			System.out.println(name.toUpperCase() + ", Hello");
		}else 
		{
			System.out.println("No data Found ...");
		}
		
		
	}
}
