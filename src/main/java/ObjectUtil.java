public class ObjectUtil {
    public static boolean isExist(Object... objects) {
        for (Object object: objects) {
            if (object == null ||
                (object instanceof String && "".equals(object) )) {
                return false;
            }
        }

        return true;
    }
}