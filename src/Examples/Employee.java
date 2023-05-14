package Examples;

public class Employee {

        private String name;
        private String jobTitle;
        private double salary;

        public Employee(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public double getSalary() {
            return salary;
        }

        public void calculateSalaryIncrease(double percentage) {
            double increaseAmount = salary * (percentage / 100);
            salary += increaseAmount;
        }

        public void updateJobTitle(String newJobTitle) {
            jobTitle = newJobTitle;
        }

        public static void main(String[] args) {
            // Create an Employee object
            Employee employee = new Employee("John Doe", "Software Engineer", 5000.0);

            // Print the initial details
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Job Title: " + employee.getJobTitle());
            System.out.println("Salary: $" + employee.getSalary());

            // Calculate and apply a 10% salary increase
            employee.calculateSalaryIncrease(10);

            // Update the job title
            employee.updateJobTitle("Senior Software Engineer");

            // Print the updated details
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Job Title: " + employee.getJobTitle());
            System.out.println("Updated Salary: $" + employee.getSalary());
        }
    }


