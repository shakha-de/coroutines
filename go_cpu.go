package main

import (
	"fmt"
	"sync"
	"time"
)

func worker(wg *sync.WaitGroup) {
	defer wg.Done()
	sum := 0
	for i := 0; i < 1_000_000; i++ {
		sum += i
	}
	_ = sum
}

func main() {
	const N = 10_000
	var wg sync.WaitGroup
	wg.Add(N)

	start := time.Now()

	for i := 0; i < N; i++ {
		go worker(&wg)
	}

	wg.Wait()
	elapsed := time.Since(start)

	fmt.Printf("Go: Finished %d goroutines (CPU-bound) in %v\n", N, elapsed)
}