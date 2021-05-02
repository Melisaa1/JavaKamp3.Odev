
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.lastName + " Soyisimli kullanýcý giriþ yaptý.");
	}
	public void logout(User user) {
		System.out.println(user.id+ "nolu kullanýcý çýkýþ yaptý.");
	}
     public void update(User user) {
    	 System.out.println(user.id + "nolu kullanýcý güncelleme yaptý.");
     }
	
	
     
}