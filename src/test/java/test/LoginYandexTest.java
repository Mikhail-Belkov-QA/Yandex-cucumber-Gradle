package test;


import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.jupiter.api.*;


import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static test.BaseTest.loginPage;

@Tag("UiYandex")


public class LoginYandexTest { //extends BaseTest {

    /**
     * тестовый метод для осуществления аутентификации аккаунта
     */
  /* @Test
    @DisplayName("Мой тест - авторизация аккаунта Яндекс (по почте)")
   @Step ("Ввод логина")*/
    @When("Заполняем логин и пароль")
     public void loginTestwqwewqeqweqe() {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        //вводим логин
        step ("Задать логин", () ->
     { loginPage.inputLogin(ConfProperties.getProperty("login"));});
          //нажимаем кнопку входа
        step ("Нажать на кнопку", () ->
        {  loginPage.clickLoginBtn();});
          //вводим пароль
        step ("Задать пароль", () ->
        {  loginPage.inputPasswd(ConfProperties.getProperty("password"));});

        //нажимаем кнопку входа
        step ("Нажать на кнопку", () ->
        {   loginPage.clickLoginBtn();});


    }
    }

