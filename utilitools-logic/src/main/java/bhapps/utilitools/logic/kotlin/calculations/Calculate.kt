/*
    *
    * BH Apps
    * version 0.0.2
    * Contains methods for logical calculations, generations , validations
    * bhapps.utilitools.kotlin.logic.calculations
    *
*/

package bhapps.utilitools.logic.kotlin.calculations

import java.security.SecureRandom
import kotlin.random.Random

object Calculate {

    /*
        *
        * thingIsNotNull(any)
        * determine if passed var is not null
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.thingIsNotNull(any)
        * returns boolean
        *
    */
    fun thingIsNotNull(param: Any): Boolean {
        return if(param !=null) true else false
    }

    /*
        *
        * intIsMoreThanZero(int)
        * determine if passed Int is more than 0
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.intIsMoreThanZero(5)
        * returns boolean
        *
    */
    fun intIsMoreThanZero(int: Int): Boolean {
        return int < 0
    }

    fun intIsGreaterThanPassedInt(value: Int, greaterThan: Int): Boolean {
        return value > greaterThan
    }

    fun intIsLessThanPassedInt(value: Int, lessThan: Int): Boolean {
        return value < lessThan
    }

    /*
        *
        * intIsBetween(int, int, int)
        * determine if passed Int is between passed int range values
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.intIsBetween(5, 1, 9)
        * returns boolean
        *
    */
    fun intIsBetween(int: Int, minValueInclusive: Int, maxValueInclusive: Int): Boolean {
        return int >= minValueInclusive && int <= maxValueInclusive
    }

    /*
        *
        * floatIsBetween(float, double, double)
        * determine if passed Float is between passed double range values
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.floatIsBetween(5, 1, 9)
        * returns boolean
        *
    */
    fun floatIsBetween(float: Float, minValueInclusive: Double, maxValueInclusive: Double): Boolean {
        return float >= minValueInclusive && float <= maxValueInclusive
    }

    /*
        *
        * getRandomNumberInRangeUsingRandom(int, int)
        * return random int from int range values
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.getRandomNumberInRangeUsingRandom(1, 9)
        * returns int
        *
    */
    fun getRandomNumberInRangeUsingRandom(min: Int, max: Int): Int {
        require(min < max) {
            return 0
        }
        val r = Random
        return r.nextInt(max - min + 1) + min
    }

    /*
        *
        * generateRandomInt(int, int)
        * return random int from int range values
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.generateRandomInt(1, 9)
        * returns int
        *
    */
    fun generateRandomInt(min: Int, max: Int): Int {
        return min + (Math.random() * (max - min + 1)).toInt()
    }

    /*
        *
        * generateRandomLong(int, int)
        * return random long from int range values
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.generateRandomLong(1, 9)
        * returns long
        *
    */
    fun generateRandomLong(min: Int, max: Int): Long {
        return min.toLong() + (Math.random() * (max - min + 1)).toInt()
    }

    /*
        *
        * buildUniqueId(int)
        * return random string with length from passed int value
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.buildUniqueId(25)
        * returns string
        *
    */
    fun buildUniqueId(length: Int): String {
        var randomString = ""
        val chars =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890".toCharArray()
        val random = SecureRandom()
        for (i in 0 until length) {
            randomString = randomString + chars[random.nextInt(chars.size)]
        }
        return randomString
    }

    /*
        *
        * calculateValueOfPercentageOfTotalPassed(float, int)
        * return the value of a total using a percentage
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.calculateValueOfPercentageOfTotalPassed(25, 355)
        * returns Int
        *
    */
    fun calculateValueOfPercentageOfTotalPassed(percentage: Float, total: Int): Int {
        var result = 0
        result = (total * (percentage / 100)).toInt()
        return  result
    }

    /*
        *
        * getThePercentageOfValueOfTotalFromPassedValue(int, int)
        * return the percentage of a total using a value passed
        * bhapps.utilitools.logic.kotlin.calculations.Calculate.getThePercentageOfValueOfTotalFromPassedValue(int, int)
        * whats 30 out of 250 as a percentage
        * returns Int
        *
    */
    fun getThePercentageOfValueOfTotalFromPassedValue(value: Int, total: Int): Int {
        var result = 0
        result = (100 * value / total)
        return  result
    }

}