package com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.versionfinal

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class PrimeGeneratorSpec extends Specification {
    def "GeneratePrimes - Final Version"() {
        expect:
        def result = com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version2.PrimeGenerator.generatePrimes(maxValue)
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
