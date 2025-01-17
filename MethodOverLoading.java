public class MethodOverLoading {

    public void meth() {
        System.out.println("meth 01");
    }

    public void meth(int x) {
        System.out.println("meth 02");
    }

    public void meth(String y) {
        System.out.println("meth 03");
    }

    public static void main(String[] args) {
        MethodOverLoading Obj = new MethodOverLoading();

        Obj.meth();
        Obj.meth(5);
        Obj.meth("ravee");
    }

}
