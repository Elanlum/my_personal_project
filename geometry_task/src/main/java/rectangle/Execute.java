package rectangle;

public class Execute {

    public static void main(String[] args) {

//        Rectangle r = new Rectangle(1, 1, 7, 4);
//        r.calcSquare();
//        System.out.println("Rectangle diagonale = " + Rectangle.getDiagLength());
//        System.out.println("Rectangle side A = " + Rectangle.getSideALength());
//        System.out.println("Rectangle side B = " + Rectangle.getSideBLength());
        Overlap o = new Overlap();

        System.out.println("Cover square = " + o.cover());
    }
}
