import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println((bean2.getMessage()));

        Cat myCat = applicationContext.getBean("cat", Cat.class);
        System.out.println(myCat.getMessage());
        Cat myCat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(myCat2.getMessage());

        System.out.println("Сравним bean объектов Helloworld по ссылке "+
                (bean==bean2));
        System.out.println("Сравним bean объектов Cat  по ссылке "+
                (myCat==myCat2));


    }
}