package classes;

public class Cookie {
    private String color;
    Cookie (String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public static void main(String[] args) {
        Cookie cookie1 = new Cookie("Yello");

        cookie1.setColor("Red");
        System.out.println(cookie1.getColor());
    }
}
