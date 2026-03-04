public class Character {
    String name;
    int age;
    String heroClass;
    Boolean Gender;
    public void createChar(String name, int age, String heroClass, Boolean Gender) {
        this.name = name;
        this.age = age;
        this.heroClass = heroClass;
        this.Gender = Gender;

        displayCharInfo();
    }

    public void displayCharInfo(){
        System.out.println("====Charater Inforamtion====");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Hero Class: " + this.heroClass);
        System.out.println("Hero Class: " + this.heroClass);
    }


}
