package practice;

import java.util.Arrays;

public class Datastructures {
	
	
	
//	public static boolean OnlyDigits(String str,int n) {
//		for(int i=0;i<n;i++) {
//			if(str.charAt(i)<'0' || str.charAt(i)>'9') {
//				return false;
//			}
//		}
//		return true;
//	}

	public static void main(String[] args) {
		
//		String str="03";
//		int len=str.length();
//		boolean result=OnlyDigits(str,len);
//		System.out.println(result);
//-------------------------------------------------------------		
//		String s1="worth";
//		String s2="throw";
//		
//		char s[]=s1.toCharArray();
//		char a[]=s2.toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(s);
//
//		boolean r1=Arrays.equals(a,s);
//		
//			if(r1) {
//				System.out.println("Anagram");
//			}else {
//				System.out.println("Not anagram");
//			}
//		----------------------------------------------------------
		
//		String one="sammys";
//		char nonRep=' ';
//		int index=-1;
//		
//		
//		for(char o:one.toCharArray()) {
//			if(one.indexOf(o)==one.lastIndexOf(o)) {
//				nonRep=o;
//				break;
//			}else {
//				index+=1;
//			}
//		}if(index==1) {
//			System.out.println("No repeating chars");
//		}else {
//			System.out.println(nonRep);
//		}
//	---------------------------------------------------------------
		
		String name="sayyam";
		String nameRev="";
		
		
		for(char i=0;i<=name.length()-1;i++) {
			char str=name.charAt(i);
			nameRev=str+nameRev;
		}
		
		System.out.println(nameRev);
//   --------------------------------------------------------------

//		String first="alphabet";
//		
//		int vow=0;
//		int cons=0;
//		
//		for(int i=0;i<first.length();i++) {
//			if(first.charAt(i)=='a' || first.charAt(i)=='e' || first.charAt(i)=='i' || first.charAt(i)=='o' || first.charAt(i)=='u') {
//				vow++;
//			}
//			else if(first.charAt(i)!='a' && first.charAt(i)!='e' && first.charAt(i)!='i' && first.charAt(i)!='o' && first.charAt(i)!='u'){
//				cons++;
//			}else {
//				System.out.println("Not a character");
//			}
//		}
//		System.out.println("Vowels: "+vow);
//		System.out.println("Consonants: "+cons);
		
//		-------------------------------------------------------------
		
//		String str="sayyam";
//		
//		
//		char occ='s';
//		char occ1='a';
//		char occ2='y';
//		char occ3='m';
//		int count=0;
//		int count1=0;
//		int count2=0;
//		int count3=0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==occ) {
//				count++;
//			}
//			else if(str.charAt(i)==occ1) {
//				count1++;
//			}
//			else if(str.charAt(i)==occ2) {
//				count2++;
//			}
//			else if(str.charAt(i)==occ3) {
//				count3++;
//			}
//		}
//		
//		System.out.println(occ + ": " +count);
//		System.out.println(occ1 + ": " +count1);
//		System.out.println(occ2 + ": " +count2);
//		System.out.println(occ3 + ": " +count3);
		
//		-----------------------------------------------------------
		
//		String str="samas";
//		String revStr="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			char a=str.charAt(i);
//			revStr=revStr+a;
//		}
//		
//		System.out.println(revStr);
//		if(revStr.equals(str)) {
//		System.out.println("Palin");
//		}else {
//			System.out.println("Not a pal");
//		}
		
//		----------------------------------------------------------
		
		
//		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
//		
//		for(int i = 0;i < arr.length; i++) {
//			for(int j = i + 1 ; j < arr.length; j++) {
//				if(arr[i] == arr[j])
//					System.out.println(arr[j]);
//			}
//		}	
//		----------------------------------------------------------
		
//		int[] arr = new int[] {1, 2, 3, 4, 9, 7, 8};
//		
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			else if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println(max + " " + min);
		
//		-----------------------------------------------------------
		
//		int sum=5;
//		int[] a=new int[] {1,2,3,4,5};
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]+a[j]==sum) {
//					System.out.println(a[i]+" "+a[j]);
//				}
//			}
//		}
		
//		-----------------------------------------------------------
		
//		int[] a=new int[] {1,2,3,4,5,1};
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println();
//				}
//			}
//		}
		
//		---------------------------------------------------------
		
		//Reverse an int array
		
//		int[] arr = {1,2,3,4,5};
//		int n=arr.length;
//		int[] rev= {};
//		
//		for(int i=0;i<arr.length;i++) {
//			rev[arr.length-1]=arr[i];
//			n--;
//		}
//		
//		for(int k=0;k<n;k++)
//		System.out.println(rev[k]);

		
	}

}
