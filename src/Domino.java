public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString(){
        return top + "/" + bottom;
    }

    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle(){
        if(top>bottom)
            flip();
    }


    public int small(){
        if (top>bottom)
            return bottom;
        else return top;
    }

    public int big(){
        if (top>bottom)
            return top;
        else return bottom;
    }
    public int compareTo(Domino other){
        System.out.println(small() + " " + other.small());
        System.out.println("This: " + top + " " + bottom);
        System.out.println("Other: " + other.getTop() + " " + other.getBottom());
        if (small() < other.small()) return -1;
        else if (small() > other.small()) return 1;
        else{
            System.out.println(big() + " " + other.big());
            if (big() < other.big()) return -1;
            else if (big() > other.big()) return 1;
            else return 0;
        }
    }

    public int compareToWeight(Domino other){
        int ct = 0;
        if (top + bottom < other.getTop() + other.getBottom())
            return -1;
        else if (top + bottom > other.getTop() + other.getBottom())
            return 1;
        else return 0;
    }

    public boolean canConnect(Domino other){
        if (top == other.getTop() || top == other.getBottom() || bottom == other.getTop() ||bottom == other.getBottom())
            return true;
        else return false;
    }
}
