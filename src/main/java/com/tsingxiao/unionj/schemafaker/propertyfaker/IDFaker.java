package com.tsingxiao.unionj.schemafaker.propertyfaker;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.github.javafaker.Faker;

/**
 * @author: created by wubin
 * @version: v0.1
 * @description: com.tsingxiao.unionj.schemafaker
 * @date:2020/11/20
 */
public class IDFaker implements PropertyFaker {

  private Faker faker = new Faker();

  public IDFaker(Faker faker) {
    this.faker = faker;
  }

  public IDFaker() {
  }

  @Override
  public JsonNode fake() {
    return TextNode.valueOf(this.faker.internet().uuid());
  }
}
