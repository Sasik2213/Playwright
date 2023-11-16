package org.playwright.learnings;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Demo {
	
	public static void main(String[] args) {
		
		Playwright playWright = Playwright.create();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println(width+" "+height);
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.google.com");
		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize((int)width,(int)height));
		System.out.println(page.title());
//		page.close();
//		playWright.close();
		
		
	}

}
