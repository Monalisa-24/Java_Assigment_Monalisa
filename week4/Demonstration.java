import java.util.*;

class Building{

    // public Building(int f, int r, double roomArea, double footage){
    //     this.floorNo = f;
    //     this.roomNo = r;
    //     this.roomArea = roomArea;
    //     this.footage = (floorNo*roomNo*roomArea);
    // }

    public void demonstrate(int floorNo, int roomNo, double roomArea, double footage){
        System.out.println("The number of floor : "+floorNo);
        System.out.println("The number of room  : "+roomNo);
        System.out.println("The area of room  : "+roomNo);
        System.out.println("The total footage  : "+(floorNo*roomNo*roomArea)+" sq.ft.");
    }
}

class House extends Building{
    

    // public House(int f, int r, double roomArea, double footage, int bedroomNo, int bathroomNo){
    //     super(f, bathroomNo, roomArea, footage);
    //     this.bedroomNo = bedroomNo;
    //     this.bathroomNo = bathroomNo;
    // }


    public void demonstrate(int floorNo, int roomNo, double roomArea, double footage, int bedroomNo, int bathroomNo){
        super.demonstrate(floorNo, roomNo, roomArea, footage);
        System.out.println("The number of Bedroom  : "+bedroomNo);
        System.out.println("The area of Bathroom  : "+bathroomNo);
    }
}


public class Demonstration {
    public static void main(String[] args) {
        House h = new House();

        Scanner sc = new Scanner(System.in); 

        int floorNo, roomNo, bedroomNo, bathroomNo;
        double roomArea, footage = 0;

        System.out.println("ENter the number of floor : ");
        floorNo = sc.nextInt();
        System.out.println("ENter the number of room : ");
        roomNo = sc.nextInt();
        System.out.println("ENter the area of room : ");
        roomArea = sc.nextDouble();
        System.out.println("ENter the number of bedroom : ");
        bedroomNo = sc.nextInt();
        System.out.println("ENter the number of bathroom : ");
        bathroomNo = sc.nextInt();

        h.demonstrate(floorNo, roomNo, roomArea, footage, bedroomNo, bathroomNo);
    }
}
