
public class Keywords {

    String food;
    char size;

    public void setData(String food, char size) {
        this.food = food;
        this.size = size;
    }

    public static void main(String[] args) {

        Keywords t = new Keywords();
        t.setData("soup", 'L');
        System.out.println(t.food);
        System.out.println(t.size);
    }

}
