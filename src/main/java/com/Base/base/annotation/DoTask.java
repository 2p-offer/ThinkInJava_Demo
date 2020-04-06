package com.Base.base.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class DoTask {
    public static void main(String[] args) {
        DoTask doTask=new DoTask();
        doTask._testRuntimeAnnotation();
    }

    public void _testRuntimeAnnotation() {
        StringBuffer sb = new StringBuffer();
        Class<?> cls = TestRuntimeAnnotation.class;
        Constructor<?>[] constructors = cls.getConstructors();
//         获取指定类型的注解
        sb.append("Class：").append("\n");
        ClassInfo classInfo = cls.getAnnotation(ClassInfo.class);
        if (classInfo != null) {
            sb.append(Modifier.toString(cls.getModifiers())).append(" ")
                    .append(cls.getSimpleName()).append("\n");
            sb.append("data>: ").append(classInfo.value()).append("\n\n");
        }

        sb.append("Field:").append("\n");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            FieldInfo fieldInfo = field.getAnnotation(FieldInfo.class);
            if (fieldInfo != null) {
                sb.append(Modifier.toString(field.getModifiers())).append(" ")
                        .append(field.getType().getSimpleName()).append(" ")
                        .append(field.getName()).append("\n");
                sb.append("data>: ").append(Arrays.toString(fieldInfo.value())).append("\n\n");
            }
        }

        sb.append("Method：").append("\n");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
            if (methodInfo != null) {
                sb.append(Modifier.toString(method.getModifiers())).append(" ")
                        .append(method.getReturnType().getSimpleName()).append(" ")
                        .append(method.getName()).append("\n");
                sb.append("data: ").append("\n");
                sb.append("name: ").append(methodInfo.name()).append("\n");
                sb.append("data: ").append(methodInfo.data()).append("\n");
                sb.append("age: ").append(methodInfo.age()).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
