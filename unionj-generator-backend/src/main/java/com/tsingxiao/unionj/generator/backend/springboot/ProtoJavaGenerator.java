package com.tsingxiao.unionj.generator.backend.springboot;

import com.tsingxiao.unionj.generator.DefaultGenerator;
import com.tsingxiao.unionj.generator.GeneratorUtils;
import com.tsingxiao.unionj.generator.backend.docparser.entity.Proto;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static com.tsingxiao.unionj.generator.backend.springboot.Constants.OUTPUT_DIR;

/**
 * @author: created by wubin
 * @version: v0.1
 * @description: com.tsingxiao.unionj.generator
 * @date:2020/11/22
 */
public class ProtoJavaGenerator extends DefaultGenerator {

  private Proto proto;
  private String outputDir = OUTPUT_DIR + File.separator + "proto";
  private String packageName;

  public ProtoJavaGenerator(Proto proto, String packageName) {
    this.proto = proto;
    this.packageName = packageName + ".proto";
  }

  @Override
  public Map<String, Object> getInput() {
    Map<String, Object> input = new HashMap<>();
    input.put("packageName", this.packageName);
    input.put("base", this.proto.getBase());
    input.put("name", StringUtils.capitalize(this.proto.getName()));
    input.put("routers", this.proto.getRouters());
    input.put("imports", this.proto.getImports());
    return input;
  }

  @Override
  public String getTemplate() {
    return OUTPUT_DIR + File.separator + "proto.java.ftl";
  }

  @Override
  public String getOutputFile() {
    return GeneratorUtils.getOutputDir(this.outputDir) + File.separator + StringUtils.capitalize(this.proto.getName()) + ".java";
  }

}
