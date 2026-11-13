package trees;

public class TreeException extends Throwable {
    public TreeException(String s) {
        throw new Exception(s);
    }
}
