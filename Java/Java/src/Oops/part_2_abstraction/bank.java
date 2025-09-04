package Oops.part_2_abstraction;

public abstract class bank {
    String name;

    void method(){
        System.out.println("I can read the data");
    }

    abstract void readData();//with abstract keyword we can only declare the method, cant implement
    abstract void writeData();
}

class Admin extends bank{// now we need to implement abstract method declared in abstract class
    void readData() {

    }

    void writeData() {

    }
}

class Marketing extends bank{

    @Override
    void readData() {

    }

    @Override
    void writeData() {

    }
}

