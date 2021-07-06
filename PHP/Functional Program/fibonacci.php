<?php

function FibonacciSeqNumber($number) {

    return round(pow((sqrt(5)+1)/2, $number) / sqrt(5));

}

function FibonacciSeq($max, $min = 0) {

    $result = [];

    for ($i = $min; $i <= $max; $i++) {

        $result[] = FibonacciSeqNumber($i);

    }

    return $result;

}

print_r(FibonacciSeq(10));