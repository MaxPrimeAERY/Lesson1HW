package Task1;

/**
 * Created by Maximus on 06.08.2017.
 */
public class Cat {
    private String color;
    private String breed;//порода
    private int age;
    private String gender;

    public Cat(String color, String breed, int age, String gender) {
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }

    public Cat() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender=="Male"||gender=="Female"){
            this.gender = gender;
        }else{
            return;
        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
