package rectangle;

public class Rectangle {
    private double sideALength;
    private double sideBLength;
    private double diagLength;
    private double xleft;
    private double xright;
    private double ybot;
    private double ytop;

    public Rectangle(double xleft, double ybot, double xright, double ytop){
        this.xleft = xleft;
        this.xright = xright;
        this.ybot = ybot;
        this.ytop = ytop;
    }


    public int calcSquare(){
        sideALength = Math.abs(ybot - ytop);
        sideBLength = Math.abs(xleft - xright);
        diagLength = Math.sqrt(Math.pow(sideALength, 2) + Math.pow(sideBLength, 2));

        int intSquare = (int)(sideALength * sideBLength);
        System.out.println("Rectangle square = " + intSquare);
        return intSquare;
    }

    public double getSideALength() {
        return sideALength;
    }

    public double getSideBLength() {
        return sideBLength;
    }

    public double getDiagLength() {
        return diagLength;
    }

    public double getXleft() {
        return xleft;
    }

    public double getXright() {
        return xright;
    }

    public double getYbot() {
        return ybot;
    }

    public double getYtop() {
        return ytop;
    }
}
