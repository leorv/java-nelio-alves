package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
    private String name;
    private WorkLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return WorkLevel return the level
     */
    public WorkLevel getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    /**
     * @return Double return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * @return Department return the department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * @return List<HourContract> return the contracts
     */
    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        
        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_month = calendar.get(Calendar.MONTH);

            if (c_year == year && c_month == month){
                sum += contract.totalValue();
            }
        }
        return sum;
    }


}
