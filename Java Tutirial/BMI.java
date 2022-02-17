public class BMI {
    public String name;
    public int age;
    public double weight;
    public double feet;
    public double inches;

    // Constructors
    public BMI(String name, int age, double weight, double feet, double inches){
        setName(name);
        setAge(age);
        setWeight(weight);
        setFeet(feet);
        setInches(inches);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;}
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;}
    }
    public double getFeet(){
        return this.feet;
    }
    public void setFeet(double feet){
        if(feet >= 0){
            this.feet = feet;}
    }
    public double getInches(){
        return this.inches;
    }
    public void setInches(double inches){
        if(inches > 0 && inches < 12)
        {this.inches = inches;}
    }
    public double getBMI(){
        double weightKilograms = this.weight*0.45359237;
        double heightMeters = ((this.feet*12)+this.inches)*0.0254;
        return weightKilograms/(heightMeters*heightMeters);
    }
    public String getResult() {
        double BMI = getBMI();
        String result;
        if (BMI < 18.5)result = "Underweight";
        else if (BMI < 25.0)result = "Normal";
        else if (BMI < 30.0)result = "Overweight";
        else result = "Obese";
        return result;
    }
}
