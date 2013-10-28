It demonstrates two ways to inject beans to XXXLocalServiceImpl class:

a. Inject Bean using XML config in ext-spring.xml. In the example, I have made changes to two files: FooLocalServiceImpl.java and ext-spring.xml, to inject the SampleBean to FooLocalServiceImpl class using XML config.

b. Inject Bean using @BeanReference annotation.  In the example, I have made changes to two files: FooLocalServiceImpl.java and ext-spring.xml, to inject the BarBean to FooLocalServiceImpl class using @BeanReference annotation.