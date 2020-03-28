//наследование и доступ
package different;

public class diff_30 {
    public static void main(String[] args) {


    class Employee {
        String name, email;
        int experience;
        public Employee(String name, String email, int experience){
            this.name = name;
            this.email = email;
            this.experience = experience;
        }
        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
        public int getExperience(){
            return experience;
        }
    }
    class Developer extends Employee {
        String mainLanguage;
        String[] xSkills;
        public Developer(String name, String email, int experience, String mainLanguage, String[] skills){
            super(name, email, experience);
            this.mainLanguage = mainLanguage;
            this.xSkills = skills;
        }
        public String getMainLanguage(){
            return mainLanguage;
        }
        public String[] getSkills(){
            return xSkills;
        }
    }
    class DataAnalyst extends Employee {
        boolean phd;
        String[] xMethods;
        public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods){
            super(name, email, experience);
            this.phd = phd;
            this.xMethods = methods;
        }
        public boolean isPhd(){
            return phd;
        }
        public String[] getMethods() {
            return xMethods;
        }
        }
    }
}
