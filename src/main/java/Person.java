public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private int weight;
    private char gender;
    private int shoeSize;
    private boolean isInCollege;

    public Person() {

    }

    public Person(String name){
        this.name = name;
    }
    public Person(int age){
        this.age = age;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public Person(String name, int age, String eyeColor, int weight, char gender, int shoeSize, boolean isInCollege) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.gender = gender;
        this.shoeSize = shoeSize;
        this.isInCollege = isInCollege;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public boolean isInCollege() {
        return isInCollege;
    }

    public void setInCollege(boolean inCollege) {
        isInCollege = inCollege;
    }
}
