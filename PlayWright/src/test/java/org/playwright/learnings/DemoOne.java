package org.playwright.learnings;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DemoOne {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		ArrayList<String> argm = new ArrayList<String>();
		argm.add("--start-maximized");
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(argm));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page pages = context.newPage();
		pages.navigate("https://www.google.com");
	}
}
