package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesafioCadastroPage extends BasePage {


    public DesafioCadastroPage(WebDriver driver) {
        super(driver);
    }

    //Elementos que contem os resultados finais do cadastro
    @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;

    @FindBy(id = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;

    @FindBy(id = "elementosForm:sexo:0")
    private WebElement sexoMasc;

    @FindBy(id = "elementosForm:comidaFavorita:0")
    private WebElement carne;

    @FindBy(id = "elementosForm:comidaFavorita:1")
    private WebElement frango;

    @FindBy(id = "elementosForm:comidaFavorita:2")
    private WebElement pizza;

    @FindBy(xpath = "//*[@id=\"elementosForm:escolaridade\"]/option[5]")
    private WebElement superior;

    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[2]")
    private WebElement futebol;

    @FindBy(id = "elementosForm:sugestoes")
    private WebElement sugestoesTextField;

    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;



    //métodos que capturam os valores destes elementos
    public DesafioCadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }
    public DesafioCadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }
    public DesafioCadastroPage clicarSexoMasc() {
        sexoMasc.click();
        return this;
    }

    public DesafioCadastroPage clicarCarne() {
        carne.click();
        return this;
    }

    public DesafioCadastroPage clicarFrango() {
        frango.click();
        return this;
    }

    public DesafioCadastroPage clicarPizza() {
        pizza.click();
        return this;
    }

    public DesafioCadastroPage clicarSuperior() {
        superior.click();
        return this;
    }

    public DesafioCadastroPage clicarFutebol() {
        futebol.click();
        return this;
    }

    public DesafioCadastroPage preencherSugestoes(String sugestoes) {
        sugestoesTextField.sendKeys(sugestoes);
        return this;
    }

    public DesafioCadastroPage clicarCadastrar() {
        cadastrarButton.click();
        return this;
    }


}
