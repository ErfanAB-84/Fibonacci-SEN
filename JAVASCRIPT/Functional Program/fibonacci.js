const FibonacciSeqNumber = (number) => {

    return Math.round(Math.pow((Math.sqrt(5)+1)/2, number) / Math.sqrt(5));

}

const FibonacciSeq = (max, min = 0) => {

    let result = [];

    for (i = min; i <= max; i++) {

        result.push(FibonacciSeqNumber(i));

    }

    return result;

}

console.log(FibonacciSeq(10));