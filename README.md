# Javadoc 8 Tags

This project provides the code samples for the [**CodeFX** blog post](http://blog.codefx.org/jdk/new-javadoc-tags/) about the new Javadoc tags **@apiNote**, **@implSpec** and **@implNote**, which are first used in Java 8.

This includes:
* an interface [`Lottery`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/src/main/java/org/codefx/demo/javadoc8tags/Lottery.java) which uses them
* [implementing classes](https://github.com/CodeFX-org/demo-javadoc-8-tags/tree/master/src/main/java/org/codefx/demo/javadoc8tags) which show how to inherit the tags
* the [`pom.xml`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/pom.xml?ts=4#L110-L133) needed to let Maven parameterize Javadoc so that it process the tags
* the [created Javadoc](https://github.com/CodeFX-org/demo-javadoc-8-tags/tree/master/target/site/apidocs) to make things a little easier for the Maven averse
