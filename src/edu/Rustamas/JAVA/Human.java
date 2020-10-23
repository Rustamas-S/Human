package edu.Rustamas.JAVA;

public class Human {

    private String firstName;
    private String lastName;
    private int age;
    private double heigth;
    private double weight;
    private String sex;
    private String race;
    private String nationality;
    private String eyesColor;
    private String hairColor;
    private String skinColor;
    private boolean freckles;
    private Head head;
    private Legs legs;
    private Arms arms;
    private boolean isMarried;
    private int children;

    public Human(String firstName, String lastName, int age, double heigth, double weight, String sex, String race, String nationality, String eyesColor, String hairColor, String skinColor, boolean freckles, Head head, Legs legs, Arms arms, boolean isMarried, int children) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.heigth = heigth;
        this.weight = weight;
        this.sex = sex;
        this.race = race;
        this.nationality = nationality;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.freckles = freckles;
        this.head = head;
        this.legs = legs;
        this.arms = arms;
        this.isMarried = isMarried;
        this.children = children;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public boolean isFreckles() {
        return freckles;
    }

    public void setFreckles(boolean freckles) {
        this.freckles = freckles;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Arms getArms() {
        return arms;
    }

    public void setArms(Arms arms) {
        this.arms = arms;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", race='" + race + '\'' +
                ", nationality='" + nationality + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", freckles=" + freckles +
                ", head=" + head +
                ", legs=" + legs +
                ", arms=" + arms +
                ", isMarried=" + isMarried +
                ", children=" + children +
                '}';
    }
}