import java.lang.reflect.Field;
import java.lang.reflect.Method;

abstract public class Reflection {
    public static boolean checkField(Class<?> clazz, String fieldName) {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            return true;
        } catch (NoSuchFieldException e) {
            return false;
        }
    }

    public static boolean checkMethod(Class<?> clazz, String methodName) {
        try {
            Method method = clazz.getDeclaredMethod(methodName);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public static boolean isClass(Class<?> clazz) {
        return clazz.isAssignableFrom(Class.class);
    }

    public static boolean isInterface(Class<?> clazz) {
        return clazz.isInterface();
    }

    public static void main(String[] args) {
        class A {
            public String f_A;
        }
        
        class B extends A { }
        
        interface X {
            void m_X();
        }
        
        class C extends B implements X {
            private String f_C;
            public void m_X() { }
        }
    }
}
