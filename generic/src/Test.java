public class Test <T,X,Z>{
    private T t;
    private X x;
    private Z z;

    public Test(T t, X x, Z z) {
        this.t = t;
        this.x = x;
        this.z = z;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Z getZ() {
        return z;
    }

    public void setZ(Z z) {
        this.z = z;
    }

    public void showInfo(){
        System.out.println("T: "+t+": "+t.getClass().getSimpleName());
        System.out.println("X: "+x+": "+x.getClass().getSimpleName());
        System.out.println("z: "+z+": "+z.getClass().getSimpleName());
    }
}
