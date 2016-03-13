package com.github.angelndevil2.xii4j.util;

import java.lang.reflect.InvocationTargetException;

/**
 * @since 0.0.2
 *
 * @author k, Created on 16. 3. 13.
 */
public class ReflectionUtil {


    /**
     *
     * @param clazz
     * @param method
     * @return Object
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static Object invokeMethod(final Object clazz, final String method)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return clazz.getClass().getMethod(method).invoke(clazz);
    }

    /**
     * check interface is in extended interfaces array
     *
     * @param itf interface class for check, not null
     * @param interfaces interfaces list, not null
     * @return true, if itf is in interfaces
     */
    public static boolean isInterfaceInInterfaceArray(final String itf, final Class<?>[] interfaces) {

        if (itf == null) throw new IllegalArgumentException("String argument is null");
        if (interfaces == null) throw new IllegalArgumentException("Class<?>[] argument is null");

        for (Class cls : interfaces) if (cls.getCanonicalName().equals(itf)) return true;
        return false;
    }
}
