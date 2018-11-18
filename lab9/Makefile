all: clean

clean: 
	find . -name "*.class" -exec rm -rf {} \;

run-decorator:
	javac decorator/*.java
	java  decorator.Tester

run-lambda-decorator:
	javac lambda_decorator/*.java
	java  lambda_decorator.LambdaTester
