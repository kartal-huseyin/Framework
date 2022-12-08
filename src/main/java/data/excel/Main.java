package data.excel;

import data.textfile.TextFile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExcelFile.create("testOutput/excel.xlsx")
                .setHeader("A", "B", "Steps")
                .writeData("1", "2", "Given user on homepage")
                .writeData("1", "2", "When  user search for \"mac\"")
                .writeData("1", "2", "Then  listed product count should be 4")
                .close();

        List<String> list = ExcelFile.create("testOutput/excel.xlsx").getColumn("Steps", 1);

        TextFile.create("testOutput/feature1.feature", true)
                .write("Feature: Future name")
                .write("Scenario: Scenario name")
                .write(list)
                .close();

    }
}