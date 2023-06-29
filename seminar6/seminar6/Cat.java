package seminar6.seminar6;

import java.util.Random;

public class Cat {
    private String name;
    private double age;
    private String sex;
    private boolean vaccine;
    private double weight;
    private String color;

    public Cat(String name, String sex, double age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVaccinated() {
        return vaccine;
    }

    public void setVaccine(boolean vaccinated) {
        this.vaccine = vaccinated;
    }

    public void vac() {
        if (!this.isVaccinated()) {
            this.setVaccine(true);
            System.out.println("Поставили прививку");

        } else {
            if (sex == "кот") {
                System.out.println(sex + " уже привит");
            } else
                System.out.println(sex + " уже привита");
        }
    }

    public void meow() {
        Random random = new Random();
        if (sex == "кошка") {
            System.out.println(name + " мяукнула " + random.nextInt(10) + " раз.");
        } else {
            System.out.println(name + " мяукнул " + random.nextInt(10) + " раз.");
        }
    }

    public void meow(int count) {
        if (sex == "кошка") {
            System.out.println(name + " мяукнула " + count + " раз.");
        } else {
            System.out.println(name + " мяукнул " + count + " раз.");
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("\nПол: ");
        res.append(sex);
        res.append("\nИмя: ");
        res.append(name);
        res.append("\nВозраст: ");
        res.append(age);
        res.append("\nВес: ");
        res.append(weight);
        res.append("\nЦвет: ");
        res.append(color);
        res.append("\nПрививка: ");
        if (vaccine) {
            res.append("Вакцинирован");
        } else {
            res.append("Не привит");
        }
        return res.toString();
    }

}
