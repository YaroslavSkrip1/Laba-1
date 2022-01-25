import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Main{
	public static void main(String[] args)  {
		testArray();	
	}
	public static void testArray() {
		ArrayList<Collective> arr = new ArrayList<Collective>();
		arr.add(new Collective (2000 , "���������" , 12));
		arr.add(new Collective (2008 , "����������", 15));
		arr.add(new Collective (2019 , "���������", 19));
		arr.add(new Collective (2021 , "�������", 20));
		arr.add(new Collective (2015 , "������", 5));
		arr.add(new Collective (2018 , "�������",8));
		arr.add(new Collective (2020 , "�������", 17));
		
		System.out.println("�������� ������");
		for(int i = 0; i < arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		Collective maxValue = arr.stream().max(Comparator.comparing(v -> v.getValue())).get();
	
		System.out.println("\n������������ �������� " + maxValue);
		
		Collective minValue = arr.stream().min(Comparator.comparing(v -> v.getValue())).get();
		
		System.out.println("\n����������� �������� " + minValue);
		
		arr.sort(Comparator.comparing(Collective :: getValue));
	
		System.out.println("\n��������������� ������");
		for(int i = 0; i < arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("\n��������������� �� ���������� ���������� ���������");
		arr.sort(Comparator.comparing(Collective :: getColvo).reversed());
		for(int i = 0; i < arr.size();i++) {
			System.out.println(arr.get(i));
		}
		Scanner scan = new Scanner(System.in);
		
		ArrayList<CoolectAndValue> list = new ArrayList<CoolectAndValue>();
		list.add(new CoolectAndValue (2000 , 12));
		list.add(new CoolectAndValue (2008 , 15));
		list.add(new CoolectAndValue (2019 , 19));
		list.add(new CoolectAndValue (2022 , 20));
		list.add(new CoolectAndValue (2015 , 5));
		list.add(new CoolectAndValue (2017 , 8));
		list.add(new CoolectAndValue (2020 , 17));
		
			 System.out.println("Enter your value: ");
		int a = scan.nextInt();
		
		System.out.println("���������� � ������ ������ ���� ���� �������� \n" + list
		           .stream().filter((build) -> build.values % 2 == 0)
		           .collect(Collectors.toList()));

		
		System.out.println("���������� � �������� ����������� ��������� \n" + list
		           .stream().filter((country) -> country.year > a && country.year % 2 == 1)
		           .collect(Collectors.toList()));
		
		
		
		
		

       
	}
}
