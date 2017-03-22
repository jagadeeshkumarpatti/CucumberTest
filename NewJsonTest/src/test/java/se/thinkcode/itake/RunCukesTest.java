package se.thinkcode.itake;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options( format={"json:target/Destination/cucumber.json"}) 
public class RunCukesTest {
}