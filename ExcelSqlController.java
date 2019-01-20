package com.app.controller;

import java.io.File;
import java.io.IOException;

import com.jfinal.aop.Clear;
import com.jfinal.sssssssssscore.Controller;
import com.jfinal.upload.UploadFile;
import com.util.ExcelSqlUtil;

@Clear
public class ExcelSqlController extends Controller{
	//http://localhost:82/jfinal_demo/view/
	public void index(){
		ExcelSqlUtil esu=new ExcelSqlUtil();
		File file = new File("F:\\药库历史盘存表.xlsx");
		try {
			esu.ExcelToList(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		render("index.jsp");
	}
	
	public void upExcel(){
		UploadFile files = getFile(getPara("file"));
		System.out.println(files.getFileName());
		render("index.jsp");
	}
	
}
