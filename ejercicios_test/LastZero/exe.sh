#!/bin/sh

javac -cp ../hamcrest-core-1.3.jar:../junit-4.12.jar:. lastZero.java
javac -cp ../hamcrest-core-1.3.jar:../junit-4.12.jar:. AllTests.java
java  -cp ../hamcrest-core-1.3.jar:../junit-4.12.jar:. AllTests
