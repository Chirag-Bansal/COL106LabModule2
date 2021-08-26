all:
	@javac Includes/*.java *.java
	@java DriverCode

clean:
	@rm *.class Includes/*.class
