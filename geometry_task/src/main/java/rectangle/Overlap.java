package rectangle;

public class Overlap {
    private double square;
    private int intSquare;

    public int cover(){
        Rectangle r = new Rectangle(1, 1, 7, 4);
        Rectangle s = new Rectangle(2, 2, 9, 5);

        if((r.getXleft() < s.getXright()) & (r.getYbot() < s.getYtop())){
            square = Math.abs(r.getXright() - s.getXleft()) * Math.abs(r.getYtop() - s.getYbot());
        }
        else{
            System.out.println("Rectangles do not overlap");
        }
        r.calcSquare();
        s.calcSquare();
        intSquare = (int) Math.round(square);
        return intSquare;
    }
}
