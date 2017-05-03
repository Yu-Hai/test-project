package com.office.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import com.office.entity.User;

@SuppressWarnings("rawtypes")
public class ConstructorUtils {

	public static void autowiredByName(Object object) throws Exception {
		Class<?> clazz = object.getClass();
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			int m = constructor.getModifiers();
			String modifier = Modifier.toString(m);
			String name = constructor.getName();
			Class[] types = constructor.getParameterTypes();
			int count = constructor.getParameterCount();
			System.out.println(modifier + "	" + name + "	" + types + "	" + count);
			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.print(parameter.getName());
			}
		}
	}

	public static void autowaird(Object object) throws Exception {
		Class<?> clazz = object.getClass();
		Constructor<?>[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			Class<?>[] parameterTypes = constructor.getParameterTypes();
			Constructor<?> c = clazz.getConstructor(parameterTypes);
			
			Object bean=c.newInstance(null);
		}
	}

	public static void main(String[] args) throws Exception {
		User user = new User();
		autowiredByName(user);
	}

}
