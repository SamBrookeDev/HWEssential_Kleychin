package HW_07.task2;

enum Animals {
    ALLIGATOR(5), MONKEY(7), LION(3);
    int age;

    Animals(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "Animal -> " + super.toString() + " ,age -> " + age;
    }

}