public class Employee {
    private Long pid;
    private String pName;
    private Boolean paid;
    private Double salary;
    private Float age;
    private Calculator calculator;

    public Employee() {
        System.out.println("Employee def const");
    }

    public Employee(Long pid, String pName, Boolean paid, Double salary, Float age, Calculator calculator) {
        System.out.println("Employee para const");
        this.pid = pid;
        this.pName = pName;
        this.paid = paid;
        this.salary = salary;
        this.age = age;
        this.calculator = calculator;
    }

    public void executeFirst() {
        System.out.println("I will execute before object Employee init");
    }

    public void executeBeforeDestroy() {
        System.out.println("I will execute before object Employee dest");
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pid == null) ? 0 : pid.hashCode());
        result = prime * result + ((pName == null) ? 0 : pName.hashCode());
        result = prime * result + ((paid == null) ? 0 : paid.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ((calculator == null) ? 0 : calculator.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (pid == null) {
            if (other.pid != null)
                return false;
        } else if (!pid.equals(other.pid))
            return false;
        if (pName == null) {
            if (other.pName != null)
                return false;
        } else if (!pName.equals(other.pName))
            return false;
        if (paid == null) {
            if (other.paid != null)
                return false;
        } else if (!paid.equals(other.paid))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (calculator == null) {
            if (other.calculator != null)
                return false;
        } else if (!calculator.equals(other.calculator))
            return false;
        return true;
    }

}
