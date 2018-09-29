# Code Kata clojure!

Clojure is a LISP style functional language for the JVM, it can be transpiled to JavaScript, or compiled for the CLR. But
more commonly it is intended for the JVM.

This clojure project initialised using lein. To run this project:
* Add the clojure plugin to intellij IDEA. Intellij will then be able to download the other required jars.
* make `lein` executable.
* run `./lein` or `lein.bat` this will set up the project locally.

# Run tests

Tests do not run as expected in IntelliJ. Instead use `lein test`.

It is also possible to test a single test, helpfully `lein` provides this command on test execution failure, allowing 
any particular test to be re-run from the command line.

