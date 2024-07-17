package tobyspring.tobyspringtwo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tobyspring.tobyspringtwo.config.OrderConfig;
import tobyspring.tobyspringtwo.order.Order;
import tobyspring.tobyspringtwo.order.OrderService;

import java.math.BigDecimal;

public class OrderClient {

    public static void main(String[] args) {

        final BeanFactory beanFactory = new AnnotationConfigApplicationContext(OrderConfig.class);
        final OrderService orderService = beanFactory.getBean(OrderService.class);

        final Order order = orderService.createOrder("0100", BigDecimal.TEN);
        System.out.println(order);
    }

}
