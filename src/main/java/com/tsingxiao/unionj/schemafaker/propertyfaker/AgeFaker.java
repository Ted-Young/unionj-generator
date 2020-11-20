package com.tsingxiao.unionj.schemafaker.propertyfaker;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.github.javafaker.Faker;

/**
 * @author: created by wubin
 * @version: v0.1
 * @description: com.tsingxiao.unionj.schemafaker
 * @date:2020/11/20
 */
public class AgeFaker implements PropertyFaker {

  private Faker faker = new Faker();

  public AgeFaker(Faker faker) {
    this.faker = faker;
  }

  public AgeFaker() {
  }

  @Override
  public JsonNode fake() {
    return IntNode.valueOf(this.faker.random().nextInt(18, 100));
  }
}
