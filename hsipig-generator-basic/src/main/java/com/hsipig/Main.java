package com.hsipig;

import java.io.File;

import static com.hsipig.generator.StaticGenerator.copyFilesByHutool;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 获取整个项目的根路径
        String projectPath = System.getProperty("user.dir");

        File parentFile = new File(projectPath).getParentFile();
        // System.out.println(parentFile);
        // 输入路径：ACM 示例代码模板目录
        String inputPath = new File(parentFile, "hsipig-generator-demo-projects/acm-template").getAbsolutePath();
        // 调整路径
        // String inputPath = new File("hsipig-generator-demo-projects/acm-template").getAbsolutePath();
        // 输出路径：直接输出到项目的根目录
        String outputPath = projectPath;

        copyFilesByHutool(inputPath, outputPath);
    }
}