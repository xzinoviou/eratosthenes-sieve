package com.xzinoviou.eratosthenessieve.algorithm.draft.initial

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class GeneratePrimesSpec extends Specification {

    def "GeneratePrimes - Initial Draft"() {
        expect:
        def result = GeneratePrimes.generatePrimes(maxValue)
        result.length == countOfPrimes

        where:
        maxValue | countOfPrimes
        0        | 0
        1        | 0
        2        | 1
        100      | 25
        500      | 95
    }
}
