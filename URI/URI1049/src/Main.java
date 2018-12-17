import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s1=scan.nextLine();
    String s2=scan.nextLine();
    String s3=scan.nextLine();

	if (s3.equals("onivoro")) {if (s2.equals("ave")) {System.out.println("pomba");}
	else if (s2.equals("mamifero")) {System.out.println("homem");}
	else if (s2.equals("anelideo")) {System.out.println("minhoca");}}
	if (s3.equals("herbivoro")) {if (s2.equals("mamifero")) {System.out.println("vaca");}
	else if (s2.equals("inseto")) { System.out.println("lagarta");} }
	if (s3.equals("hematofago")) {if (s2.equals("inseto")) {System.out.println("pulga");}
	else if (s2.equals("anelideo")) {System.out.println("sanguessuga");} }
	if (s3.equals("carnivoro")) {System.out.println("aguia");}



        /// / write your code here
    }
}
