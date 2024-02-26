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

    public void setTop(int top){
        this.top=top;
    }
    public int getTop(){
        return top;
    }

    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public int getBottom(){
        return bottom;
    }



    public String toString(){
        return top + "/" + bottom;
    }

    public void flip(){
        int newTop = bottom;
        int newBottom = top;
        top = newTop;
        bottom = newBottom;
    }

    public void settle(){
        if (top>bottom){
            flip();
        }
    }
    public int compareTo(Domino other){
        settle();
        other.settle();
        if (top<other.top){
            return -1;
        }
        else if (top>other.top){
            return 1;
        }
        else{
            if (bottom<other.bottom){
                return -1;
            }
            else if (bottom>other.bottom){
                return 1;
            }
            else{
                return 0;
            }

        }
    }

    public int compareToWeight(Domino other){
        int total = top+bottom;
        int otherTotal = other.top + other.bottom;

        if (total < otherTotal){
            return -1;
        }
        if (total > otherTotal){
            return 1;
        }
        else{
            return 0;
        }
    }


    public boolean canConnect(Domino other){
        if(top == other.top || top == other.bottom || bottom == other.top || bottom == other.bottom){
            return true;
        }
        return false;
    }
}
