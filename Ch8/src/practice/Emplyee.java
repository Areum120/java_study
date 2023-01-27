package practice;

class Employee {
    protected String name;
    protected String grade;

    public Employee(){//빈생성자를 만들고 Employee, Engineer 두 클래스 public 제거함
    }

    public Employee(String name, String grade){
        this.name = name;
    }
}

class Engineer extends Employee {

    private String skillset;


    public String getSkillset() {
        return skillset;
    }

    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }
}
