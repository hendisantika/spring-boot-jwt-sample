package com.hendisantika.springbootjwtsample.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/08/18
 * Time: 07.39
 * To change this template use File | Settings | File Templates.
 */
public interface StudentRepo extends CrudRepository<Student, Long> {
}
