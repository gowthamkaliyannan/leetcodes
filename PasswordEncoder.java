package interviewProgramm;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
		
		System.out.println(passwordEncoder.encode("Reset@1234"));  
		
	}
}
