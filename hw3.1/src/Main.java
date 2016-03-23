import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		Group firstArt = new Group("Art", 1, 5);
		Group secondMath = new Group("Math", 2, 10);
		Group secondChemistry = new Group("Chemistry", 2, 10);
		
		Student sherrylLight = new Student("ME334235", "Sherryl", "Light", "female" , 1, 5.0);
		Student paolaHollandsworth = new Student("ME334235", "Paola", "Hollandsworth", "female" , 1, 5.0);
		Student meganCraghead = new Student("ME234456", "Megan", "Craghead", "female" , 1, 2.3);
		Student leonaLadner = new Student("ME234345", "Leona", "Ladner", "female" , 1, 4.3);
		Student bernardoEstevez = new Student("ME575243", "Bernardo", "Estevez", "male" , 1, 7.4);
		Student marylynnPlath = new Student("ME257638", "Marylynn", "Plath", "female" , 1, 3.4);
		Student barabaraKovacich = new Student("ME355653", "Barabara", "Kovacich", "female" , 1, 5.3);
		Student racquelJent = new Student("ME236876", "Racquel", "Jent", "male" , 1, 2.4);
		Student rupertTibbits = new Student("ME782245", "Rupert", "Tibbits", "male" , 1, 3.5);
		Student dreamaGusman = new Student("ME767412", "Dreama", "Gusman", "female" , 1, 1.4);
		Student opheliaClogston = new Student("ME386985", "Ophelia", "Clogston", "female" , 2, 2.6);
		Student faustoVassel = new Student("ME587412", "Fausto", "Vassel", "male" , 2, 4.3);
		Student reitaMarksberry = new Student("ME112254", "Reita", "Marksberry", "female" , 2, 5.1);
		Student meliaCrunk = new Student("ME896587", "Melia", "Crunk", "female" , 2, 6.5);
		Student sheryThweatt = new Student("ME41214", "Shery", "Thweatt", "female" , 2, 4.5);
		Student tandraKnipp = new Student("ME693625", "Tandra", "Knipp", "female" , 2, 7.4);
		Student rodrigoCharland = new Student("ME852364", "Rodrigo", "Charland", "male" , 2, 3.7);
		Student nereidaVonruden = new Student("ME963147", "Nereida", "Vonruden", "female" , 2, 3.4);
		Student effieMaeda = new Student("ME856254", "Effie", "Maeda", "female" , 2, 2.3);
		Student terrieUlrich = new Student("ME457365", "Terrie", "Ulrich", "female" , 2, 8.4);
		
		students.add(sherrylLight);
		students.add(paolaHollandsworth);
		students.add(meganCraghead);
		students.add(leonaLadner);
		students.add(bernardoEstevez);
		students.add(marylynnPlath);
		students.add(barabaraKovacich);
		students.add(racquelJent);
		students.add(rupertTibbits);
		students.add(dreamaGusman);
		students.add(opheliaClogston);
		students.add(faustoVassel);
		students.add(reitaMarksberry);
		students.add(meliaCrunk);
		students.add(sheryThweatt);
		students.add(tandraKnipp);
		students.add(rodrigoCharland);
		students.add(nereidaVonruden);
		students.add(effieMaeda);
		students.add(terrieUlrich);
		
		System.out.println("============\tAdd/Remove\t============");
		
		
		try {
			firstArt.addStudent(sherrylLight);
			firstArt.addStudent(sherrylLight);
		} catch (GroupIsFullException e) {
			System.out.println(e);
		} catch (GroupCourseDontMatchException e) {
			System.out.println(e);
		} catch (GroupException e) {
			System.out.println(e);
		}
		firstArt.listGroup();
		
		
		System.out.println("============\tArt\t============");
		
		for(Student student : students){
			System.out.println();
			try {
				firstArt.addStudent(student);
			} catch (GroupIsFullException e) {
				System.out.println(e);
				break;
			} catch (GroupCourseDontMatchException e) {
				System.out.println(e);
			} catch (GroupException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("============\tMath\t============");
		
		for(Student student : students){
			System.out.println();
			try {
				secondMath.addStudent(student);
			} catch (GroupIsFullException e) {
				System.out.println(e);
				break;
			} catch (GroupCourseDontMatchException e) {
				System.out.println(e);
			} catch (GroupException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("============\tChemistry\t============");
		
		for(Student student : students){
			System.out.println();
			try {
				secondChemistry.addStudent(student);
			} catch (GroupIsFullException e) {
				System.out.println(e);
				break;
			} catch (GroupCourseDontMatchException e) {
				System.out.println(e);
			} catch (GroupException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("============\tGroup list\t============");
		firstArt.listGroup();
		secondMath.listGroup();
		secondChemistry.listGroup();
		
	}

}
