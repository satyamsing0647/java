package logicBuilding;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 12:37:12 am
* Email  : satyam.3.singh@coforge.com
*/

public class Developer extends Employee{
	
    private String programmingLanguage;
    
    // Constructor for Developer
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
 
    // Getter for programming language
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
 
    // Overridden method to include programming language in the details
    @Override
    public String getDetails() {
        return super.getDetails() + ", Programming Language: " + programmingLanguage;
    }
}
