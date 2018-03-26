package com.dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"com/model"})
@EnableAutoConfiguration
public class DaoTestConfiguration {
}
