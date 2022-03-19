package example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

class Greeting {

  def name, res;

  @Given("^Name$")
  def createName(): Unit = {
     name = "Steve";
  }

  @When("^Pass name to function$")
  def passName(): Unit = {
     res = example.Greeting.greeting(name);
  }

  @Then("^Response should be hello world Steve$")
  def checkMessage(): Unit = {
     Assertions.assertEquals(res, "Hello World, Steve");
  }
}
