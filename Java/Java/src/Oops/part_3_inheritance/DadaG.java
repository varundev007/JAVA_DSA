package Oops.part_3_inheritance;

public class DadaG {
    String name;
    String surname= "dev";
}

class father extends DadaG{ // till here it is single level inheritance
    String name ="VD";
}

class Me extends father{ // Till here it is multi level inheritance
    String name= "Varun";
}
// son1 extends father{}, son2 extends father{} this is herarical
// son extends father and mother not possible, this is possible using interface  this is called multiple inheritance

