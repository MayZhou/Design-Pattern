package com.mayzhou.dp.creating_pattern.method_factory.example.clazz;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 07:36
 * @Description:
 * @copyright:
 * @version:
 */
public class ReadXML1 {
    public static Object getObject() throws Exception{
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document;
        document = documentBuilder.parse(new File("D:\\item3\\Design-Pattern\\src\\main\\java\\com\\mayzhou\\dp\\creating_pattern\\method_factory\\example\\clazz\\config1.xml"));
        NodeList nodeList = document.getElementsByTagName("className");

        Node classNode = nodeList.item(0).getFirstChild();
        String className = "com.mayzhou.dp.creating_pattern.method_factory.example.i_factory.impl." + classNode.getNodeValue();
        Class<?> c = Class.forName(className);
        Object obj = c.newInstance();
        return obj;
    }
}
