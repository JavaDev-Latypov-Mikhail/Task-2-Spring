public class Cat {

    private String name;
    private int age;
    private int tailLength;
    private String furColor;
    private String breed;
    private String gender;
    private double weight;
    private String dateOfBirth;
    private String specialMarkings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecialMarkings() {
        return specialMarkings;
    }

    public void setSpecialMarkings(String specialMarkings) {
        this.specialMarkings = specialMarkings;
    }


    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", tailLength=" + tailLength +
               ", furColor='" + furColor + '\'' +
               ", breed='" + breed + '\'' +
               ", gender='" + gender + '\'' +
               ", weight=" + weight +
               ", dateOfBirth='" + dateOfBirth + '\'' +
               ", specialMarkings='" + specialMarkings + '\'' +
               '}';
    }
}
