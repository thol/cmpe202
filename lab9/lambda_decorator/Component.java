package lambda_decorator;

public interface Component {

	String operation();

	static Component withEmTag(Component c) {
		return new Component() {
			@Override
			public String operation() {
				return "<em>" + c.operation() + "</em>";
			}
		};
	}

	static Component withH1Tag(Component c) {
		return new Component() {
			@Override
			public String operation() {
				return "<h1>" + c.operation() + "</h1>";
			}
		};
	}

}
