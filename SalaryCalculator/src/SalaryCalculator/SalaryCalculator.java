package SalaryCalculator;

public class SalaryCalculator {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1985, 45, 2000, "Kemal");
		System.out.println("Ad� :" + emp1.getName());
		System.out.println("Maa�� : " + emp1.getSalary());
		System.out.println("�al��ma Saati : " + emp1.getWorkHours());
		System.out.println("Ba�lang�� Y�l� : " + emp1.getHireYear());
		System.out.println("Vergi:" + emp1.tax());
		System.out.println("Bonus:" + emp1.bonus());
		System.out.println("Maa� Art���:" + emp1.increase());
		double totalSalary = emp1.getSalary() - emp1.tax() + emp1.bonus();
		System.out.println("Vergi ve Bonuslar ile birlikte maa�:" + totalSalary);
		double totalsalarynet = emp1.getSalary() + emp1.increase();
		System.out.println("Toplam Maa�:" + totalsalarynet);

	}
}
