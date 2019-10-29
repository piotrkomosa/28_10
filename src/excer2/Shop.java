package excer2;



public class Shop {

    public static void main(String[] args) {

        Boxes[] box = new Boxes[4];
        box[0]= new CubicBox(6,4,5);
        box[1]= new CubicBox(3,3,2);
        box[2]= new CylinderBox(6,4);
        box[3]= new CylinderBox(5,4);
        SphereProduct sphereProduct = new SphereProduct(4,6);
        CubicProduct cubicProduct = new CubicProduct(5,4,3);

        
    }
}
