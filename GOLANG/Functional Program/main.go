package main

import "fmt"

func even(num int64) bool {
	if num % 2 == 0{
		return true
	}else{
		return false
	}
	
}

func main(){

	var array[]int64

	var a int64 = 0
	var b int64 = 1

	for i := 0; i < 10; i++ {
		a, b = b, a+b
		if even(b){
			array = append(array, b)
		}
	}
	var sum int64

	for i := 0; i < len(array);i++{
		sum += array[i]
	}
	fmt.Println(sum)

}