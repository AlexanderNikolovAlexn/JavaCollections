public class LambdaExpressions {

	interface Executable {
		void execute();
	}

	static class Runner {
		public void run(Executable e) {
			System.out.println("run");
			e.execute();
		}
	}

	public static void main(String[] args) {

		Runner runner = new Runner();

		runner.run(new Executable() {
			public void execute() {
				System.out.println("Hello there, execute!");
			}
		});

		System.out.println("----------------------");

		// Lambda expression
		runner.run(() -> {
			System.out.println("Hello there, execute!");
			System.out.println("Execute whole block");
		});

	}

}
