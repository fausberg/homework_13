package task2;

public class Main {
    public static void main(String[] args) {
        CustomList<String> customList = new CustomList();

        customList.add("jgslkjl");
        customList.add("jgslkjl");
        customList.add("Vany");

        customList.delete(2);
        String s = customList.Element(2);
        System.out.println(s);
        customList.sout();

        System.out.println(customList.serch("adskwjlkadL"));

        customList.clear();
        customList.sout();
    }
}
