
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.lastName + " Soyisimli kullan�c� giri� yapt�.");
	}
	public void logout(User user) {
		System.out.println(user.id+ "nolu kullan�c� ��k�� yapt�.");
	}
     public void update(User user) {
    	 System.out.println(user.id + "nolu kullan�c� g�ncelleme yapt�.");
     }
	
	
     
}