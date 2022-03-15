public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.firtName = "Marian ";
        employee1.lastName = "Paździoch";
        employee1.birthdayYear = " 1965";
        employee1.workingYears = "25";

        employee2.firtName = "Krzysztof ";
        employee2.lastName = "Różalski";
        employee2.birthdayYear = " 1977 ";
        employee2.workingYears = "18";

        employee3.firtName = " Danuta ";
        employee3.lastName = " Klimek ";
        employee3.birthdayYear = " 1987 ";
        employee3.workingYears = " 6 ";

        System.out.println("pracownik nr 1 : " + employee1.firtName + employee1.lastName + employee1.birthdayYear
                + employee1.workingYears);
        System.out.println("Pracownik nr 2 : " + employee2.firtName + employee2.lastName + employee2.birthdayYear
                + employee2.workingYears);
        System.out.println("pracownik nr 3: " + employee3.firtName + employee3.lastName + employee3.birthdayYear
                + employee3.workingYears);


    }
}
