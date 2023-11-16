package org.playwright.learnings;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DemoTwo {
	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
//		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe")));
		BrowserContext bType = playwright.chromium().launchPersistentContext(Paths.get(""),new BrowserType.LaunchPersistentContextOptions().setChannel("msedge").setHeadless(false));
		Page page = bType.newPage();
		page.navigate("https://www.google.com");
		Thread.sleep(2000);
		page.reload();
		Thread.sleep(2000);
		page.goBack();
		Thread.sleep(2000);
		page.goForward();
		
//		bType.close();
//		playwright.close();
	}

}
