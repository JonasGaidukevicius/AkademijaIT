package lt.vtvpmc.ems.akademijait.generic;

public class Box <T>{
    private final T left;
    private final T right;

    public Box(final T left, final T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }


}
