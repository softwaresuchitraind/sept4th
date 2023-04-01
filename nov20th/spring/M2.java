class M2 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("config.xml");
		//BeanDefinationRegistry registy
			=(BeanDefinationRegistry)context.getAutowireCapableBeanFactory();
		//registry.removeBeanDefination("e1");

		//to remove every bean
		context.registerShutdownHook();
		System.out.println("done");
	}
}

/*

or we can use  without exteding InitializingBean and desposableBean

<bean id ="e1"
		class="com.lara.Employee"
		int-method="initialization"
		destroy-method="close">
*/