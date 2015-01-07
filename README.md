# Javadoc 8 Tags

This project provides the code samples for the [**CodeFX** blog post](http://blog.codefx.org/jdk/new-javadoc-tags/) about the new Javadoc tags **@apiNote**, **@implSpec** and **@implNote**, which are first used in Java 8.

This includes:
* an interface [`Lottery`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/src/main/java/org/codefx/demo/javadoc8tags/Lottery.java) which uses them
* [implementing classes](https://github.com/CodeFX-org/demo-javadoc-8-tags/tree/master/src/main/java/org/codefx/demo/javadoc8tags) which show how to inherit the tags:
   * [`OldLottery`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/src/main/java/org/codefx/demo/javadoc8tags/OldLottery.java) does not implement the default method ~> the method has no documentation block in the class comment
   * [`PrivateLottery`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/src/main/java/org/codefx/demo/javadoc8tags/PrivateLottery.java) provides no Javadoc for its implementation ~> the documentation from the default method is copied (and a remark added) without the new tags
   * [`StateLottery`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/src/main/java/org/codefx/demo/javadoc8tags/StateLottery.java) uses `{@inheritDoc}` ~> inherits the documentation without the new tags
   * [`UselessLottery`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/src/main/java/org/codefx/demo/javadoc8tags/UselessLottery.java) uses, e.g., `@apiNote {@inheritDoc}` ~> inherits those specific tags
* the [`pom.xml`](https://github.com/CodeFX-org/demo-javadoc-8-tags/blob/master/pom.xml?ts=4#L110-L133) needed to let Maven parameterize Javadoc so that it process the tags
* the [created Javadoc](https://github.com/CodeFX-org/demo-javadoc-8-tags/tree/master/target/site/apidocs) to make things a little easier for the Maven averse
