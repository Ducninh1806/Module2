public class Geometic {

    private String color= "white";
    private String filled= null;

    public Geometic(){
    }

    public Geometic(String color, String filled){
        this.color= color;
        this.filled= filled;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color= color;
    }

    public String getFilled(){
        return this.filled;
    }
    public void setFilled(String filled){
        this.filled = filled;
    }

    public String toString(){
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }

}
