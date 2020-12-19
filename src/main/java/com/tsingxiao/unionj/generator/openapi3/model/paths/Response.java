package com.tsingxiao.unionj.generator.openapi3.model.paths;

import lombok.Data;

import java.util.Map;

/**
 * @author: created by wubin
 * @version: v0.1
 * @description: com.tsingxiao.unionj.generator.openapi3.model
 * @date:2020/12/14
 */
@Data
public class Response {

  // REQUIRED
  private String description;

  private Content content;

  // TODO
  private Map<String, Header> headers;

  // TODO
  private Map<String, Link> links;

}
