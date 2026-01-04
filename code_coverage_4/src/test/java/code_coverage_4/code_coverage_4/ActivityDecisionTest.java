package code_coverage_4.code_coverage_4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ActivityDecisionTest {
        @Test
        public void Walking_1_Midnight_1_Raining_1() {
            ActivityDecision activityDecision = new ActivityDecision();
            activityDecision.Walking = true;
            activityDecision.Midnight = true;
            activityDecision.Raining = true;
            activityDecision.Sunshine = false;
            activityDecision.Running = false;

            String result = activityDecision.decideActivity();
            String expected = "Take umbrella and searchlight";

            assertEquals(expected, result);
        }

        @Test
        public void Walking_1_Midnight_1_Raining_0() {
            ActivityDecision activityDecision = new ActivityDecision();
            activityDecision.Walking = true;
            activityDecision.Midnight = true;
            activityDecision.Raining = false;
            activityDecision.Sunshine = false;
            activityDecision.Running = false;

            String result = activityDecision.decideActivity();
            String expected = "Take searchlight";

            assertEquals(expected, result);
        }

        @Test
        public void Running_1_Sunshine_1_Raining_1() {
            ActivityDecision activityDecision = new ActivityDecision();
            activityDecision.Walking = false;
            activityDecision.Midnight = false;
            activityDecision.Raining = true;
            activityDecision.Sunshine = true;
            activityDecision.Running = true;


            String result = activityDecision.decideActivity();
            String expected = "Take umbrella";

            assertEquals(expected, result);
        }

        @Test
        public void Running_1_Sunshine_1_Raining_0() {
            ActivityDecision activityDecision = new ActivityDecision();
            activityDecision.Walking = false;
            activityDecision.Midnight = false;
            activityDecision.Raining = false;
            activityDecision.Sunshine = true;
            activityDecision.Running = true;

            String result = activityDecision.decideActivity();
            String expected = "Keep doing what you were doing";

            assertEquals(expected, result);
        }
        @Test
        public void Walking_1_Midnight_0_Raining_0_Sunshine_0_Running_0() {
            ActivityDecision activityDecision = new ActivityDecision();
            activityDecision.Walking = true;
            activityDecision.Midnight = false;
            activityDecision.Raining = false;
            activityDecision.Sunshine = false;
            activityDecision.Running = false;

            String result = activityDecision.decideActivity();
            String expected = "Keep doing what you were doing";

            assertEquals(expected, result);
        }
        @Test
        public void Walking_0_Midnight_0_Raining_0_Sunshine_1_Running_0() {
            ActivityDecision activityDecision = new ActivityDecision();
            activityDecision.Walking = false;
            activityDecision.Midnight = false;
            activityDecision.Raining = false;
            activityDecision.Sunshine = true;
            activityDecision.Running = false;

            String result = activityDecision.decideActivity();
            String expected = "Keep doing what you were doing";

            assertEquals(expected, result);
        }

}