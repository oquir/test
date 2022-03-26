package com.tdea.parcial.gluecode;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver;

    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    String Tiempodeldia;
    int hora;

    @Given("nos dan {int}")
    public void nos_dan1(Integer hora) {
        this.hora = hora;
    }
    @When("verificamos si es Night")
    public void verificamos_si_es_night() {
        Tiempodeldia = Utils.getTimeOfDay(hora);
    }
    @Then("obtenemos que es de Night")
    public void obtenemos_que_es_de_night() {
        Assertions.assertEquals(Tiempodeldia, "Night");
    }


    @When("verificamos si es Morning")
    public void verificamos_si_es_morning() {
        Tiempodeldia = Utils.getTimeOfDay(hora);
    }
    @Then("obtenemos que es de Morning")
    public void obtenemos_que_es_de_morning() {
        Assertions.assertEquals(Tiempodeldia, "Morning");
    }


    @When("verificamos si es Afternoon")
    public void verificamos_si_es_afternoon() {
        Tiempodeldia = Utils.getTimeOfDay(hora);
    }
    @Then("obtenemos que es de Afternoon")
    public void obtenemos_que_es_de_afternoon() {
        Assertions.assertEquals(Tiempodeldia, "Afternoon");
    }


    @When("verificamos si es Evening")
    public void verificamos_si_es_evening() {
        Tiempodeldia = Utils.getTimeOfDay(hora);
    }
    @Then("obtenemos que es de Evening")
    public void obtenemos_que_es_de_evening() {
        Assertions.assertEquals(Tiempodeldia, "Evening");
    }


    @When("verificamos si es Invalid hour")
    public void verificamos_si_es_invalid_hour() {
        Tiempodeldia = Utils.getTimeOfDay(hora);
    }
    @Then("obtenemos que es de Invalid hour")
    public void obtenemos_que_es_de_invalid_hour() {
        Assertions.assertEquals(Tiempodeldia, "Invalid hour");
    }
}
