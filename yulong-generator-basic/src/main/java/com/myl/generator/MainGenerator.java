package com.myl.generator;

import com.myl.module.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {
        //1.静态文件生成(先将整个目录复制过来)
        //获取项目路径
        String projectPath=System.getProperty("user.dir");
        //输入路径
        String inputPath=projectPath+ File.separator+"yulong-generator-demo-projects"+File.separator+"acm-template";
        //输出路径
        String outputPath=projectPath;
        System.out.println(outputPath);
        //开始复制
        StaticGenerator.copyFilesByHutool(inputPath,outputPath);

        //2.动态文件生成
        String DynamicinputPath = projectPath + File.separator + "yulong-generator-basic"+File.separator+"src/main/resources/templates/MainTemplate.java.ftl";
        String DynamicoutputPath = projectPath + File.separator + "acm-template/src/com/yupi/acm/MainTemplate.java";
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("yupi");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        DynamicGenerator.doGenerate(DynamicinputPath, DynamicoutputPath, mainTemplateConfig);
    }
}
