package demo.ml_order_list;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Jeferson Junior
 * 
 */
public class App 
{
	public static boolean usuarioLogado = false;
	
    public static void main( String[] args ) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Acessando pagina de login");
		driver.get("https://test.com/sign-in");
		
		while(usuarioLogado == false) {
			if(driver.getCurrentUrl().equals("https://test.com/home")) {
				usuarioLogado = true;
				break;
			}
			Thread.sleep(2000);
			System.out.println("Aguardando login");
		}
		
		System.out.println("Usuário logado!");
		

    }
}
