package ldecorator;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

@SuppressWarnings("unchecked")
public class Decorator {

	private Function<Component, Component> tags;

	private Decorator(Function<Component,Component>... decorateTags) {
		this.tags = Stream.of(decorateTags).reduce(Function.identity(), Function::andThen);
	}

	public static String operation(Component c, Function<Component, Component>... decorateTags) {
		return new Decorator(decorateTags).operation(c);
	}

	private String operation(Component c) {
		return this.tags.apply(c).operation();
	}
}
