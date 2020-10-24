package tests;


import entities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DesafioCadastroPage;
//@Listeners(TM4JTestNGListener.class)

public class DesafioAutomacaoTest extends BaseTest {

    String nome ="Henrique";
    String sobrenome = "de Lima Barroso";
    String sugestoes = "Este é um teste automatizado!!!!!";


    @Test
    public void deveCadastrarPessoaExemplo(){
        DesafioCadastroPage cp = new DesafioCadastroPage(getDriver());
                 cp.preencherNome(nome)
                         .preencherSobrenome(sobrenome)
                         .clicarSexoMasc()
                         .clicarCarne()
                         .clicarFrango()
                         .clicarPizza()
                         .clicarSuperior()
                         .clicarFutebol()
                         .preencherSugestoes(sugestoes)
                         .clicarCadastrar();



        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descNome\"]/span")).getText(), nome);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSobrenome\"]/span")).getText(), sobrenome);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSexo\"]/span")).getText(), "Masculino");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descComida\"]/span")).getText(), "Carne Frango Pizza");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descEscolaridade\"]/span")).getText(), "superior");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descEsportes\"]/span")).getText(), "Futebol");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSugestoes\"]/span")).getText(), sugestoes);




    }





}
