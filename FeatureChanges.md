# Features Supported:
  1. Align the "Equals symbol" by changing layout from `TableLayout` to `RelativeLayout` in `activity_main.xml`
  2. Added `colors.xml` file to `res/values`
  3. Added support for floating point arithmetic.

	a. Supported the period (.) button.

       b. Changed all calculation and memory variables and calculations to `double`.

       c. Standardizing display at the end of calculate to ensure that `"5.0"` is displayed as `"5"`. Added a method `standardizeDisplay()` for this.
  4. Initialized `currentDisplayText`, `currentDisplayMiniText`, `finalDisplayText` and `finalDisplayMiniText` using the value of `num1` instead of `""`. This ensures that starting off with a `+` as soon as the app is started does not cause an exception.
  5. Implemented functionality for calculation of reciprocals (1/x)
# Refactoring
## Completed:
  1. Renamed variables and methods in Calculator.java per Java naming standards.
## TBD:
  1. The display and the calculation pieces are mixed up. This needs to be fixed.
  2. Button handling can be done in a more object oriented way.
# Bugs
## Fixed:
  1. Fixed the mini_text dislay in Calculator.java
## Known:
  None :)
