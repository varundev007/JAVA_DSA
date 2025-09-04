package Oops.part_2_abstraction;

interface MyBank { //in interfce we can only declare methods cant implement ,cant obj of interface
    void write();
    void read();
    // declare only
}

class SBIdata implements MyBank {

    @Override
    public void write() {
        System.out.println("SBI write data");
    }

    @Override
    public void read() {
        System.out.println("SBI read data");
    }
}


