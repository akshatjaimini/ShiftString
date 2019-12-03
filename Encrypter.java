
import java.util.*;


public class Encrypter {
	
	
	String Txt ;int  n;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		Txt = sc.nextLine();
		n = sc.nextInt();
	}
	
	void casec() {
		Txt = Txt.toUpperCase();
	}
	
	void shift() {
		String ne = "" ;
		if(n > 0) {
			for(int i = 0;i<Txt.length();i++) {
				char m = Txt.charAt(i);
				if((char)(m + n) > 'Z') {
					int ze = 0;
					for(int j = 1;j <=n;j++) {
						if((char)(m+j) == 'Z') {
							ze = j;
							break;
						}
					}
					int xe = n - ze - 1;
					ne += (char)('A'+xe);
				}else {
					ne += (char)(m+n);
				}
			}
		}else if (n < 0) {
			for(int i = 0;i<Txt.length();i++) {
				char m = Txt.charAt(i);
				if((char)(m + n) < 'A') {
					int ze = 0;
					for(int j = n;j >=1;j--) {
						if((char)(m+j) == 'A') {
							ze = j;
							break;
						}
					}
					int xe = Math.abs(n) - ze - 1;
					ne += (char)('Z'-xe);
				}else {
					ne += (char)(m+n);
				}
			}
		}else if(n == 0) {
			for(int i =0;i<Txt.length();i++) {
				ne += Txt.charAt(i);
			}
		}
		System.out.println(ne);
		
	}
	
	public static void main(String args[]) {
		Encrypter er = new Encrypter();
		er.input();
		er.casec();
		er.shift();
	}

}
